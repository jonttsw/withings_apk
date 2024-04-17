package com.withings.wiscale2.device.wpm.wpm05.tutorial.ui;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.button.MaterialButton;
import com.rudderstack.android.sdk.core.MessageType;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.Wpm05TutorialScreen;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e;
import fn0.k;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import nm0.j;
/* compiled from: Wpm05TutorialFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm05/tutorial/ui/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class e extends Fragment {

    /* renamed from: c */
    private final c f55937c = new c(this);

    /* renamed from: d */
    private b f55938d;

    /* renamed from: f */
    static final /* synthetic */ k<Object>[] f55936f = {v.c(e.class, MessageType.SCREEN, "getScreen()Lcom/withings/wiscale2/device/wpm/wpm05/tutorial/Wpm05TutorialScreen;", 0)};

    /* renamed from: e */
    public static final a f55935e = new Object();

    /* compiled from: Wpm05TutorialFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Wpm05TutorialFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void g();
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, Wpm05TutorialScreen> {

        /* renamed from: a */
        private final g f55939a = h.b(new f(this));

        /* renamed from: b */
        final /* synthetic */ Fragment f55940b;

        public c(Fragment fragment) {
            this.f55940b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.wiscale2.device.wpm.wpm05.tutorial.Wpm05TutorialScreen, java.lang.Object] */
        @Override // bn0.d
        public final Wpm05TutorialScreen getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55939a.getValue();
        }
    }

    public static void s1(e this$0, ImageView imageView) {
        u.j(this$0, "this$0");
        if (this$0.u1().g() != null) {
            u.g(imageView);
            imageView.setVisibility(0);
        }
        b bVar = this$0.f55938d;
        if (bVar != null) {
            bVar.g();
        } else {
            u.s(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    public static final /* synthetic */ void t1(e eVar, Wpm05TutorialActivity wpm05TutorialActivity) {
        eVar.f55938d = wpm05TutorialActivity;
    }

    private final Wpm05TutorialScreen u1() {
        return (Wpm05TutorialScreen) this.f55937c.getValue(this, f55936f[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_wpm05_tutorial, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        boolean a11 = u1().a();
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
        final ImageView imageView = (ImageView) view.findViewById(C1987R.id.video_preview);
        j<String, String> e11 = u1().e();
        if (e11 != null) {
            u.g(frameLayout);
            u.g(guideline);
            guideline.setGuidelinePercent(0.853f);
            LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
            lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            lottieAnimationView.setImageAssetsFolder(e11.c());
            lottieAnimationView.setAnimation(e11.d());
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.m();
            frameLayout.addView(lottieAnimationView);
        }
        Integer d11 = u1().d();
        if (d11 != null) {
            int intValue = d11.intValue();
            u.g(frameLayout);
            u.g(guideline);
            guideline.setGuidelinePercent(0.75f);
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            imageView2.setImageResource(intValue);
            frameLayout.addView(imageView2);
        }
        String g11 = u1().g();
        if (g11 != null) {
            u.g(frameLayout);
            frameLayout.setVisibility(8);
            u.g(imageView);
            imageView.setVisibility(0);
            ((Guideline) view.findViewById(C1987R.id.text_guideline)).setGuidelinePercent(0.3f);
            View findViewById = view.findViewById(C1987R.id.background);
            u.i(findViewById, "findViewById(...)");
            findViewById.setVisibility(8);
            final MaterialButton materialButton = (MaterialButton) view.findViewById(C1987R.id.restart_button);
            final VideoView videoView = (VideoView) view.findViewById(C1987R.id.content_video);
            u.g(videoView);
            videoView.setVisibility(0);
            File file = new File(requireContext().getFilesDir(), g11);
            if (!file.exists()) {
                InputStream open = requireContext().getAssets().open(g11);
                u.i(open, "open(...)");
                String absolutePath = file.getAbsolutePath();
                u.i(absolutePath, "getAbsolutePath(...)");
                ah.h.h(open, absolutePath);
            }
            videoView.setVideoURI(Uri.fromFile(file));
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: ef0.b
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    e.a aVar = com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e.f55935e;
                    com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e this$0 = com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e.this;
                    u.j(this$0, "this$0");
                    u.g(mediaPlayer);
                    VideoView videoView2 = videoView;
                    u.g(videoView2);
                    float videoWidth = (mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight()) / (videoView2.getWidth() / videoView2.getHeight());
                    if (videoWidth >= 1.0f) {
                        videoView2.setScaleX(videoWidth);
                    } else {
                        videoView2.setScaleY(1.0f / videoWidth);
                    }
                }
            });
            videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: ef0.c
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer, int i11, int i12) {
                    e.a aVar = com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e.f55935e;
                    ImageView previewView = imageView;
                    u.j(previewView, "$previewView");
                    if (i11 == 3) {
                        previewView.setVisibility(4);
                        return false;
                    }
                    return false;
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ef0.d
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    e.a aVar = com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e.f55935e;
                    ImageView previewView = imageView;
                    u.j(previewView, "$previewView");
                    previewView.setVisibility(0);
                    MaterialButton materialButton2 = materialButton;
                    u.g(materialButton2);
                    materialButton2.setVisibility(0);
                }
            });
            videoView.start();
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: ef0.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    e.a aVar = com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e.f55935e;
                    ImageView previewView = imageView;
                    u.j(previewView, "$previewView");
                    previewView.setVisibility(4);
                    MaterialButton materialButton2 = materialButton;
                    u.g(materialButton2);
                    materialButton2.setVisibility(4);
                    videoView.start();
                }
            });
        }
        ((TextView) view.findViewById(C1987R.id.title)).setText(getString(u1().f()));
        ((TextView) view.findViewById(C1987R.id.text)).setText(getString(u1().c()));
        Button button = (Button) view.findViewById(C1987R.id.next_button);
        button.setText(getString(u1().b()));
        button.setOnClickListener(new com.withings.webradio.ui.b(4, this, imageView));
    }
}
