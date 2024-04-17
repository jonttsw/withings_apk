package com.withings.wiscale2.legacyprograms;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.wiscale2.C1987R;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Bind;
import w9.g;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/ScreenshotHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "", "screenshotUrl", "Lnm0/y;", Bind.ELEMENT, "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "Landroid/widget/ImageView;", "<init>", "(Landroid/view/View;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScreenshotHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private final ImageView image;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotHolder(View view) {
        super(view);
        u.j(view, "view");
        this.view = view;
        this.image = (ImageView) view.findViewById(C1987R.id.screenshot_image);
    }

    public final void bind(String str) {
        if (str != null) {
            ImageView image = this.image;
            u.i(image, "image");
            g a11 = w9.a.a(image.getContext());
            f.a aVar = new f.a(image.getContext());
            aVar.d(str);
            aVar.q(image);
            aVar.k(C1987R.drawable.screenshot_placeholder);
            a11.d(aVar.b());
        }
    }

    public final View getView() {
        return this.view;
    }
}
