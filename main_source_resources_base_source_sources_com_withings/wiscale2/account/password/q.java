package com.withings.wiscale2.account.password;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PasswordExpiredActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/account/password/q;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class q extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private a f48178c;

    /* compiled from: PasswordExpiredActivity.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void m1(q qVar);
    }

    public q() {
        super(C1987R.layout.fragment_password_expired_information);
    }

    public static void s1(q this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f48178c;
        if (aVar != null) {
            aVar.m1(this$0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        this.f48178c = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f48178c = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ((Button) view.findViewById(C1987R.id.button)).setOnClickListener(new gi.f(this, 7));
    }
}
