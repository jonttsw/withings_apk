package com.withings.webservices.legacy;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.withings.webservices.legacy.common.AppQueryParamInterceptor;
import com.withings.webservices.legacy.common.BlockBackgroundCallsInterceptor;
import com.withings.webservices.legacy.common.CallContextInterceptor;
import com.withings.webservices.legacy.common.CompositeInterceptor;
import com.withings.webservices.legacy.common.DateTimeSerializer;
import com.withings.webservices.legacy.common.DateTimeZoneSerializer;
import com.withings.webservices.legacy.common.DurationSerializer;
import com.withings.webservices.legacy.common.LogInterceptor;
import com.withings.webservices.legacy.common.NoBodyOkClient;
import com.withings.webservices.legacy.common.ProgressDownload;
import com.withings.webservices.legacy.common.SessionIdProvider;
import com.withings.webservices.legacy.common.SessionInterceptor;
import com.withings.webservices.legacy.common.WSHandlerDelegate;
import com.withings.webservices.legacy.common.WsConverter;
import com.withings.webservices.legacy.common.WsErrorHandler;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.sync.ApiBuilder;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import com.withings.webservices.legacy.withings.model.ImagesP4Deserializer;
import com.withings.webservices.legacy.withings.model.LastUpdate;
import com.withings.webservices.legacy.withings.model.airable.WsAirableNode;
import com.withings.webservices.legacy.withings.model.leaderboard.Invitation;
import com.withings.webservices.legacy.withings.model.measure.HFMeasureResponse;
import com.withings.webservices.legacy.withings.model.measure.HFMeasureResponseDeserializer;
import com.withings.webservices.legacy.withings.model.measure.MeasureGroupResponse;
import com.withings.webservices.legacy.withings.model.measure.MeasureGroupResponseDeserializer;
import com.withings.webservices.legacy.withings.model.measure.StoreMeasureResponse;
import com.withings.webservices.legacy.withings.model.measure.StoreMeasureResponseDeserializer;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import com.withings.webservices.legacy.withings.model.session.AccountSessionDeserializer;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import com.withings.webservices.legacy.withings.model.session.DeviceSessionDeserializer;
import com.withings.webservices.legacy.withings.model.session.Session;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import u70.a;
/* loaded from: classes4.dex */
public class Webservices {
    private static final int DOWNLOAD_TIMEOUT_SECONDS = 8;
    private static Webservices instance;
    private final a backgroundManager;
    private BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor;
    private OkClient client;
    private final Delegate delegate;
    private Map<Type, JsonDeserializer> deserializers = new HashMap();

    /* loaded from: classes4.dex */
    public interface Delegate {
        String getAppName();

        int getAppVersion();

        Context getContext();

        WSHandlerDelegate getDefaultWSHandlerDelegate();

        RestAdapter.LogLevel getLogLevel();

        String getMainRootUrl();

        SessionIdProvider getSessionIdProvider();

        boolean shouldFailOnSimpleCallContext();
    }

    /* loaded from: classes4.dex */
    public class WithingsApiBuilder implements ApiBuilder {
        private String endPoint;
        private WSHandlerDelegate errorDelegate;
        private RestAdapter.LogLevel logLevel;
        private SessionIdProvider sessionIdProvider;
        private boolean shouldFailOnSimpleCallContext;
        private String syncContext;

        /* synthetic */ WithingsApiBuilder(Webservices webservices, int i11) {
            this();
        }

