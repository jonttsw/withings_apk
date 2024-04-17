package com.withings.screen.repository;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.model.DeviceScreenContentResponse;
import com.withings.screen.model.DeviceScreenResponse;
import com.withings.screen.model.StoreDeviceScreenResponse;
import kotlin.Metadata;
import qm0.d;
/* compiled from: DeviceScreensRemoteRepository.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\nJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/screen/repository/DeviceScreensRemoteRepository;", "", NavigationArguments.USER_ID, "Lcom/withings/screen/model/DeviceScreenResponse;", "getDevicesScreens", "(JLqm0/d;)Ljava/lang/Object;", "deviceId", "Lcom/withings/screen/model/DeviceScreenContentResponse;", "getDeviceScreensContents", "screenIds", "Lcom/withings/screen/model/StoreDeviceScreenResponse;", "saveDeviceScreens", "(JLjava/lang/Long;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface DeviceScreensRemoteRepository {
    Object getDeviceScreensContents(long j5, d<? super DeviceScreenContentResponse> dVar);

    Object getDevicesScreens(long j5, d<? super DeviceScreenResponse> dVar);

    Object saveDeviceScreens(long j5, Long l5, String str, d<? super StoreDeviceScreenResponse> dVar);

    DeviceScreensRemoteRepository withSyncContext(String str);
}
