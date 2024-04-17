package com.withings.device.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import s00.a;
import s00.b;
import s00.d;
import s00.e;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010^\u001a\u00020]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bg\u0010hJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001f\u0010 J*\u0010#\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b#\u0010$J*\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b*\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010,H\u0096@¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b0\u00101J$\u00104\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208H\u0096@¢\u0006\u0004\b9\u0010.J4\u0010=\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020;0:H\u0096@¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u00020?2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b@\u00101J~\u0010L\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020'2\u0006\u0010H\u001a\u00020'2\u0006\u0010I\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00022\b\u0010J\u001a\u0004\u0018\u00010\u000e2\b\u0010K\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0004\bL\u0010MJ \u0010N\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u000eH\u0096@¢\u0006\u0004\bN\u0010OJ \u0010Q\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u000eH\u0096@¢\u0006\u0004\bQ\u0010OJ$\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010R\u001a\u00020\u00122\b\u0010S\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\bU\u0010VJ\"\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010aR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/withings/device/ws/RetrofitDeviceRemoteRepository;", "Lcom/withings/device/ws/DeviceRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/device/ws/DeviceRemoteRepository;", "Ls00/e;", "sessionIdProvider", "withSessionIdProvider", "(Ls00/e;)Lcom/withings/device/ws/DeviceRemoteRepository;", "enrich", "Lcom/withings/device/ws/Associations;", "getAssociations", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "type", "getAssociationsByType", "(ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "deviceId", "getAssociationForDevice", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "deviceSession", "timezone", "carrierCountryCode", "deviceCountryCode", "Lnm0/y;", "createAssociation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "associationId", "accountId", "deleteAssociation", "(JJJLqm0/d;)Ljava/lang/Object;", "name", "data", "updateAssociation", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", NavigationArguments.USER_ID, "deviceType", "", ConstantsWs.SYNC_PROCESS_ALL, "Lcom/withings/device/ws/Links;", "getUserLinks", "(JLjava/lang/Integer;ZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/Link;", "getDeviceLink", "(Lqm0/d;)Ljava/lang/Object;", "linkId", "deleteLink", "(Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "sessionIdDevice", "Lcom/withings/device/ws/StoreLink;", "storeLink", "(Ljava/lang/String;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "resetDevice", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/DeviceSettings;", "getSettings", "", "", "options", "setSettings", "(JILjava/util/Map;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/DeviceProperties;", "getProperties", "", "latitude", "longitude", "impedancemeter", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "prefLang", "micMute", "isExtraSensitivityEnabled", "measurementIntervalTime", "classification", "vuMeter", "updateProperties", "(JDDLjava/lang/String;JJLjava/lang/String;ZZILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lqm0/d;)Ljava/lang/Object;", "notifySetup", "(JILqm0/d;)Ljava/lang/Object;", "network", "updateNetwork", "softVersion", "httpsLink", "Lcom/withings/device/ws/FirmwareUpgrade;", "getFirmwareUpgrade", "(JLjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/device/ws/SharePublicKey;", "createPublicKey", "(JJLqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/d$b;", "sensitiveActionsErrorHandler", "Ls00/d$b;", "Ljava/lang/String;", "Ls00/e;", "Ls00/a;", "Lcom/withings/device/ws/DeviceApi;", "Lcom/withings/device/ws/DeviceRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ls00/d$b;Ljava/lang/String;Ls00/e;)V", "device-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitDeviceRemoteRepository implements DeviceRemoteRepository {
    private final b compatWebservicesFactory;
    private final a<DeviceApi, DeviceRetrofit2Api> compatWs;
    private final d.b sensitiveActionsErrorHandler;
    private final e sessionIdProvider;
    private final String syncContext;

    public RetrofitDeviceRemoteRepository(b compatWebservicesFactory, d.b sensitiveActionsErrorHandler, String str, e eVar) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        u.j(sensitiveActionsErrorHandler, "sensitiveActionsErrorHandler");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.sensitiveActionsErrorHandler = sensitiveActionsErrorHandler;
        this.syncContext = str;
        this.sessionIdProvider = eVar;
        this.compatWs = compatWebservicesFactory.a(str, DeviceApi.class, DeviceRetrofit2Api.class);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object createAssociation(String str, String str2, String str3, String str4, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$createAssociation$2(str, str2, str3, str4), new RetrofitDeviceRemoteRepository$createAssociation$3(str, str2, str3, str4, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object createPublicKey(long j5, long j11, qm0.d<? super SharePublicKey> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$createPublicKey$2(j5, j11), new RetrofitDeviceRemoteRepository$createPublicKey$3(j5, j11, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object deleteAssociation(long j5, long j11, long j12, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$deleteAssociation$2(j5, j11, j12), new RetrofitDeviceRemoteRepository$deleteAssociation$3(j5, j11, j12, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object deleteLink(Long l5, qm0.d<? super y> dVar) {
        if (this.sessionIdProvider != null) {
            Object a11 = a.a(this.compatWs, new RetrofitDeviceRemoteRepository$deleteLink$2(l5), new RetrofitDeviceRemoteRepository$deleteLink$3(l5, null), null, this.sessionIdProvider, true, dVar, 188);
            if (a11 == CoroutineSingletons.f76214a) {
                return a11;
            }
            return y.f85009a;
        }
        Object d11 = a.d(this.compatWs, new RetrofitDeviceRemoteRepository$deleteLink$4(l5), new RetrofitDeviceRemoteRepository$deleteLink$5(l5, null), null, true, dVar, 124);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return y.f85009a;
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getAssociationForDevice(long j5, String str, qm0.d<? super Associations> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$getAssociationForDevice$2(j5, str), new RetrofitDeviceRemoteRepository$getAssociationForDevice$3(j5, str, null), null, false, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getAssociations(String str, qm0.d<? super Associations> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$getAssociations$2(str), new RetrofitDeviceRemoteRepository$getAssociations$3(str, null), null, false, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getAssociationsByType(int i11, String str, qm0.d<? super Associations> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$getAssociationsByType$2(i11, str), new RetrofitDeviceRemoteRepository$getAssociationsByType$3(i11, str, null), null, false, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getDeviceLink(qm0.d<? super Link> dVar) {
        if (this.sessionIdProvider != null) {
            Object a11 = a.a(this.compatWs, RetrofitDeviceRemoteRepository$getDeviceLink$2.INSTANCE, new RetrofitDeviceRemoteRepository$getDeviceLink$3(null), null, this.sessionIdProvider, false, dVar, 188);
            if (a11 == CoroutineSingletons.f76214a) {
                return a11;
            }
            return (Link) a11;
        }
        Object d11 = a.d(this.compatWs, RetrofitDeviceRemoteRepository$getDeviceLink$4.INSTANCE, new RetrofitDeviceRemoteRepository$getDeviceLink$5(null), null, false, dVar, 124);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return (Link) d11;
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getFirmwareUpgrade(long j5, Integer num, qm0.d<? super FirmwareUpgrade> dVar) {
        if (this.sessionIdProvider != null) {
            Object a11 = a.a(this.compatWs, new RetrofitDeviceRemoteRepository$getFirmwareUpgrade$2(j5, num), new RetrofitDeviceRemoteRepository$getFirmwareUpgrade$3(j5, num, null), null, this.sessionIdProvider, false, dVar, 188);
            if (a11 == CoroutineSingletons.f76214a) {
                return a11;
            }
            return (FirmwareUpgrade) a11;
        }
        Object d11 = a.d(this.compatWs, new RetrofitDeviceRemoteRepository$getFirmwareUpgrade$4(j5, num), new RetrofitDeviceRemoteRepository$getFirmwareUpgrade$5(j5, num, null), null, false, dVar, 124);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return (FirmwareUpgrade) d11;
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getProperties(Long l5, qm0.d<? super DeviceProperties> dVar) {
        if (this.sessionIdProvider != null) {
            Object a11 = a.a(this.compatWs, new RetrofitDeviceRemoteRepository$getProperties$2(l5), new RetrofitDeviceRemoteRepository$getProperties$3(l5, null), null, this.sessionIdProvider, false, dVar, 188);
            if (a11 == CoroutineSingletons.f76214a) {
                return a11;
            }
            return (DeviceProperties) a11;
        }
        Object d11 = a.d(this.compatWs, new RetrofitDeviceRemoteRepository$getProperties$4(l5), new RetrofitDeviceRemoteRepository$getProperties$5(l5, null), null, false, dVar, 124);
        if (d11 == CoroutineSingletons.f76214a) {
            return d11;
        }
        return (DeviceProperties) d11;
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getSettings(qm0.d<? super DeviceSettings> dVar) {
        return a.d(this.compatWs, RetrofitDeviceRemoteRepository$getSettings$2.INSTANCE, new RetrofitDeviceRemoteRepository$getSettings$3(null), null, false, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object getUserLinks(long j5, Integer num, boolean z5, qm0.d<? super Links> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$getUserLinks$2(j5, num, z5), new RetrofitDeviceRemoteRepository$getUserLinks$3(j5, num, z5, null), null, false, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object notifySetup(long j5, int i11, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$notifySetup$2(j5, i11), new RetrofitDeviceRemoteRepository$notifySetup$3(j5, i11, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object resetDevice(long j5, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$resetDevice$2(j5), new RetrofitDeviceRemoteRepository$resetDevice$3(j5, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object setSettings(long j5, int i11, Map<String, ? extends Object> map, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$setSettings$2(j5, i11, map), new RetrofitDeviceRemoteRepository$setSettings$3(j5, i11, map, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object storeLink(String str, Long l5, qm0.d<? super StoreLink> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$storeLink$2(str, l5), new RetrofitDeviceRemoteRepository$storeLink$3(str, l5, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object updateAssociation(long j5, String str, String str2, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$updateAssociation$2(j5, str, str2), new RetrofitDeviceRemoteRepository$updateAssociation$3(j5, str, str2, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object updateNetwork(long j5, int i11, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$updateNetwork$2(j5, i11), new RetrofitDeviceRemoteRepository$updateNetwork$3(j5, i11, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public Object updateProperties(long j5, double d11, double d12, String str, long j11, long j12, String str2, boolean z5, boolean z11, int i11, String str3, Integer num, Boolean bool, qm0.d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitDeviceRemoteRepository$updateProperties$2(j5, d11, d12, str, j11, j12, str2, z5, z11, i11, str3, num, bool), new RetrofitDeviceRemoteRepository$updateProperties$3(j5, d11, d12, str, j11, j12, str2, z5, z11, i11, str3, num, bool, null), null, true, dVar, 124);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public DeviceRemoteRepository withSessionIdProvider(e sessionIdProvider) {
        u.j(sessionIdProvider, "sessionIdProvider");
        return new RetrofitDeviceRemoteRepository(this.compatWebservicesFactory, this.sensitiveActionsErrorHandler, this.syncContext, sessionIdProvider);
    }

    @Override // com.withings.device.ws.DeviceRemoteRepository
    public DeviceRemoteRepository withSyncContext(String str) {
        return new RetrofitDeviceRemoteRepository(this.compatWebservicesFactory, this.sensitiveActionsErrorHandler, str, null, 8, null);
    }

    public /* synthetic */ RetrofitDeviceRemoteRepository(b bVar, d.b bVar2, String str, e eVar, int i11, m mVar) {
        this(bVar, bVar2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : eVar);
    }
}
