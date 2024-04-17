package com.withings.wiscale2.device.common.screen.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.screen.ui.h2;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WorkoutScreenOrderFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/screen/ui/g2;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/common/device/DeviceSettingsActivity$b;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class g2 extends Fragment implements DeviceSettingsActivity.b {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f53314h = 0;

    /* renamed from: c  reason: collision with root package name */
    private Toolbar f53315c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f53316d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f53317e;

    /* renamed from: f  reason: collision with root package name */
    private wp.n f53318f;

    /* renamed from: g  reason: collision with root package name */
    private h2 f53319g;

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class a implements k1.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f53320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f53321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f53322c;

        public a(View view, Device device, User user) {
            this.f53320a = view;
            this.f53321b = device;
            this.f53322c = user;
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            Context context = this.f53320a.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            ej.w w11 = ej.w.w();
            kotlin.jvm.internal.u.i(w11, "get(...)");
            fl.p a11 = fl.p.f67672b.a();
            kotlin.jvm.internal.u.g(this.f53322c);
            return new h2(context, w11, a11, this.f53321b, this.f53322c);
        }
    }

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<h2.a, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(h2.a aVar) {
            h2.a aVar2 = aVar;
            if (aVar2 != null) {
                int a11 = aVar2.a();
                List<wp.u> b10 = aVar2.b();
                g2 g2Var = g2.this;
                g2.u1(g2Var, b10);
                TextView textView = g2Var.f53317e;
                if (textView != null) {
                    textView.setText(g2Var.getString(C1987R.string.workoutScreens_description_Generic, Integer.valueOf(a11)));
                } else {
                    kotlin.jvm.internal.u.s(HealthConstants.FoodInfo.DESCRIPTION);
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            kotlin.jvm.internal.u.g(num2);
            g2.v1(g2.this, num2.intValue());
            return nm0.y.f85009a;
        }
    }

    public static final void u1(g2 g2Var, List list) {
        wp.n nVar = g2Var.f53318f;
        if (nVar != null) {
            nVar.g(list);
        } else {
            kotlin.jvm.internal.u.s("adapter");
            throw null;
        }
    }

    public static final void v1(g2 g2Var, int i11) {
        RecyclerView recyclerView = g2Var.f53316d;
        if (recyclerView != null) {
            qc.b bVar = new qc.b(recyclerView.getContext());
            bVar.t(false);
            bVar.v(g2Var.getString(C1987R.string.workoutScreens_tooManyWorkouts_Generic, Integer.valueOf(i11)));
            bVar.z(C1987R.string._OK_, new e2(0)).s();
            return;
        }
        kotlin.jvm.internal.u.s("recyclerView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.activity_workout_screen_order, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            h2 h2Var = this.f53319g;
            if (h2Var != null) {
                h2Var.z0();
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return true;
                }
                return true;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f53315c = (Toolbar) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.recycler_view);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f53316d = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.description);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f53317e = (TextView) findViewById3;
        Toolbar toolbar = this.f53315c;
        Serializable serializable = null;
        if (toolbar != null) {
            androidx.camera.camera2.internal.v1.s0(this, toolbar);
            RecyclerView recyclerView = this.f53316d;
            if (recyclerView != null) {
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                wp.n nVar = new wp.n(new f2(this));
                RecyclerView recyclerView2 = this.f53316d;
                if (recyclerView2 != null) {
                    nVar.f(recyclerView2);
                    this.f53318f = nVar;
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            obj = arguments.getSerializable("key_device", Device.class);
                        } else {
                            Serializable serializable2 = arguments.getSerializable("key_device");
                            if (serializable2 instanceof Device) {
                                serializable = serializable2;
                            }
                            obj = (Device) serializable;
                        }
                        Device device = (Device) obj;
                        if (device != null) {
                            m70.i b10 = m70.i.b();
                            Long userId = device.getUserId();
                            if (userId != null) {
                                h2 h2Var = (h2) new androidx.lifecycle.k1(this, new a(view, device, b10.i(userId.longValue()))).a(h2.class);
                                xw.d.c(this, h2Var.r0(), new b());
                                xw.d.c(this, h2Var.t0(), new c());
                                this.f53319g = h2Var;
                                return;
                            }
                            throw new IllegalArgumentException("Device should have a userId");
                        }
                    }
                    throw new IllegalArgumentException("DeviceScreenOrderFragment should have a device");
                }
                kotlin.jvm.internal.u.s("recyclerView");
                throw null;
            }
            kotlin.jvm.internal.u.s("recyclerView");
            throw null;
        }
        kotlin.jvm.internal.u.s("toolbar");
        throw null;
    }

    @Override // com.withings.common.device.DeviceSettingsActivity.b
    public final void s0(Activity activity) {
        kotlin.jvm.internal.u.j(activity, "activity");
        h2 h2Var = this.f53319g;
        if (h2Var != null) {
            h2Var.z0();
            activity.finish();
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
