package com.withings.wiscale2.legacyprograms;

import android.content.Intent;
import android.os.Build;
import com.withings.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import m70.i;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/user/User;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WellnessProgramDetailsActivity$user$2 extends w implements ym0.a<User> {
    final /* synthetic */ WellnessProgramDetailsActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailsActivity$user$2(WellnessProgramDetailsActivity wellnessProgramDetailsActivity) {
        super(0);
        this.this$0 = wellnessProgramDetailsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final User invoke() {
        Object parcelableExtra;
        Intent intent = this.this$0.getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT < 33) {
            parcelableExtra = intent.getParcelableExtra("EXTRA_USER");
        } else {
            parcelableExtra = intent.getParcelableExtra("EXTRA_USER", User.class);
        }
        User user = (User) parcelableExtra;
        return user == null ? i.b().e() : user;
    }
}
