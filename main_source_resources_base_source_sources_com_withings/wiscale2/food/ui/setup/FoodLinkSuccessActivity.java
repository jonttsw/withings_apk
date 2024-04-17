package com.withings.wiscale2.food.ui.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.core.v;
import bn0.d;
import com.google.android.material.button.MaterialButton;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import fn0.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import tb0.s;
/* compiled from: FoodLinkSuccessActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/withings/wiscale2/food/ui/setup/FoodLinkSuccessActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lnm0/y;", "checkMyFitnessPalLinkedStatus", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/withings/partner/model/Partner;", "partner$delegate", "Lbn0/d;", "getPartner", "()Lcom/withings/partner/model/Partner;", "partner", "Ltb0/s;", "binding", "Ltb0/s;", "<init>", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodLinkSuccessActivity extends WithingsActivity {
    private static final String EXTRA_PARTNER = "extra_user";
    private s binding;
    private final d partner$delegate = new d<Activity, Partner>() { // from class: com.withings.wiscale2.food.ui.setup.FoodLinkSuccessActivity$special$$inlined$extra$1
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Activity.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.wiscale2.food.ui.setup.FoodLinkSuccessActivity$special$$inlined$extra$1$1  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1 extends w implements ym0.a<Partner> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.partner.model.Partner, java.lang.Object] */
            @Override // ym0.a
            public final Partner invoke() {
                return getExtra();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Partner getExtra() {
            if (Parcelable.class.isAssignableFrom(Partner.class)) {
                return (Partner) b0.F(this, r2);
            }
            if (Serializable.class.isAssignableFrom(Partner.class)) {
                return (Partner) b0.H(this, r2);
            }
            String str = r2;
            fn0.d b10 = q0.b(Partner.class);
            throw new IllegalArgumentException("extra " + str + " of class " + b10 + " is not supported");
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.partner.model.Partner, java.lang.Object] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public Partner getValue2(Activity thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.withings.partner.model.Partner, java.lang.Object] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ Partner getValue(Activity activity, k kVar) {
            return getValue2(activity, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.partner.model.Partner, java.lang.Object] */
        public final Partner getValue() {
            return this.value$delegate.getValue();
        }
    };
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodLinkSuccessActivity.class, "partner", "getPartner()Lcom/withings/partner/model/Partner;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FoodLinkSuccessActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/food/ui/setup/FoodLinkSuccessActivity$Companion;", "", "()V", "EXTRA_PARTNER", "", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "partner", "Lcom/withings/partner/model/Partner;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent createIntent(Context context, Partner partner) {
            u.j(context, "context");
            u.j(partner, "partner");
            Intent putExtra = new Intent(context, FoodLinkSuccessActivity.class).putExtra("extra_user", partner);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    private final void checkMyFitnessPalLinkedStatus() {
        if (getPartner().L()) {
            s sVar = this.binding;
            if (sVar != null) {
                MaterialButton foodLinkSuccessButton = sVar.f99457b;
                u.i(foodLinkSuccessButton, "foodLinkSuccessButton");
                foodLinkSuccessButton.setVisibility(0);
                s sVar2 = this.binding;
                if (sVar2 != null) {
                    sVar2.f99457b.setOnClickListener(new sg.g(this, 15));
                    return;
                }
                u.s("binding");
                throw null;
            }
            u.s("binding");
            throw null;
        }
        finish();
    }

    public static final void checkMyFitnessPalLinkedStatus$lambda$0(FoodLinkSuccessActivity this$0, View view) {
        u.j(this$0, "this$0");
        this$0.finish();
    }

    public static final Intent createIntent(Context context, Partner partner) {
        return Companion.createIntent(context, partner);
    }

    private final Partner getPartner() {
        return (Partner) this.partner$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s b10 = s.b(getLayoutInflater());
        this.binding = b10;
        setContentView(b10.a());
        s sVar = this.binding;
        if (sVar != null) {
            LinearLayout successLayout = sVar.f99458c;
            u.i(successLayout, "successLayout");
            successLayout.setVisibility(0);
            checkMyFitnessPalLinkedStatus();
            return;
        }
        u.s("binding");
        throw null;
    }
}
