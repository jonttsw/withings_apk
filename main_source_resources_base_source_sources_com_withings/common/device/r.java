package com.withings.common.device;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import kotlin.jvm.internal.u;
/* compiled from: HelpCenterHelper.kt */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f35239a = {"de", "es", "fr", "it", "ja", "ko", "nl", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "ru", "zh"};

    public static final Intent a(ch.l webIntentBuilder, Context context, fl.o deviceModel, String str) {
        u.j(webIntentBuilder, "webIntentBuilder");
        u.j(context, "context");
        u.j(deviceModel, "deviceModel");
        String language = Locale.getDefault().getLanguage();
        u.i(language, "getLanguage(...)");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        u.i(lowerCase, "toLowerCase(...)");
        if (!kotlin.collections.l.m(f35239a, lowerCase)) {
            lowerCase = null;
        }
        if (lowerCase == null) {
            lowerCase = "en";
        }
        Intent intent = ch.l.a(webIntentBuilder, context, str, null, androidx.activity.b.b("https://support.withings.com/hc/", lowerCase, "/sections/", deviceModel.A()), new HMWebViewDelegate(), 4).setClass(context, HelpCenterWebActivity.class);
        u.i(intent, "setClass(...)");
        return intent;
    }

    public static final void b(Context context) {
        String language = Locale.getDefault().getLanguage();
        u.i(language, "getLanguage(...)");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        u.i(lowerCase, "toLowerCase(...)");
        if (!kotlin.collections.l.m(f35239a, lowerCase)) {
            lowerCase = null;
        }
        if (lowerCase == null) {
            lowerCase = "en";
        }
        Intent intent = HMWebActivity.f35395c.c(context, context.getString(C1987R.string._HELP_CENTER_), "https://support.withings.com/hc/".concat(lowerCase)).setClass(context, HelpCenterWebActivity.class);
        u.i(intent, "setClass(...)");
        context.startActivity(intent);
    }

    public static final void c(ch.l lVar, Context context, fl.o oVar, String str) {
        u.j(context, "context");
        context.startActivity(a(lVar, context, oVar, str));
    }
}
