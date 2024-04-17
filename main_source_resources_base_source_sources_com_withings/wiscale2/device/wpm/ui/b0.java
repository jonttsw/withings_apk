package com.withings.wiscale2.device.wpm.ui;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.measure.detail.ui.views.PressureRingView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import jm.a;
import tb0.j3;
/* compiled from: Wpm02MeasureFragment.java */
/* loaded from: classes5.dex */
public class b0 extends Fragment implements PressureRingView.a {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f55686p = 0;

    /* renamed from: e  reason: collision with root package name */
    private we0.l f55689e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f55691g;

    /* renamed from: i  reason: collision with root package name */
    private a f55693i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList f55694j;

    /* renamed from: k  reason: collision with root package name */
    private i70.a f55695k;

    /* renamed from: n  reason: collision with root package name */
    private jm.a f55698n;

    /* renamed from: o  reason: collision with root package name */
    private j3 f55699o;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55687c = false;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f55688d = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private int f55690f = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f55692h = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f55696l = false;

    /* renamed from: m  reason: collision with root package name */
    private ProbeReply f55697m = null;

    /* compiled from: Wpm02MeasureFragment.java */
    /* loaded from: classes5.dex */
    public interface a {
        void A0();

        void G0(ProbeReply probeReply, we0.l lVar, boolean z5);

        void d();

        void v2();

        void x2();

        void z(long j5, boolean z5);
    }

