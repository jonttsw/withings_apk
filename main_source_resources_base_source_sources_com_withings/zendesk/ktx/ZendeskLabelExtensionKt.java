package com.withings.zendesk.ktx;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.zendesk.models.ZendeskLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
/* compiled from: ZendeskLabelExtension.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"glyphResId", "", "Lcom/withings/zendesk/models/ZendeskLabel;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "wordingResId", "", "zendesk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ZendeskLabelExtensionKt {
    public static final int glyphResId(ZendeskLabel zendeskLabel, Context context) {
        u.j(zendeskLabel, "<this>");
        u.j(context, "context");
        return context.getResources().getIdentifier(zendeskLabel.getGlyphName(), "drawable", context.getPackageName());
    }

    public static final String wordingResId(ZendeskLabel zendeskLabel, Context context) {
        Object a11;
        u.j(zendeskLabel, "<this>");
        u.j(context, "context");
        try {
            a11 = context.getString(context.getResources().getIdentifier(zendeskLabel.getWordingKey(), "string", context.getPackageName()));
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (k.b(a11) != null) {
            a11 = zendeskLabel.getZendeskLabel();
        }
        u.i(a11, "getOrElse(...)");
        return (String) a11;
    }
}
