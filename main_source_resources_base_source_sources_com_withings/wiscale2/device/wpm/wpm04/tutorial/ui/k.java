package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.s1;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.TimeOutInfo;
import com.withings.wiscale2.device.wpm.wpm04.tutorial.Wpm04TutorialScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Wpm04TutorialFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/ui/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final c f55874c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    private final Handler f55875d = new Handler();

    /* renamed from: e  reason: collision with root package name */
    private final s1 f55876e = new s1(this, 4);

    /* renamed from: f  reason: collision with root package name */
    private b f55877f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55873h = {v.c(k.class, MessageType.SCREEN, "getScreen()Lcom/withings/wiscale2/device/wpm/wpm04/tutorial/Wpm04TutorialScreen;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f55872g = new Object();

    /* compiled from: Wpm04TutorialFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Wpm04TutorialFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void g();
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, Wpm04TutorialScreen> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55878a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f55879b;

        public c(Fragment fragment) {
            this.f55879b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, com.withings.wiscale2.device.wpm.wpm04.tutorial.Wpm04TutorialScreen] */
        @Override // bn0.d
        public final Wpm04TutorialScreen getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55878a.getValue();
        }
    }

    public static void s1(k kVar) {
        Button button;
        TimeOutInfo h11 = kVar.v1().h();
        if (h11 != null) {
            View view = kVar.getView();
            if (view != null && (button = (Button) view.findViewById(C1987R.id.time_out_button)) != null) {
                button.setText(kVar.getString(h11.a()));
                button.setVisibility(0);
                button.setOnClickListener(new k40.a(2, kVar, h11));
            }
            kVar.f55875d.removeCallbacks(kVar.f55876e);
        }
    }

    public static void t1(k this$0) {
        u.j(this$0, "this$0");
        b bVar = this$0.f55877f;
        if (bVar != null) {
            bVar.g();
        } else {
            u.s(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    private final Wpm04TutorialScreen v1() {
        return (Wpm04TutorialScreen) this.f55874c.getValue(this, f55873h[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_wpm04_tutorial, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f55875d.removeCallbacks(this.f55876e);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        u.j(view, "view");
        boolean a11 = v1().a();
        FragmentActivity activity = getActivity();
        u.h(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ActionBar supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(a11);
            supportActionBar.o(a11);
            supportActionBar.p(a11);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C1987R.id.content_image);
        Guideline guideline = (Guideline) view.findViewById(C1987R.id.background_guideline);
        nm0.j<String, String> f11 = v1().f();
        if (f11 != null) {
            u.g(frameLayout);
            u.g(guideline);
            guideline.setGuidelinePercent(0.853f);
            LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
            lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            lottieAnimationView.setImageAssetsFolder(f11.c());
            lottieAnimationView.setAnimation(f11.d());
            if (v1().g()) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            lottieAnimationView.setRepeatCount(i11);
            lottieAnimationView.m();
            frameLayout.addView(lottieAnimationView);
        }
        Integer d11 = v1().d();
        if (d11 != null) {
            int intValue = d11.intValue();
            u.g(frameLayout);
            u.g(guideline);
            guideline.setGuidelinePercent(0.75f);
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            imageView.setImageResource(intValue);
            frameLayout.addView(imageView);
        }
        ((TextView) view.findViewById(C1987R.id.title)).setText(getString(v1().i()));
        ((TextView) view.findViewById(C1987R.id.text)).setText(getString(v1().c()));
        Button button = (Button) view.findViewById(C1987R.id.next_button);
        Integer b10 = v1().b();
        if (b10 != null) {
            int intValue2 = b10.intValue();
            button.setVisibility(0);
            button.setText(getString(intValue2));
            button.setOnClickListener(new sg.d(this, 15));
        }
        Integer e11 = v1().e();
        if (e11 != null) {
            int intValue3 = e11.intValue();
            button.setVisibility(8);
            TextView textView = (TextView) view.findViewById(C1987R.id.info);
            textView.setVisibility(0);
            textView.setText(getString(intValue3));
        }
        TimeOutInfo h11 = v1().h();
        if (h11 != null) {
            this.f55875d.postDelayed(this.f55876e, h11.b());
        }
    }
}
