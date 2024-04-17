package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.common.compose.component.AvatarSize;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.accountmeasure.unknown.ui.j;
import kotlin.jvm.internal.u;
import tb0.e1;
/* compiled from: UserAdapter.kt */
/* loaded from: classes5.dex */
public final class k extends RecyclerView.z {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f58362b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final e1 f58363a;

    public k(e1 e1Var) {
        super(e1Var.a());
        this.f58363a = e1Var;
    }

    public final void a(UserItemData userItemData, j.a callback) {
        int i11;
        u.j(callback, "callback");
        User a11 = userItemData.a();
        Boolean b10 = userItemData.b();
        e1 e1Var = this.f58363a;
        e1Var.f99015c.setText(a11.l());
        ComposeView avatar = e1Var.f99014b;
        u.i(avatar, "avatar");
        String l5 = a11.l();
        u.i(l5, "getFirstName(...)");
        String s11 = a11.s();
        u.i(s11, "getLastName(...)");
        com.withings.common.compose.component.c.f(avatar, l5, s11, a11.a(), AvatarSize.f33298c, null, null, false, null, ConstantsWs.WS_STATUS_WRONGTZNAME);
        if (u.e(b10, Boolean.TRUE)) {
            i11 = C1987R.drawable.black_circle_border_1dp;
        } else {
            i11 = C1987R.drawable.summary_user_normal;
        }
        avatar.setBackgroundResource(i11);
        e1Var.a().setOnClickListener(new com.withings.webradio.ui.b(5, callback, a11));
    }
}
