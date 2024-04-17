package com.withings.wiscale2.device.common.screen.ui;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenGetConversation;
import com.withings.wiscale2.device.common.conversation.WorkoutScreenSetConversation;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WorkoutScreenOrderFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/screen/ui/WorkoutScreenOrderSettingConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutScreenOrderSettingConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final WorkoutCategoryManager f53249f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.k0<a> f53250g = new androidx.lifecycle.k0<>();

    /* renamed from: h  reason: collision with root package name */
    private long[] f53251h;

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f53252a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f53253b;

        public a(int i11, int[] iArr) {
            this.f53252a = i11;
            this.f53253b = iArr;
        }

        public final int a() {
            return this.f53252a;
        }

        public final int[] b() {
            return this.f53253b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f53252a == aVar.f53252a && kotlin.jvm.internal.u.e(this.f53253b, aVar.f53253b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f53253b) + (Integer.hashCode(this.f53252a) * 31);
        }

        public final String toString() {
            String arrays = Arrays.toString(this.f53253b);
            return "WorkoutScreenSetting(max=" + this.f53252a + ", screensOrder=" + arrays + ")";
        }
    }

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.q<Integer, long[], List<? extends ImageMetadata>, nm0.y> {
        b() {
            super(3);
        }

        @Override // ym0.q
        public final nm0.y invoke(Integer num, long[] jArr, List<? extends ImageMetadata> list) {
            int intValue = num.intValue();
            long[] screens = jArr;
            List<? extends ImageMetadata> imageMetaData = list;
            kotlin.jvm.internal.u.j(screens, "screens");
            kotlin.jvm.internal.u.j(imageMetaData, "imageMetaData");
            WorkoutScreenOrderSettingConversation workoutScreenOrderSettingConversation = WorkoutScreenOrderSettingConversation.this;
            androidx.lifecycle.k0<a> N = workoutScreenOrderSettingConversation.N();
            ArrayList arrayList = new ArrayList(screens.length);
            for (long j5 : screens) {
                arrayList.add(Integer.valueOf((int) j5));
            }
            N.postValue(new a(intValue, kotlin.collections.x.P0(arrayList)));
            workoutScreenOrderSettingConversation.B(300000L, false, true);
            workoutScreenOrderSettingConversation.K();
            long[] jArr2 = workoutScreenOrderSettingConversation.f53251h;
            if (jArr2 != null) {
                workoutScreenOrderSettingConversation.E(new WorkoutScreenSetConversation(workoutScreenOrderSettingConversation.f53249f, jArr2, imageMetaData));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<wp.u, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53255a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(wp.u uVar) {
            wp.u it = uVar;
            kotlin.jvm.internal.u.j(it, "it");
            return Boolean.valueOf(it.a());
        }
    }

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<wp.u, Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f53256a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Long invoke(wp.u uVar) {
            wp.u it = uVar;
            kotlin.jvm.internal.u.j(it, "it");
            return Long.valueOf(it.g());
        }
    }

    public WorkoutScreenOrderSettingConversation(WorkoutCategoryManager workoutCategoryManager) {
        this.f53249f = workoutCategoryManager;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        E(new WorkoutScreenGetConversation(new b()));
    }

    public final androidx.lifecycle.k0<a> N() {
        return this.f53250g;
    }

    public final void O(List<wp.u> list) {
        this.f53251h = kotlin.collections.x.R0(cp0.n.A(cp0.n.t(cp0.n.h(kotlin.collections.x.t(list), c.f53255a), d.f53256a)));
        G(null);
    }
}
