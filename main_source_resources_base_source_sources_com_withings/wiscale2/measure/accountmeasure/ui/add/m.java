package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.content.Context;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.heartrate.HeartRateGraphView;
import com.withings.wiscale2.measure.heartrate.HeartRateHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: AddHeartRateCameraFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/add/m;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/add/h0;", "Lcom/withings/wiscale2/measure/heartrate/HeartRateHandler$c;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class m extends f1 implements HeartRateHandler.c {
    public static final /* synthetic */ int W = 0;
    private ScheduledFuture<?> M;
    private ScheduledFuture<?> P;
    private boolean R;
    private long S;
    private HeartRateHandler T;
    @Inject

    /* renamed from: q  reason: collision with root package name */
    public zx.r f58226q;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    public fy.v f58227r;
    @Inject

    /* renamed from: s  reason: collision with root package name */
    public oi0.b f58228s;

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f58229t = nm0.h.b(new l());

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f58230u = nm0.h.b(new c());

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f58231v = nm0.h.b(new f());

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f58232w = nm0.h.b(new a());

    /* renamed from: x  reason: collision with root package name */
    private final nm0.g f58233x = nm0.h.b(new d());

    /* renamed from: y  reason: collision with root package name */
    private final nm0.g f58234y = nm0.h.b(new b());

    /* renamed from: z  reason: collision with root package name */
    private final nm0.g f58235z = nm0.h.b(new g());
    private final nm0.g A = nm0.h.b(new k());
    private final nm0.g B = nm0.h.b(new h());
    private final nm0.g F = nm0.h.b(new e());
    private final ScheduledExecutorService G = Executors.newScheduledThreadPool(1);
    private double Q = 1.0d;

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (TextView) view.findViewById(C1987R.id.bpm_text_view);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (TextView) view.findViewById(C1987R.id.detecting_pulse_text);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<HeartRateGraphView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final HeartRateGraphView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (HeartRateGraphView) view.findViewById(C1987R.id.graph_view);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (TextView) view.findViewById(C1987R.id.heart_icon_text_view);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (ImageView) view.findViewById(C1987R.id.heart_rate_image_overlay);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (TextView) view.findViewById(C1987R.id.heart_rate_live_text);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (TextView) view.findViewById(C1987R.id.problem_text_view);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (ProgressBar) view.findViewById(C1987R.id.progress_bar);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    public static final class i implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f58244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f58245b;

        i(View view, boolean z5) {
            this.f58244a = z5;
            this.f58245b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            kotlin.jvm.internal.u.j(animation, "animation");
            boolean z5 = this.f58244a;
            View view = this.f58245b;
            if (z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
            } else if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.u.j(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.u.j(animation, "animation");
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddHeartRateCameraFragment$status$1", f = "AddHeartRateCameraFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HeartRateHandler.HeartrateMeasureState f58247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(HeartRateHandler.HeartrateMeasureState heartrateMeasureState, qm0.d<? super j> dVar) {
            super(2, dVar);
            this.f58247b = heartrateMeasureState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new j(this.f58247b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            m mVar = m.this;
            TextView G1 = m.G1(mVar);
            if (G1 != null) {
                int ordinal = this.f58247b.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                HeartRateHandler heartRateHandler = mVar.T;
                                if (heartRateHandler != null) {
                                    heartRateHandler.i();
                                }
                                MeasuresGroup s12 = mVar.s1();
                                s12.setDevtype(0);
                                s12.setAttrib(2);
                                s12.setCategory(1);
                                s12.setUserId(mVar.getUser().q());
                                BuildersKt__Builders_commonKt.launch$default(m0.t.l(mVar), null, null, new q(mVar, s12, null), 3, null);
                                DateTime u12 = mVar.u1();
                                if (mVar.v1()) {
                                    str2 = "detail_view";
                                } else {
                                    str2 = ConstantsWs.SYNC_PROCESS_TIMELINE;
                                }
                                gh0.a.c(str2, u12, true);
                                m.I1(mVar);
                                str = "STATE_FINISH";
                            } else if (ordinal != 4) {
                                if (ordinal != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                m.K1(mVar);
                                str = "STATE_NO_FINGER";
                            }
                        } else {
                            m.L1(mVar);
                            str = "STATE_WORKING";
                        }
                    } else {
                        m.M1(mVar);
                        str = "STATE_WORKING_PULSE";
                    }
                    G1.setText(str);
                }
                m.J1(mVar);
                str = "STATE_INIT";
                G1.setText(str);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (TextView) view.findViewById(C1987R.id.status_text);
            }
            return null;
        }
    }

    /* compiled from: AddHeartRateCameraFragment.kt */
    /* loaded from: classes5.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<TextureView> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final TextureView invoke() {
            View view = m.this.getView();
            if (view != null) {
                return (TextureView) view.findViewById(C1987R.id.texture_view);
            }
            return null;
        }
    }

    public static void A1(m this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), Dispatchers.getMain(), null, new s(this$0, null), 2, null);
    }

    public static final void B1(m mVar) {
        if (mVar.R) {
            AnimationSet animationSet = new AnimationSet(true);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.66f, 1.0f, 0.66f, 1, 0.5f, 1, 0.5f);
            double d11 = 1000;
            scaleAnimation.setDuration((long) (mVar.Q * 0.7d * d11));
            animationSet.addAnimation(scaleAnimation);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.66f, 1.0f, 0.66f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration((long) (mVar.Q * 0.2d * d11));
            animationSet.addAnimation(scaleAnimation2);
            TextView R1 = mVar.R1();
            if (R1 != null) {
                R1.setAnimation(animationSet);
            }
        }
    }

    public static final TextView E1(m mVar) {
        return (TextView) mVar.f58231v.getValue();
    }

    public static final TextView G1(m mVar) {
        return (TextView) mVar.A.getValue();
    }

    public static final void I1(m mVar) {
        HeartRateGraphView P1 = mVar.P1();
        if (P1 != null) {
            P1.e();
        }
        mVar.O1();
        mVar.N1();
    }

    public static final void J1(m mVar) {
        T1(mVar.P1(), true);
        HeartRateGraphView P1 = mVar.P1();
        if (P1 != null) {
            P1.c();
        }
        T1((ImageView) mVar.F.getValue(), false);
        T1((TextView) mVar.f58231v.getValue(), false);
        T1((TextView) mVar.f58232w.getValue(), false);
        T1((TextView) mVar.f58234y.getValue(), true);
        T1((ProgressBar) mVar.B.getValue(), true);
        mVar.O1();
        e0.l0 l0Var = new e0.l0(mVar, 6);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ScheduledExecutorService scheduledExecutorService = mVar.G;
        mVar.M = scheduledExecutorService.schedule(l0Var, 10L, timeUnit);
        mVar.N1();
        mVar.P = scheduledExecutorService.schedule(new androidx.fragment.app.n(mVar, 4), 15L, timeUnit);
        mVar.R = false;
        TextView S1 = mVar.S1();
        if (S1 != null) {
            S1.setText("");
        }
        TextView S12 = mVar.S1();
        if (S12 != null) {
            S12.setVisibility(0);
        }
        TextView R1 = mVar.R1();
        if (R1 != null) {
            R1.setText("");
        }
        TextView R12 = mVar.R1();
        if (R12 != null) {
            R12.setVisibility(0);
        }
    }

    public static final void K1(m mVar) {
        T1(mVar.P1(), false);
        HeartRateGraphView P1 = mVar.P1();
        if (P1 != null) {
            P1.e();
        }
        T1((ImageView) mVar.F.getValue(), true);
        T1((TextView) mVar.f58231v.getValue(), false);
        T1((TextView) mVar.f58232w.getValue(), false);
        T1(mVar.R1(), false);
        T1((TextView) mVar.f58234y.getValue(), false);
        T1(mVar.S1(), false);
        T1((ProgressBar) mVar.B.getValue(), false);
        mVar.O1();
        mVar.N1();
    }

    public static final void L1(m mVar) {
        mVar.O1();
        mVar.N1();
        T1(mVar.P1(), true);
        T1((ImageView) mVar.F.getValue(), false);
        HeartRateGraphView P1 = mVar.P1();
        if (P1 != null) {
            P1.d(mVar.T);
        }
    }

    public static final void M1(m mVar) {
        TextView R1 = mVar.R1();
        if (R1 != null) {
            R1.setText(C1987R.string.glyph_heart);
        }
        mVar.R = true;
        T1((ProgressBar) mVar.B.getValue(), false);
        T1((TextView) mVar.f58234y.getValue(), false);
        T1(mVar.S1(), false);
        T1((TextView) mVar.f58231v.getValue(), true);
        T1((TextView) mVar.f58232w.getValue(), true);
    }

    private final void N1() {
        ScheduledFuture<?> scheduledFuture = this.P;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.P = null;
        }
    }

    private final void O1() {
        ScheduledFuture<?> scheduledFuture = this.M;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.M = null;
        }
    }

    private final HeartRateGraphView P1() {
        return (HeartRateGraphView) this.f58230u.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView R1() {
        return (TextView) this.f58233x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView S1() {
        return (TextView) this.f58235z.getValue();
    }

    private static void T1(View view, boolean z5) {
        float f11;
        if (!z5 || view == null || view.getVisibility() != 0) {
            if (!z5 && view != null && view.getVisibility() == 4) {
                return;
            }
            float f12 = 1.0f;
            if (z5) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (!z5) {
                f12 = 0.0f;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(f11, f12);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new i(view, z5));
            if (view != null) {
                view.clearAnimation();
            }
            if (view != null) {
                view.startAnimation(alphaAnimation);
            }
        }
    }

    public static void z1(m this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), Dispatchers.getMain(), null, new r(this$0, null), 2, null);
    }

    @Override // com.withings.wiscale2.measure.heartrate.HeartRateHandler.c
    public final void S(HeartRateHandler.HeartrateMeasureState heartrateMeasureState) {
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new j(heartrateMeasureState, null), 2, null);
    }

    @Override // com.withings.wiscale2.measure.heartrate.HeartRateHandler.c
    public final void W0(double d11) {
        this.S = an0.a.c(d11);
    }

    @Override // com.withings.wiscale2.measure.heartrate.HeartRateHandler.c
    public final void j1() {
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new n(this, null), 2, null);
    }

    @Override // com.withings.wiscale2.measure.heartrate.HeartRateHandler.c
    public final void n1(double d11) {
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new o(this, d11, null), 2, null);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.f1, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Window window;
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(5);
            activity.setRequestedOrientation(1);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.addFlags(128);
            window.addFlags(134217728);
            window.addFlags(67108864);
            window.addFlags(256);
            window.addFlags(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            window.addFlags(16);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        O1();
        N1();
        HeartRateHandler heartRateHandler = this.T;
        if (heartRateHandler != null) {
            heartRateHandler.i();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(4);
        }
        super.onDetach();
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        this.T = new HeartRateHandler(this);
        kh0.a aVar = new kh0.a(this.T);
        TextureView textureView = (TextureView) this.f58229t.getValue();
        if (textureView != null) {
            textureView.setSurfaceTextureListener(aVar);
        }
        TextView textView = (TextView) this.f58231v.getValue();
        if (textView != null) {
            textView.setVisibility(4);
        }
        TextView textView2 = (TextView) this.f58232w.getValue();
        if (textView2 != null) {
            textView2.setVisibility(4);
        }
        TextView R1 = R1();
        if (R1 != null) {
            R1.setVisibility(4);
        }
        HeartRateGraphView P1 = P1();
        if (P1 != null) {
            P1.setVisibility(4);
        }
        TextView textView3 = (TextView) this.f58234y.getValue();
        if (textView3 != null) {
            textView3.setVisibility(4);
        }
        ProgressBar progressBar = (ProgressBar) this.B.getValue();
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        TextView S1 = S1();
        if (S1 != null) {
            S1.setVisibility(4);
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final MeasuresGroup s1() {
        MeasuresGroup measuresGroup = new MeasuresGroup(1);
        measuresGroup.setDate(u1().toDate());
        measuresGroup.setDevtype(4);
        measuresGroup.setType(11);
        Measure measure = new Measure();
        measure.setDate(measuresGroup.getDate());
        measure.setType(11);
        measure.setUnit(0);
        measure.setValue(this.S);
        measure.setGroup(measuresGroup);
        measuresGroup.addMeasure(measure);
        return measuresGroup;
    }
}
