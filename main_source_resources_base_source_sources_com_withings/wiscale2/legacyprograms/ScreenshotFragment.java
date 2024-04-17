package com.withings.wiscale2.legacyprograms;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.C1987R;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: ScreenshotFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ScreenshotFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/ImageView;", "imageView", "Landroid/widget/ImageView;", "Landroid/widget/ProgressBar;", "progressView", "Landroid/widget/ProgressBar;", "", "screenshotUrl", "Ljava/lang/String;", "<init>", "()V", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScreenshotFragment extends Fragment {
    public static final String EXTRA_SCREENSHOT = "extra_screenshot";
    private ImageView imageView;
    private ProgressBar progressView;
    private String screenshotUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ScreenshotFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ScreenshotFragment$Companion;", "", "()V", "EXTRA_SCREENSHOT", "", "newInstance", "Lcom/withings/wiscale2/legacyprograms/ScreenshotFragment;", "screenshotUrl", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final ScreenshotFragment newInstance(String str) {
            ScreenshotFragment screenshotFragment = new ScreenshotFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ScreenshotFragment.EXTRA_SCREENSHOT, str);
            screenshotFragment.setArguments(bundle);
            return screenshotFragment;
        }

        private Companion() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.screenshotUrl = yq.b.a(this).getString(EXTRA_SCREENSHOT);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_screenshot, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.screenshot_view);
        u.i(findViewById, "findViewById(...)");
        this.imageView = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.screenshot_progress_view);
        u.i(findViewById2, "findViewById(...)");
        this.progressView = (ProgressBar) findViewById2;
        ImageView imageView = this.imageView;
        if (imageView != null) {
            Context context = imageView.getContext();
            u.i(context, "getContext(...)");
            f.a aVar = new f.a(context);
            aVar.d(this.screenshotUrl);
            aVar.r(new ia.a(this, this) { // from class: com.withings.wiscale2.legacyprograms.ScreenshotFragment$onViewCreated$$inlined$target$1
                @Override // ia.a
                public void onError(Drawable drawable) {
                    ProgressBar progressBar;
                    progressBar = ScreenshotFragment.this.progressView;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    } else {
                        u.s("progressView");
                        throw null;
                    }
                }

                @Override // ia.a
                public void onStart(Drawable drawable) {
                    ProgressBar progressBar;
                    progressBar = ScreenshotFragment.this.progressView;
                    if (progressBar != null) {
                        progressBar.setVisibility(0);
                    } else {
                        u.s("progressView");
                        throw null;
                    }
                }

                @Override // ia.a
                public void onSuccess(Drawable drawable) {
                    ImageView imageView2;
                    ProgressBar progressBar;
                    imageView2 = ScreenshotFragment.this.imageView;
                    if (imageView2 != null) {
                        imageView2.setImageDrawable(drawable);
                        progressBar = ScreenshotFragment.this.progressView;
                        if (progressBar != null) {
                            progressBar.setVisibility(8);
                            return;
                        } else {
                            u.s("progressView");
                            throw null;
                        }
                    }
                    u.s("imageView");
                    throw null;
                }
            });
            f b10 = aVar.b();
            ImageView imageView2 = this.imageView;
            if (imageView2 != null) {
                Context context2 = imageView2.getContext();
                u.i(context2, "getContext(...)");
                w9.a.a(context2).d(b10);
                return;
            }
            u.s("imageView");
            throw null;
        }
        u.s("imageView");
        throw null;
    }
}
