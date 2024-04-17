package com.withings.wiscale2.food.ui.setup;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.e;
import by.kirich1409.viewbindingdelegate.f;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import m70.i;
import nm0.k;
import nm0.l;
import tb0.q2;
import vf.c;
import vh0.b;
/* compiled from: FoodSetupActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/withings/wiscale2/food/ui/setup/FoodAgreementFragment;", "Landroidx/fragment/app/Fragment;", "Lnm0/y;", "linkMyFitnessPalWithOldWay", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ltb0/q2;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Ltb0/q2;", "binding", "<init>", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodAgreementFragment extends Fragment {
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodAgreementFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentFoodAgreementBinding;", 0)};
    public static final int $stable = 8;
    private final f binding$delegate;

    public FoodAgreementFragment() {
        super(C1987R.layout.fragment_food_agreement);
        this.binding$delegate = e.a(this, new FoodAgreementFragment$special$$inlined$viewBindingFragment$default$1(), u9.a.a());
    }

    private final q2 getBinding() {
        return (q2) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void linkMyFitnessPalWithOldWay() {
        Object a11;
        Context requireContext;
        Partner partner;
        c cVar;
        try {
            requireContext = requireContext();
            u.i(requireContext, "requireContext(...)");
            partner = Partner.f43455m;
            cVar = c.f103617d;
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (cVar != null) {
            i b10 = i.b();
            u.i(b10, "get(...)");
            a11 = new b(requireContext, partner, cVar, b10, AccountSessionRepository.a.a()).call();
            if (!(a11 instanceof k.a)) {
                startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse((String) a11)));
            }
            if (nm0.k.b(a11) != null) {
                Toast.makeText(requireContext(), (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 1).show();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }

    public static final void onViewCreated$lambda$0(FoodAgreementFragment this$0, View view) {
        u.j(this$0, "this$0");
        this$0.linkMyFitnessPalWithOldWay();
        this$0.requireActivity().finish();
    }

    public static /* synthetic */ void s1(FoodAgreementFragment foodAgreementFragment, View view) {
        onViewCreated$lambda$0(foodAgreementFragment, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        getBinding().f99438a.setOnClickListener(new com.google.android.material.search.k(this, 15));
    }
}