        private RequestInterceptor getInterceptor() {
            CompositeInterceptor compositeInterceptor = new CompositeInterceptor();
            compositeInterceptor.addInterceptor(Webservices.this.blockBackgroundCallsInterceptor);
            compositeInterceptor.addInterceptor(new AppQueryParamInterceptor(Webservices.this.delegate.getContext().getString(R.string._LANG_CODE_), Webservices.this.delegate.getAppName(), Webservices.this.delegate.getAppVersion()));
            compositeInterceptor.addInterceptor(new CallContextInterceptor(Webservices.this.backgroundManager, this.syncContext, this.shouldFailOnSimpleCallContext));
            SessionIdProvider sessionIdProvider = this.sessionIdProvider;
            if (sessionIdProvider != null) {
                compositeInterceptor.addInterceptor(new SessionInterceptor(sessionIdProvider));
            }
            return compositeInterceptor;
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public <A> A build(Class<A> cls) {
            return (A) new RestAdapter.Builder().setClient(Webservices.this.getOkClient()).setConverter(new WsConverter(Webservices.this.getGson())).setLogLevel(this.logLevel).setEndpoint(this.endPoint).setRequestInterceptor(getInterceptor()).setErrorHandler(new WsErrorHandler(this.sessionIdProvider, Webservices.this.blockBackgroundCallsInterceptor, this.errorDelegate)).build().create(cls);
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public void mockError(int i11, WSHandlerDelegate wSHandlerDelegate) {
            this.errorDelegate = wSHandlerDelegate;
            wSHandlerDelegate.onErrorHandler(i11);
        }

        private WithingsApiBuilder() {
            this.endPoint = Webservices.this.delegate.getMainRootUrl();
            this.logLevel = Webservices.this.delegate.getLogLevel();
            this.shouldFailOnSimpleCallContext = Webservices.this.delegate.shouldFailOnSimpleCallContext();
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public WithingsApiBuilder setAccountSessionProvider() {
            return setSessionIdProvider(Webservices.this.delegate.getSessionIdProvider());
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public WithingsApiBuilder setEndpoint(String str) {
            this.endPoint = str;
            return this;
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public WithingsApiBuilder setHandlerErrorDelegate(WSHandlerDelegate wSHandlerDelegate) {
            this.errorDelegate = wSHandlerDelegate;
            return this;
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public WithingsApiBuilder setLogLevel(RestAdapter.LogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public WithingsApiBuilder setSessionIdProvider(SessionIdProvider sessionIdProvider) {
            this.sessionIdProvider = sessionIdProvider;
            return this;
        }

        @Override // com.withings.webservices.legacy.sync.ApiBuilder
        public WithingsApiBuilder setSyncContext(String str) {
            this.syncContext = str;
            return this;
        }
    }

    public Webservices(Delegate delegate, a aVar) {
        this.delegate = delegate;
        this.backgroundManager = aVar;
        this.blockBackgroundCallsInterceptor = new BlockBackgroundCallsInterceptor(aVar);
    }

    public static Webservices get() {
        return instance;
    }

    private GsonBuilder getGsonBuilder() {
        GsonBuilder registerTypeAdapter = new GsonBuilder().registerTypeAdapter(Session.class, new AccountSessionDeserializer()).registerTypeAdapter(AccountSession.class, new AccountSessionDeserializer()).registerTypeAdapter(DeviceSession.class, new DeviceSessionDeserializer()).registerTypeAdapter(MeasureGroupResponse.class, new MeasureGroupResponseDeserializer()).registerTypeAdapter(StoreMeasureResponse.class, new StoreMeasureResponseDeserializer()).registerTypeAdapter(HFMeasureResponse.class, new HFMeasureResponseDeserializer()).registerTypeAdapter(LastUpdate.class, new LastUpdate.Deserializer()).registerTypeAdapter(com.withings.webservices.legacy.lastupdate.LastUpdate.class, new LastUpdate.Deserializer()).registerTypeAdapter(DateTime.class, new DateTimeSerializer()).registerTypeAdapter(Duration.class, new DurationSerializer()).registerTypeAdapter(DateTimeZone.class, new DateTimeZoneSerializer()).registerTypeAdapter(ImagesP4.class, new ImagesP4Deserializer()).registerTypeAdapter(Invitation.class, new Invitation.Deserializer()).registerTypeAdapter(WsAirableNode.class, new WsAirableNode.Deserializer());
        for (Map.Entry entry : new HashMap(this.deserializers).entrySet()) {
            registerTypeAdapter.registerTypeAdapter((Type) entry.getKey(), entry.getValue());
        }
        return registerTypeAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OkClient getOkClient() {
        if (this.client == null) {
            this.client = new NoBodyOkClient(getOkHttpClient());
        }
        return this.client;
    }

    private OkHttpClient getOkHttpClient() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            OkHttpClient okHttpClient = new OkHttpClient();
            okHttpClient.setSslSocketFactory(sSLContext.getSocketFactory());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            okHttpClient.setConnectTimeout(10L, timeUnit);
            okHttpClient.setReadTimeout(10L, timeUnit);
            okHttpClient.setWriteTimeout(10L, timeUnit);
            okHttpClient.interceptors().add(new LogInterceptor());
            return okHttpClient;
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    public static Webservices init(Delegate delegate, a aVar) {
        Webservices webservices = new Webservices(delegate, aVar);
        instance = webservices;
        return webservices;
    }

    public ByteBuffer download(String str) throws IOException {
        Request build = new Request.Builder().url(str).build();
        OkHttpClient okHttpClient = getOkHttpClient();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        okHttpClient.setConnectTimeout(8L, timeUnit);
        okHttpClient.setReadTimeout(8L, timeUnit);
        Response execute = okHttpClient.newCall(build).execute();
        if (execute.isSuccessful()) {
            return ByteBuffer.wrap(execute.body().bytes());
        }
        throw new IOException(String.format("Unable to download content of url : %s (%d : %s)", str, Integer.valueOf(execute.code()), execute.message()));
    }

    public ApiBuilder getApiBuilder() {
        return new WithingsApiBuilder(this, 0);
    }

    public <A> A getApiForAccount(Class<A> cls) {
        return (A) getApiBuilder().setAccountSessionProvider().setHandlerErrorDelegate(this.delegate.getDefaultWSHandlerDelegate()).build(cls);
    }

    public Delegate getDelegate() {
        return this.delegate;
    }

    public Gson getGson() {
        return getGsonBuilder().create();
    }

    public void registerTypeAdapter(Type type, JsonDeserializer jsonDeserializer) {
        this.deserializers.put(type, jsonDeserializer);
    }

    public <A> A getApiForAccount(Class<A> cls, String str) {
        return (A) getApiBuilder().setAccountSessionProvider().setHandlerErrorDelegate(this.delegate.getDefaultWSHandlerDelegate()).setSyncContext(str).build(cls);
    }

    public ByteBuffer download(String str, ProgressDownload.Listener listener) throws IOException {
        Request build = new Request.Builder().url(str).build();
        OkHttpClient okHttpClient = getOkHttpClient();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        okHttpClient.setConnectTimeout(8L, timeUnit);
        okHttpClient.setReadTimeout(8L, timeUnit);
        return new ProgressDownload(okHttpClient, build, listener).download();
    }
}
