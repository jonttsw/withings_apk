package com.withings.wiscale2.settings;

import android.content.Intent;
import com.withings.wiscale2.C1987R;
import org.apache.http.protocol.HTTP;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class n2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60206a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(SettingsActivity settingsActivity) {
        super(0);
        this.f60206a = settingsActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        SettingsActivity settingsActivity = this.f60206a;
        intent.putExtra("android.intent.extra.TEXT", settingsActivity.getString(C1987R.string._INVITE_ANDROID_));
        settingsActivity.startActivity(Intent.createChooser(intent, settingsActivity.getString(C1987R.string._SHARE_ON_)));
        return nm0.y.f85009a;
    }
}
