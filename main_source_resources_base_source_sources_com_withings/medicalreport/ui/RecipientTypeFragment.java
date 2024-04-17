package com.withings.medicalreport.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: RecipientTypeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/medicalreport/ui/RecipientTypeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RecipientTypeFragment extends Fragment {
    public static void s1(RecipientTypeFragment this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ah.e.a(this$0).K(new e0(true));
    }

    public static void t1(RecipientTypeFragment this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ah.e.a(this$0).K(new e0(false));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_recipient_type, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View findViewById;
        View findViewById2;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById3 = view.findViewById(C1987R.id.share_with_medical_professional);
        if (findViewById3 != null && (findViewById2 = findViewById3.findViewById(C1987R.id.share_with_medical_professional)) != null) {
            findViewById2.setOnClickListener(new sg.f(this, 4));
        }
        View findViewById4 = view.findViewById(C1987R.id.share_with_other_contacts);
        if (findViewById4 != null && (findViewById = findViewById4.findViewById(C1987R.id.share_with_other_contacts)) != null) {
            findViewById.setOnClickListener(new sg.g(this, 3));
        }
    }
}
