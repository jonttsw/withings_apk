package com.withings.wiscale2.device.common.handcalibration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.devicesetup.ui.LottieData;
import com.withings.views.view.WheelView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.spo2.m;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HandCalibrationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/a;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/WheelView$a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a extends Fragment implements WheelView.a {

    /* renamed from: c  reason: collision with root package name */
    private final b f52683c = new b(this);

    /* renamed from: d  reason: collision with root package name */
    private lc0.c f52684d;

    /* renamed from: e  reason: collision with root package name */
    private double f52685e;

    /* renamed from: f  reason: collision with root package name */
    private WheelView f52686f;

    /* renamed from: g  reason: collision with root package name */
    private Button f52687g;

    /* renamed from: h  reason: collision with root package name */
    private LottieAnimationView f52688h;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f52682j = {v.c(a.class, "handCalibration", "getHandCalibration()Lcom/withings/wiscale2/device/common/handcalibration/HandCalibration;", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final C0705a f52681i = new Object();

    /* compiled from: HandCalibrationFragment.kt */
    /* renamed from: com.withings.wiscale2.device.common.handcalibration.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0705a {
        public static a a(HandCalibration handCalibration, boolean z5) {
            u.j(handCalibration, "handCalibration");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("handCalibration", handCalibration);
            bundle.putBoolean("showCancel", z5);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Fragment, HandCalibration> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f52689a = nm0.h.b(new e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f52690b;

        public b(Fragment fragment) {
            this.f52690b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.wiscale2.device.common.handcalibration.HandCalibration, java.lang.Object] */
        @Override // bn0.d
        public final HandCalibration getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f52689a.getValue();
        }
    }

    public static void s1(a this$0) {
        u.j(this$0, "this$0");
        lc0.c cVar = this$0.f52684d;
        if (cVar != null) {
            cVar.g1(this$0);
        }
    }

    public static void t1(a this$0, MotionEvent motionEvent) {
        u.j(this$0, "this$0");
        LottieAnimationView lottieAnimationView = this$0.f52688h;
        if (lottieAnimationView != null) {
            if (lottieAnimationView.getVisibility() == 0) {
                LottieAnimationView lottieAnimationView2 = this$0.f52688h;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.i();
                    LottieAnimationView lottieAnimationView3 = this$0.f52688h;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.setOnTouchListener(null);
                        LottieAnimationView lottieAnimationView4 = this$0.f52688h;
                        if (lottieAnimationView4 != null) {
                            lottieAnimationView4.setVisibility(8);
                            WheelView wheelView = this$0.f52686f;
                            if (wheelView != null) {
                                wheelView.setVisibility(0);
                            } else {
                                u.s("wheel");
                                throw null;
                            }
                        } else {
                            u.s("help");
                            throw null;
                        }
                    } else {
                        u.s("help");
                        throw null;
                    }
                } else {
                    u.s("help");
                    throw null;
                }
            }
            WheelView wheelView2 = this$0.f52686f;
            if (wheelView2 != null) {
                wheelView2.onTouchEvent(motionEvent);
                return;
            } else {
                u.s("wheel");
                throw null;
            }
        }
        u.s("help");
        throw null;
    }

    public static void u1(a this$0) {
        u.j(this$0, "this$0");
        lc0.c cVar = this$0.f52684d;
        if (cVar != null) {
            cVar.o3(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HandCalibration x1() {
        return (HandCalibration) this.f52683c.getValue(this, f52682j[0]);
    }

    @Override // com.withings.views.view.WheelView.a
    public final void f0(double d11) {
        double d12 = this.f52685e + d11;
        this.f52685e = d12;
        int i11 = (int) (d12 / 6);
        if (i11 != 0) {
            this.f52685e = d12 - (i11 * 6);
            if (Math.abs(i11) > 15) {
                i11 /= i11;
            }
            int i12 = -i11;
            lc0.c cVar = this.f52684d;
            if (cVar != null) {
                cVar.j0(this, i12);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_calibrate_hand, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        int i12;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
        View findViewById = view.findViewById(C1987R.id.setup_title);
        u.i(findViewById, "findViewById(...)");
        ((TextView) findViewById).setText(x1().e());
        View findViewById2 = view.findViewById(C1987R.id.setup_message);
        u.i(findViewById2, "findViewById(...)");
        ((TextView) findViewById2).setText(androidx.core.text.b.b(m.h(view, x1().c())));
        Integer a11 = x1().a();
        if (a11 != null) {
            int intValue = a11.intValue();
            View findViewById3 = view.findViewById(C1987R.id.setup_error);
            u.i(findViewById3, "findViewById(...)");
            Button button = (Button) findViewById3;
            this.f52687g = button;
            button.setVisibility(0);
            Button button2 = this.f52687g;
            if (button2 != null) {
                button2.setOnClickListener(new sg.b(this, 7));
                Button button3 = this.f52687g;
                if (button3 != null) {
                    button3.setText(intValue);
                } else {
                    u.s("error");
                    throw null;
                }
            } else {
                u.s("error");
                throw null;
            }
        }
        View findViewById4 = view.findViewById(C1987R.id.wheel);
        u.i(findViewById4, "findViewById(...)");
        WheelView wheelView = (WheelView) findViewById4;
        this.f52686f = wheelView;
        wheelView.setWheelCallback(this);
        View findViewById5 = view.findViewById(C1987R.id.setup_next);
        u.i(findViewById5, "findViewById(...)");
        ((Button) findViewById5).setOnClickListener(new sg.c(this, 8));
        WheelView wheelView2 = this.f52686f;
        if (wheelView2 != null) {
            if (x1().d() && x1().b() != null) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            wheelView2.setVisibility(i11);
            View findViewById6 = view.findViewById(C1987R.id.help);
            u.i(findViewById6, "findViewById(...)");
            this.f52688h = (LottieAnimationView) findViewById6;
            LottieData b10 = x1().b();
            if (b10 != null) {
                LottieAnimationView lottieAnimationView = this.f52688h;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.setAnimation(b10.b());
                    lottieAnimationView.setImageAssetsFolder(b10.a());
                    if (b10.d()) {
                        i12 = -1;
                    } else {
                        i12 = 0;
                    }
                    lottieAnimationView.setRepeatCount(i12);
                    lottieAnimationView.h(new d(lottieAnimationView, this));
                    lottieAnimationView.m();
                } else {
                    u.s("help");
                    throw null;
                }
            }
            View findViewById7 = view.findViewById(C1987R.id.touch_handler_view);
            u.i(findViewById7, "findViewById(...)");
            findViewById7.setOnTouchListener(new View.OnTouchListener() { // from class: lc0.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    com.withings.wiscale2.device.common.handcalibration.a.t1(com.withings.wiscale2.device.common.handcalibration.a.this, motionEvent);
                    return true;
                }
            });
            lc0.c cVar = this.f52684d;
            if (cVar != null) {
                cVar.j0(this, 0);
                return;
            }
            return;
        }
        u.s("wheel");
        throw null;
    }

    @Override // com.withings.views.view.WheelView.a
    public final void u() {
        this.f52685e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    public final void y1(lc0.c cVar) {
        this.f52684d = cVar;
    }
}
