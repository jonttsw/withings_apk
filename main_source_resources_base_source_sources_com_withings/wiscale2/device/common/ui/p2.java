package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import com.google.android.material.button.MaterialButton;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: TrackerPositionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/p2;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class p2 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final c f54050c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    private ConstraintLayout f54051d;

    /* renamed from: e  reason: collision with root package name */
    private Toolbar f54052e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f54053f;

    /* renamed from: g  reason: collision with root package name */
    private MaterialButton f54054g;

    /* renamed from: h  reason: collision with root package name */
    private MaterialButton f54055h;

    /* renamed from: i  reason: collision with root package name */
    private ProgressBar f54056i;

    /* renamed from: j  reason: collision with root package name */
    private r2 f54057j;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54049l = {androidx.camera.core.v.c(p2.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f54048k = new Object();

    /* compiled from: TrackerPositionFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class b implements k1.b {
        public b() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            ej.w w11 = ej.w.w();
            kotlin.jvm.internal.u.i(w11, "get(...)");
            return new r2(w11, p2.u1(p2.this));
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54059a = nm0.h.b(new q2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f54060b;

        public c(Fragment fragment) {
            this.f54060b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54059a.getValue();
        }
    }

    public static void s1(p2 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        MaterialButton materialButton = this$0.f54054g;
        if (materialButton != null) {
            MaterialButton materialButton2 = this$0.f54055h;
            if (materialButton2 != null) {
                this$0.v1(materialButton, materialButton2);
                r2 r2Var = this$0.f54057j;
                if (r2Var != null) {
                    r2Var.f0(1);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("rightButton");
            throw null;
        }
        kotlin.jvm.internal.u.s("leftButton");
        throw null;
    }

    public static void t1(p2 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        MaterialButton materialButton = this$0.f54055h;
        if (materialButton != null) {
            MaterialButton materialButton2 = this$0.f54054g;
            if (materialButton2 != null) {
                this$0.v1(materialButton, materialButton2);
                r2 r2Var = this$0.f54057j;
                if (r2Var != null) {
                    r2Var.f0(0);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("leftButton");
            throw null;
        }
        kotlin.jvm.internal.u.s("rightButton");
        throw null;
    }

    public static final Device u1(p2 p2Var) {
        p2Var.getClass();
        return (Device) p2Var.f54050c.getValue(p2Var, f54049l[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_tracker_position, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return true;
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.constraint_layout);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f54051d = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.toolbar);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f54052e = (Toolbar) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.content_image);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f54053f = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.left_wrist_button);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f54054g = (MaterialButton) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.right_wrist_button);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f54055h = (MaterialButton) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.progress_bar);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f54056i = (ProgressBar) findViewById6;
        Toolbar toolbar = this.f54052e;
        if (toolbar != null) {
            androidx.camera.camera2.internal.v1.s0(this, toolbar);
            if (((Device) this.f54050c.getValue(this, f54049l[0])).getModelId() == 94) {
                ImageView imageView = this.f54053f;
                if (imageView != null) {
                    imageView.setImageDrawable(androidx.core.content.a.getDrawable(requireContext(), 2131231102));
                } else {
                    kotlin.jvm.internal.u.s("contentImage");
                    throw null;
                }
            }
            this.f54057j = (r2) new androidx.lifecycle.k1(this, new b()).a(r2.class);
            MaterialButton materialButton = this.f54054g;
            if (materialButton != null) {
                materialButton.setOnClickListener(new sg.f(this, 12));
                MaterialButton materialButton2 = this.f54055h;
                if (materialButton2 != null) {
                    materialButton2.setOnClickListener(new sg.g(this, 9));
                    return;
                } else {
                    kotlin.jvm.internal.u.s("rightButton");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("leftButton");
            throw null;
        }
        kotlin.jvm.internal.u.s("toolbar");
        throw null;
    }

    public final void v1(MaterialButton materialButton, MaterialButton materialButton2) {
        materialButton.setEnabled(false);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = this.f54051d;
        if (constraintLayout != null) {
            bVar.k(constraintLayout);
            bVar.Q(materialButton2.getId(), 8);
            ProgressBar progressBar = this.f54056i;
            if (progressBar != null) {
                bVar.n(progressBar.getId(), 3, materialButton.getId(), 3);
                ProgressBar progressBar2 = this.f54056i;
                if (progressBar2 != null) {
                    bVar.n(progressBar2.getId(), 4, materialButton.getId(), 4);
                    ConstraintLayout constraintLayout2 = this.f54051d;
                    if (constraintLayout2 != null) {
                        androidx.transition.w.a(constraintLayout2, null);
                        ConstraintLayout constraintLayout3 = this.f54051d;
                        if (constraintLayout3 != null) {
                            bVar.e(constraintLayout3);
                            materialButton.setText("");
                            ProgressBar progressBar3 = this.f54056i;
                            if (progressBar3 != null) {
                                progressBar3.setVisibility(0);
                                return;
                            } else {
                                kotlin.jvm.internal.u.s("progressBar");
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.u.s("constraintLayout");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("constraintLayout");
                    throw null;
                }
                kotlin.jvm.internal.u.s("progressBar");
                throw null;
            }
            kotlin.jvm.internal.u.s("progressBar");
            throw null;
        }
        kotlin.jvm.internal.u.s("constraintLayout");
        throw null;
    }
}
