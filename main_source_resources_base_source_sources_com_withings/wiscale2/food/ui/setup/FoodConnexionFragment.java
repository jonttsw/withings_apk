package com.withings.wiscale2.food.ui.setup;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.e;
import by.kirich1409.viewbindingdelegate.f;
import com.google.android.material.button.MaterialButton;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import r8.s;
import tb0.r2;
/* compiled from: FoodSetupActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/withings/wiscale2/food/ui/setup/FoodConnexionFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lnm0/y;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ltb0/r2;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Ltb0/r2;", "binding", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodConnexionFragment extends Fragment {
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodConnexionFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentFoodConnexionBinding;", 0)};
    public static final int $stable = 8;
    private final f binding$delegate;

    public FoodConnexionFragment() {
        super(C1987R.layout.fragment_food_connexion);
        this.binding$delegate = e.a(this, new FoodConnexionFragment$special$$inlined$viewBindingFragment$default$1(), u9.a.a());
    }

    private final r2 getBinding() {
        return (r2) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1$lambda$0(boolean z5, MaterialButton this_with, FoodConnexionFragment this$0, View view) {
        u.j(this_with, "$this_with");
        u.j(this$0, "this$0");
        if (z5) {
            s.a(this_with).H(C1987R.id.food_setup_agreement, null);
            return;
        }
        Context requireContext = this$0.requireContext();
        u.i(requireContext, "requireContext(...)");
        u70.e.d(requireContext, Partner.f43455m.d());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        final boolean z5;
        int i11;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        u.i(requireContext, "requireContext(...)");
        if (u70.e.a(requireContext, Partner.f43455m.d(), null) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        final MaterialButton materialButton = getBinding().f99450a;
        if (z5) {
            i11 = C1987R.string._NEXT_;
        } else {
            i11 = C1987R.string._DOWNLOAD_;
        }
        materialButton.setText(i11);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.food.ui.setup.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FoodConnexionFragment.onViewCreated$lambda$1$lambda$0(z5, materialButton, this, view2);
            }
        });
    }
}
