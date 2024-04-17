package com.withings.wiscale2.account.email;

import android.content.DialogInterface;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EmailModificationActivity.kt */
/* loaded from: classes4.dex */
final class e extends w implements ym0.l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EmailModificationActivity f48077a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EmailModificationActivity emailModificationActivity) {
        super(1);
        this.f48077a = emailModificationActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.withings.wiscale2.account.email.d] */
    @Override // ym0.l
    public final y invoke(Integer num) {
        Integer num2 = num;
        final EmailModificationActivity emailModificationActivity = this.f48077a;
        qc.b bVar = new qc.b(emailModificationActivity);
        u.g(num2);
        bVar.v(emailModificationActivity.getString(num2.intValue()));
        bVar.j(emailModificationActivity.getString(C1987R.string._OK_), new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.account.email.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                EmailModificationActivity this$0 = EmailModificationActivity.this;
                u.j(this$0, "this$0");
                this$0.finish();
            }
        });
        bVar.s();
        return y.f85009a;
    }
}
