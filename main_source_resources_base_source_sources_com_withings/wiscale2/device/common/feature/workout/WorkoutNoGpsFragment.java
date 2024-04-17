package com.withings.wiscale2.device.common.feature.workout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
/* compiled from: WorkoutTutorialNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/workout/WorkoutNoGpsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutNoGpsFragment extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final g f52628c;

    /* renamed from: d  reason: collision with root package name */
    private final g f52629d;

    /* renamed from: e  reason: collision with root package name */
    private final g f52630e;

    /* compiled from: WorkoutTutorialNavigation.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) WorkoutNoGpsFragment.this.requireActivity().findViewById(C1987R.id.setup_image);
        }
    }

    /* compiled from: WorkoutTutorialNavigation.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) WorkoutNoGpsFragment.this.requireActivity().findViewById(C1987R.id.setup_primary_text);
        }
    }

    /* compiled from: WorkoutTutorialNavigation.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) WorkoutNoGpsFragment.this.requireActivity().findViewById(C1987R.id.setup_secondary_text);
        }
    }

    public WorkoutNoGpsFragment() {
        super(C1987R.layout.fragment_setup);
        this.f52628c = h.b(new b());
        this.f52629d = h.b(new c());
        this.f52630e = h.b(new a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g gVar = this.f52630e;
        Object value = gVar.getValue();
        u.i(value, "getValue(...)");
        ((ImageView) value).setVisibility(0);
        g gVar2 = this.f52629d;
        Object value2 = gVar2.getValue();
        u.i(value2, "getValue(...)");
        ((TextView) value2).setVisibility(0);
        Object value3 = this.f52628c.getValue();
        u.i(value3, "getValue(...)");
        ((TextView) value3).setText(getString(C1987R.string.installation_gpsAlreadyTitle_android));
        Object value4 = gVar2.getValue();
        u.i(value4, "getValue(...)");
        ((TextView) value4).setText(getString(C1987R.string.installation_gpsAlreadyDescription_android));
        Object value5 = gVar.getValue();
        u.i(value5, "getValue(...)");
        ((ImageView) value5).setImageResource(2131232491);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
    }
}
