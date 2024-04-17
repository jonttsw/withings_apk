package com.withings.wiscale2.profile;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.ComposeView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.ui.activity.TutorialProxyActivity;
import com.withings.user.User;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59417a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ComposeView f59418b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q qVar, ComposeView composeView) {
        super(0);
        this.f59417a = qVar;
        this.f59418b = composeView;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        User user;
        TutorialProxyActivity.a aVar = TutorialProxyActivity.f43753g;
        Context context = this.f59418b.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        q qVar = this.f59417a;
        user = qVar.R1();
        aVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        Intent putExtra = new Intent(context, TutorialProxyActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        qVar.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}
