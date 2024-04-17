package com.withings.wiscale2.profile;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.common.compose.component.AvatarSize;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
/* compiled from: ProfileUsersView.kt */
/* loaded from: classes5.dex */
public final class m1 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f59408a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f59409b;

    /* compiled from: ProfileUsersView.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<ComposeView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f59410a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f59410a = view;
        }

        @Override // ym0.a
        public final ComposeView invoke() {
            return (ComposeView) this.f59410a.findViewById(C1987R.id.user_image);
        }
    }

    /* compiled from: ProfileUsersView.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f59411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.f59411a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f59411a.findViewById(C1987R.id.user_name);
        }
    }

    public m1(View view) {
        super(view);
        this.f59408a = nm0.h.b(new a(view));
        this.f59409b = nm0.h.b(new b(view));
    }

    public final void a(User user) {
        kotlin.jvm.internal.u.j(user, "user");
        ((TextView) this.f59409b.getValue()).setText(user.l());
        ComposeView composeView = (ComposeView) this.f59408a.getValue();
        kotlin.jvm.internal.u.i(composeView, "<get-userImage>(...)");
        String l5 = user.l();
        kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
        String s11 = user.s();
        kotlin.jvm.internal.u.i(s11, "getLastName(...)");
        String a11 = user.a();
        AvatarSize avatarSize = AvatarSize.f33298c;
        Context context = this.itemView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        com.withings.common.compose.component.c.f(composeView, l5, s11, a11, avatarSize, Integer.valueOf(ah.u.w(C1987R.attr.colorSurface, context, -65281)), null, false, null, 224);
    }
}
