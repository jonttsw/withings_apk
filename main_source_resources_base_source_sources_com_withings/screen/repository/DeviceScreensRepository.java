package com.withings.screen.repository;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.screen.model.DeviceScreensGroup;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: DeviceScreensRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/withings/screen/repository/DeviceScreensRepository;", "", "", "deviceId", NavigationArguments.USER_ID, "", "Lcom/withings/screen/model/DeviceScreensGroup;", "screenGroups", "Lnm0/y;", "updateOrderAndSelectedScreens", "(JJLjava/util/List;Lqm0/d;)Ljava/lang/Object;", "setSyncedWithDevice", "(JLqm0/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "get", "(JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "Lorg/joda/time/DateTime;", "screensLastUpdate", "contentsLastUpdate", "", "syncContext", "synchronize", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "(Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "getDeviceScreensUpdateEvents", "()Lkotlinx/coroutines/flow/Flow;", "deviceScreensUpdateEvents", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface DeviceScreensRepository {

    /* compiled from: DeviceScreensRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object clear$default(DeviceScreensRepository deviceScreensRepository, Long l5, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                l5 = null;
            }
            return deviceScreensRepository.clear(l5, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
    }

    static /* synthetic */ Flow get$default(DeviceScreensRepository deviceScreensRepository, long j5, Long l5, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                l5 = null;
            }
            return deviceScreensRepository.get(j5, l5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    Object clear(Long l5, d<? super y> dVar);

    Flow<List<DeviceScreensGroup>> get(long j5, Long l5);

    Flow<Long> getDeviceScreensUpdateEvents();

    Object setSyncedWithDevice(long j5, d<? super y> dVar);

    Object synchronize(long j5, DateTime dateTime, DateTime dateTime2, String str, d<? super y> dVar);

    Object updateOrderAndSelectedScreens(long j5, long j11, List<DeviceScreensGroup> list, d<? super y> dVar);
}