    public static void s1(b0 b0Var) {
        j3 j3Var = b0Var.f55699o;
        if (j3Var != null) {
            j3Var.f99241b.setClickable(false);
            if (b0Var.f55696l) {
                i70.a aVar = new i70.a();
                Bundle bundle = new Bundle();
                bundle.putInt("text_dialog_resid", C1987R.string._BPM_IS_DEFLATING_);
                aVar.setArguments(bundle);
                b0Var.f55695k = aVar;
                aVar.setCancelable(false);
                b0Var.f55695k.show(b0Var.getFragmentManager(), "Measure");
                b0Var.f55699o.f99243d.setVisibility(4);
                b0Var.f55693i.v2();
            } else {
                b0Var.f55693i.x2();
            }
            b0Var.f55699o.f99243d.setAnimationCallback(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f55693i = (a) context;
            this.f55698n = a.d.a(context);
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.getClass().getSimpleName() + " must implement " + a.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jk0.c.b().f(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j3 b10 = j3.b(layoutInflater, viewGroup);
        this.f55699o = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        j3 j3Var = this.f55699o;
        if (j3Var != null) {
            j3Var.f99243d.setAnimationCallback(null);
        }
        jk0.c.b().g(this);
        this.f55688d.removeCallbacksAndMessages(null);
        this.f55699o = null;
        super.onDestroy();
    }

    public void onEventMainThread(xe0.c cVar) {
        j3 j3Var = this.f55699o;
        if (j3Var != null) {
            int i11 = cVar.f107112a;
            if (i11 < 5) {
                i11 = 0;
            }
            double d11 = i11;
            j3Var.f99243d.setMainText(this.f55698n.b(d11, 10));
            this.f55699o.f99243d.setSecondaryText(this.f55698n.g(10).e(requireContext(), d11));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.f55692h) {
            this.f55693i.x2();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        j3 j3Var = this.f55699o;
        if (j3Var != null) {
            j3Var.f99241b.setOnClickListener(new sg.d(this, 14));
            if (getArguments() != null && getArguments().containsKey("interval_in_second")) {
                float f11 = getArguments().getInt("interval_in_second");
                this.f55699o.f99243d.z(f11, f11);
                this.f55691g = true;
            }
            if (this.f55691g) {
                this.f55694j = new ArrayList();
                j3 j3Var2 = this.f55699o;
                if (j3Var2 != null) {
                    j3Var2.f99248i.setText(getString(C1987R.string.bpmMeasurement_measurement_formatted, Integer.valueOf(this.f55690f)));
                    this.f55699o.f99244e.setTextColor(androidx.core.content.a.getColor(requireContext(), C1987R.color.textSecondary));
                    this.f55699o.f99244e.setBackground(getResources().getDrawable(C1987R.drawable.step_border_to_grey_measure_background));
                    this.f55699o.f99247h.setTextColor(androidx.core.content.a.getColor(requireContext(), C1987R.color.textSecondary));
                    this.f55699o.f99247h.setBackground(getResources().getDrawable(C1987R.drawable.step_border_to_grey_measure_background));
                }
            }
            this.f55699o.f99243d.setAnimationCallback(this);
            v1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f55695k = null;
    }

    public final void t1() {
        v1();
    }

    public final void u1() {
        if (this.f55691g) {
            if (this.f55690f > 3.0f) {
                a aVar = this.f55693i;
                ProbeReply probeReply = this.f55697m;
                x70.b.r("b0", "triple measure finish:", new Object[0]);
                Iterator it = this.f55694j.iterator();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (it.hasNext()) {
                    we0.l lVar = (we0.l) it.next();
                    x70.b.r("b0", "   -> " + lVar.toString(), new Object[0]);
                    i12 += lVar.f104968a;
                    i11 += lVar.f104969b;
                    i13 += lVar.f104970c;
                }
                aVar.G0(probeReply, new we0.l(Math.round(i11 / 3.0f), Math.round(i12 / 3.0f), Math.round(i13 / 3.0f)), true);
                return;
            } else if (!this.f55687c && this.f55699o != null) {
                x70.b.r("b0", "showUiWaitingForNextMeasure ", new Object[0]);
                this.f55699o.f99248i.setText(getString(C1987R.string.bpmMeasurement_measurement_formatted, Integer.valueOf(this.f55690f)));
                this.f55699o.f99246g.setText(getString(C1987R.string.bpmMeasure_startingIn));
                this.f55699o.f99243d.setPressureRingMode(2L);
                this.f55699o.f99243d.setSecondaryText(getString(C1987R.string._SECONDS_).toLowerCase());
                this.f55699o.f99243d.w();
                j3 j3Var = this.f55699o;
                if (j3Var != null) {
                    TransitionDrawable transitionDrawable = (TransitionDrawable) j3Var.f99242c.getBackground();
                    TransitionDrawable transitionDrawable2 = (TransitionDrawable) this.f55699o.f99244e.getBackground();
                    TransitionDrawable transitionDrawable3 = (TransitionDrawable) this.f55699o.f99247h.getBackground();
                    int i14 = this.f55690f;
                    if (i14 != 2) {
                        if (i14 == 3) {
                            this.f55699o.f99244e.setBackground(getResources().getDrawable(C1987R.drawable.step_grey_to_good_measure_background));
                            ((TransitionDrawable) this.f55699o.f99244e.getBackground()).startTransition(500);
                            transitionDrawable3.startTransition(500);
                            this.f55699o.f99244e.setTextColor(androidx.core.content.a.getColor(requireContext(), 17170443));
                            this.f55699o.f99247h.setTextColor(androidx.core.content.a.getColor(requireContext(), 17170443));
                            return;
                        }
                        return;
                    }
                    transitionDrawable.startTransition(500);
                    transitionDrawable2.startTransition(500);
                    this.f55699o.f99244e.setTextColor(androidx.core.content.a.getColor(requireContext(), 17170443));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        this.f55693i.G0(this.f55697m, this.f55689e, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v1() {
        int i11;
        if (this.f55699o != null) {
            x70.b.r("b0", "message START_NEW_MEASURE received", new Object[0]);
            j3 j3Var = this.f55699o;
            if (j3Var != null) {
                j3Var.f99246g.setText(getString(C1987R.string.bpmMeasure_pleaseWait));
                LinearLayout linearLayout = this.f55699o.f99245f;
                if (this.f55691g) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                linearLayout.setVisibility(i11);
                this.f55699o.f99243d.setSecondaryText(this.f55698n.g(10).e(requireContext(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
                this.f55699o.f99243d.setPressureRingMode(0L);
                this.f55699o.f99243d.setVisibility(0);
                this.f55699o.f99243d.setValue(0.0f);
                this.f55699o.f99243d.setGoal(100.0f);
                this.f55699o.f99243d.setDeflateThreshold(60.0f);
            }
            this.f55696l = true;
            this.f55699o.f99246g.setText(getString(C1987R.string.bpmMeasure_pleaseWait));
            this.f55693i.A0();
            this.f55699o.f99243d.setAnimationCallback(this);
        }
    }

    public void onEventMainThread(xe0.d dVar) {
        j3 j3Var = this.f55699o;
        if (j3Var != null) {
            j3Var.f99243d.x((int) (dVar.f107113a * 100.0f));
        }
    }

    public void onEventMainThread(xe0.a aVar) {
        if (this.f55699o != null) {
            we0.l lVar = aVar.f107111b;
            this.f55689e = lVar;
            this.f55697m = aVar.f107110a;
            this.f55696l = false;
            if (lVar.f104971d != 0) {
                i70.a aVar2 = this.f55695k;
                if (aVar2 != null && aVar2.getDialog() != null && this.f55695k.getDialog().isShowing()) {
                    this.f55695k.dismiss();
                    this.f55693i.x2();
                    return;
                }
                x70.b.r("b0", "the measure failed and will restart (or not see. boolean) as soon as EventWpm02ReadyToRestart will be called", new Object[0]);
                this.f55693i.z(this.f55689e.f104971d, this.f55691g);
                this.f55687c = true;
                this.f55699o.f99243d.setAnimationCallback(null);
                return;
            }
            if (this.f55691g) {
                this.f55694j.add(lVar);
                int i11 = this.f55690f;
                if (i11 == 3.0f) {
                    this.f55692h = false;
                }
                this.f55687c = false;
                this.f55690f = i11 + 1;
            } else {
                this.f55692h = false;
                this.f55687c = false;
            }
            this.f55699o.f99243d.y();
        }
    }

    public void onEventMainThread(xe0.e eVar) {
        this.f55693i.d();
        we0.l lVar = this.f55689e;
        if (lVar != null) {
            long j5 = lVar.f104971d;
            if (j5 == 0 || j5 == 9 || this.f55687c) {
                return;
            }
            this.f55693i.z(j5, this.f55691g);
        }
    }

    public void onEventMainThread(we0.a aVar) {
        i70.a aVar2 = this.f55695k;
        if (aVar2 != null && aVar2.getDialog() != null && this.f55695k.getDialog().isShowing()) {
            this.f55695k.dismiss();
        }
        this.f55693i.d();
    }
}
