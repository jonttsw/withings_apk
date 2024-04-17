package com.withings.screen.repository.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.screen.model.DeviceScreenContentResponse;
import com.withings.screen.model.DeviceScreenResponse;
import com.withings.screen.model.StoreDeviceScreenResponse;
import com.withings.screen.repository.DeviceScreensRemoteRepository;
import com.withings.screen.repository.ws.api.DeviceScreensRetrofit1Api;
import com.withings.screen.repository.ws.api.DeviceScreensRetrofit2Api;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitDeviceScreensRemoteRepository.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\nJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/withings/screen/repository/ws/RetrofitDeviceScreensRemoteRepository;", "Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "", NavigationArguments.USER_ID, "Lcom/withings/screen/model/DeviceScreenResponse;", "getDevicesScreens", "(JLqm0/d;)Ljava/lang/Object;", "deviceId", "Lcom/withings/screen/model/DeviceScreenContentResponse;", "getDeviceScreensContents", "screenIds", "Lcom/withings/screen/model/StoreDeviceScreenResponse;", "saveDeviceScreens", "(JLjava/lang/Long;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebServicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/screen/repository/ws/api/DeviceScreensRetrofit1Api;", "Lcom/withings/screen/repository/ws/api/DeviceScreensRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitDeviceScreensRemoteRepository implements DeviceScreensRemoteRepository {
    private final a<DeviceScreensRetrofit1Api, DeviceScreensRetrofit2Api> compatWS;
    private final b compatWebServicesFactory;

    public RetrofitDeviceScreensRemoteRepository(b compatWebServicesFactory, String str) {
        u.j(compatWebServicesFactory, "compatWebServicesFactory");
        this.compatWebServicesFactory = compatWebServicesFactory;
        this.compatWS = compatWebServicesFactory.a(str, DeviceScreensRetrofit1Api.class, DeviceScreensRetrofit2Api.class);
    }

    @Override // com.withings.screen.repository.DeviceScreensRemoteRepository
    public Object getDeviceScreensContents(long j5, d<? super DeviceScreenContentResponse> dVar) {
        return a.d(this.compatWS, new RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$2(j5), new RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$3(j5, null), null, false, dVar, 124);
    }

    @Override // com.withings.screen.repository.DeviceScreensRemoteRepository
    public Object getDevicesScreens(long j5, d<? super DeviceScreenResponse> dVar) {
        return a.d(this.compatWS, new RetrofitDeviceScreensRemoteRepository$getDevicesScreens$2(j5), new RetrofitDeviceScreensRemoteRepository$getDevicesScreens$3(j5, null), null, false, dVar, 124);
    }

    @Override // com.withings.screen.repository.DeviceScreensRemoteRepository
    public Object saveDeviceScreens(long j5, Long l5, String str, d<? super StoreDeviceScreenResponse> dVar) {
        return a.d(this.compatWS, new RetrofitDeviceScreensRemoteRepository$saveDeviceScreens$2(j5, l5, str), new RetrofitDeviceScreensRemoteRepository$saveDeviceScreens$3(j5, l5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.screen.repository.DeviceScreensRemoteRepository
    public DeviceScreensRemoteRepository withSyncContext(String str) {
        return new RetrofitDeviceScreensRemoteRepository(this.compatWebServicesFactory, str);
    }

    public /* synthetic */ RetrofitDeviceScreensRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
