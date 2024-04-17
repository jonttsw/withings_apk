package com.withings.screen.repository.data;

import androidx.activity.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.screen.repository.data.model.DeviceScreenEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
import pm0.a;
/* compiled from: UpdateScreensStateAndOrder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0086\u0002J$\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0002¨\u0006\r"}, d2 = {"Lcom/withings/screen/repository/data/UpdateScreensStateAndOrder;", "", "()V", "invoke", "", "Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "previousDeviceScreens", "newOrder", "Lcom/withings/screen/repository/data/UpdateScreensStateAndOrder$ScreenState;", "previousContainOldScreen", "", "deviceScreens", "ScreenState", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateScreensStateAndOrder {

    /* compiled from: UpdateScreensStateAndOrder.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withings/screen/repository/data/UpdateScreensStateAndOrder$ScreenState;", "", "wsId", "", "isActive", "", "(JZ)V", "()Z", "getWsId", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ScreenState {
        private final boolean isActive;
        private final long wsId;

        public ScreenState(long j5, boolean z5) {
            this.wsId = j5;
            this.isActive = z5;
        }

        public static /* synthetic */ ScreenState copy$default(ScreenState screenState, long j5, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = screenState.wsId;
            }
            if ((i11 & 2) != 0) {
                z5 = screenState.isActive;
            }
            return screenState.copy(j5, z5);
        }

        public final long component1() {
            return this.wsId;
        }

        public final boolean component2() {
            return this.isActive;
        }

        public final ScreenState copy(long j5, boolean z5) {
            return new ScreenState(j5, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenState)) {
                return false;
            }
            ScreenState screenState = (ScreenState) obj;
            if (this.wsId == screenState.wsId && this.isActive == screenState.isActive) {
                return true;
            }
            return false;
        }

        public final long getWsId() {
            return this.wsId;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive) + (Long.hashCode(this.wsId) * 31);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public String toString() {
            long j5 = this.wsId;
            boolean z5 = this.isActive;
            return "ScreenState(wsId=" + j5 + ", isActive=" + z5 + ")";
        }
    }

    private final boolean previousContainOldScreen(List<DeviceScreenEntity> list, List<ScreenState> list2) {
        if (list.size() >= list2.size()) {
            List<ScreenState> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (ScreenState screenState : list3) {
                    List<DeviceScreenEntity> list4 = list;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator<T> it = list4.iterator();
                        while (it.hasNext()) {
                            if (((DeviceScreenEntity) it.next()).getWsId() == screenState.getWsId()) {
                                break;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final List<DeviceScreenEntity> invoke(List<DeviceScreenEntity> previousDeviceScreens, List<ScreenState> newOrder) {
        boolean z5;
        int i11;
        DeviceScreenEntity copy;
        u.j(previousDeviceScreens, "previousDeviceScreens");
        u.j(newOrder, "newOrder");
        if (previousContainOldScreen(previousDeviceScreens, newOrder)) {
            List<DeviceScreenEntity> list = previousDeviceScreens;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (DeviceScreenEntity deviceScreenEntity : list) {
                Iterator<ScreenState> it = newOrder.iterator();
                int i12 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (deviceScreenEntity.getWsId() == it.next().getWsId()) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    z5 = newOrder.get(i12).isActive();
                } else {
                    z5 = false;
                }
                if (i12 == -1) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = i12;
                }
                copy = deviceScreenEntity.copy((r48 & 1) != 0 ? deviceScreenEntity.f43965id : 0L, (r48 & 2) != 0 ? deviceScreenEntity.wsId : 0L, (r48 & 4) != 0 ? deviceScreenEntity.name : null, (r48 & 8) != 0 ? deviceScreenEntity.deviceId : 0L, (r48 & 16) != 0 ? deviceScreenEntity.userId : 0L, (r48 & 32) != 0 ? deviceScreenEntity.screenSource : 0, (r48 & 64) != 0 ? deviceScreenEntity.image : null, (r48 & 128) != 0 ? deviceScreenEntity.images : null, (r48 & 256) != 0 ? deviceScreenEntity.embeddedId : null, (r48 & 512) != 0 ? deviceScreenEntity.displayOrder : i11, (r48 & 1024) != 0 ? deviceScreenEntity.active : z5, (r48 & ModuleCopy.f28574b) != 0 ? deviceScreenEntity.deactivableStatus : null, (r48 & 4096) != 0 ? deviceScreenEntity.parentId : null, (r48 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? deviceScreenEntity.displayContext : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? deviceScreenEntity.syncedWithWS : false, (r48 & Utils.MAX_EVENT_SIZE) != 0 ? deviceScreenEntity.syncedWithDevice : false, (r48 & 65536) != 0 ? deviceScreenEntity.modified : DateTime.now().getMillis(), (r48 & 131072) != 0 ? deviceScreenEntity.startDate : null, (262144 & r48) != 0 ? deviceScreenEntity.endDate : null, (r48 & 524288) != 0 ? deviceScreenEntity.appDependencies : null, (r48 & 1048576) != 0 ? deviceScreenEntity.defaultActive : null, (r48 & 2097152) != 0 ? deviceScreenEntity.defaultRank : null, (r48 & 4194304) != 0 ? deviceScreenEntity.group : null, (r48 & 8388608) != 0 ? deviceScreenEntity.requiredFeatureIds : null, (r48 & 16777216) != 0 ? deviceScreenEntity.fixedPosition : null);
                arrayList.add(copy);
            }
            return x.D0(arrayList, new Comparator() { // from class: com.withings.screen.repository.data.UpdateScreensStateAndOrder$invoke$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    return a.b(Integer.valueOf(((DeviceScreenEntity) t11).getDisplayOrder()), Integer.valueOf(((DeviceScreenEntity) t12).getDisplayOrder()));
                }
            });
        }
        throw new IllegalArgumentException(b.b("local screens contains [", x.R(previousDeviceScreens, null, null, null, UpdateScreensStateAndOrder$invoke$1$1.INSTANCE, 31), "] but new order contains ", x.R(newOrder, null, null, null, UpdateScreensStateAndOrder$invoke$1$2.INSTANCE, 31)).toString());
    }
}
