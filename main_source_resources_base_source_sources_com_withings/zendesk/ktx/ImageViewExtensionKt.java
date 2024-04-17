package com.withings.zendesk.ktx;

import android.widget.ImageView;
import com.withings.zendesk.R;
import com.withings.zendesk.models.ZendeskLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
import nm0.y;
/* compiled from: ImageViewExtension.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/widget/ImageView;", "Lcom/withings/zendesk/models/ZendeskLabel;", "zendeskLabel", "Lnm0/y;", "setGlyph", "(Landroid/widget/ImageView;Lcom/withings/zendesk/models/ZendeskLabel;)V", "zendesk_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ImageViewExtensionKt {
    public static final void setGlyph(ImageView imageView, ZendeskLabel zendeskLabel) {
        Object a11;
        u.j(imageView, "<this>");
        u.j(zendeskLabel, "zendeskLabel");
        try {
            imageView.setImageResource(imageView.getContext().getResources().getIdentifier(zendeskLabel.getGlyphName(), "drawable", imageView.getContext().getPackageName()));
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (k.b(a11) != null) {
            imageView.setImageResource(R.drawable.ic_icons_rounded_help2);
        }
    }
}
