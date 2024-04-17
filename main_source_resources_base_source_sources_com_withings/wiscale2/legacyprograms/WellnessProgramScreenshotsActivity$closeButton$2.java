package com.withings.wiscale2.legacyprograms;

import android.widget.ImageView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WellnessProgramScreenshotsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WellnessProgramScreenshotsActivity$closeButton$2 extends w implements ym0.a<ImageView> {
    final /* synthetic */ WellnessProgramScreenshotsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramScreenshotsActivity$closeButton$2(WellnessProgramScreenshotsActivity wellnessProgramScreenshotsActivity) {
        super(0);
        this.this$0 = wellnessProgramScreenshotsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final ImageView invoke() {
        return (ImageView) this.this$0.findViewById(C1987R.id.wellness_program_screenshot_close_button);
    }
}
