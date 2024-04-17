package com.withings.wiscale2.food.ui.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.navigation.e;
import bn0.d;
import by.kirich1409.viewbindingdelegate.b;
import by.kirich1409.viewbindingdelegate.f;
import com.withings.android.activity.WithingsActivity;
import com.withings.authentication.n;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import fn0.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import nm0.g;
import nm0.h;
import tb0.r;
/* compiled from: FoodSetupActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b \u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/withings/wiscale2/food/ui/setup/FoodSetupActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lnm0/y;", "initToolbar", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "Ltb0/r;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Ltb0/r;", "binding", "Landroidx/navigation/e;", "navController$delegate", "Lnm0/g;", "getNavController", "()Landroidx/navigation/e;", "navController", "showAgreement$delegate", "Lbn0/d;", "getShowAgreement", "()Z", "showAgreement", "<init>", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodSetupActivity extends WithingsActivity {
    private static final String EXTRA_SHOW_AGREEMENT = "EXTRA_SHOW_AGREEMENT";
    private final f binding$delegate;
    private final g navController$delegate;
    private final d showAgreement$delegate;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodSetupActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityFoodSetupBinding;", 0), v.c(FoodSetupActivity.class, "showAgreement", "getShowAgreement()Z", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FoodSetupActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/food/ui/setup/FoodSetupActivity$Companion;", "", "()V", FoodSetupActivity.EXTRA_SHOW_AGREEMENT, "", "createIntent", "Landroid/content/Intent;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "showAgreement", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static /* synthetic */ Intent createIntent$default(Companion companion, Context context, boolean z5, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z5 = false;
            }
            return companion.createIntent(context, z5);
        }

        public final Intent createIntent(Context context, boolean z5) {
            Intent putExtra = n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, FoodSetupActivity.class).putExtra(FoodSetupActivity.EXTRA_SHOW_AGREEMENT, z5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        private Companion() {
        }
    }

    public FoodSetupActivity() {
        super(C1987R.layout.activity_food_setup);
        this.binding$delegate = b.a(this, u9.a.a(), new FoodSetupActivity$special$$inlined$viewBindingActivity$1(C1987R.id.container));
        this.navController$delegate = h.b(new FoodSetupActivity$navController$2(this));
        this.showAgreement$delegate = new d<Activity, Boolean>() { // from class: com.withings.wiscale2.food.ui.setup.FoodSetupActivity$special$$inlined$extra$1
            private final g value$delegate = h.b(new AnonymousClass1());

            /* compiled from: Activity.kt */
            @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.wiscale2.food.ui.setup.FoodSetupActivity$special$$inlined$extra$1$1  reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends w implements ym0.a<Boolean> {
                public AnonymousClass1() {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
                @Override // ym0.a
                public final Boolean invoke() {
                    return getExtra();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final Boolean getExtra() {
                if (Parcelable.class.isAssignableFrom(Boolean.class)) {
                    return (Boolean) b0.F(this, r2);
                }
                if (Serializable.class.isAssignableFrom(Boolean.class)) {
                    return (Boolean) b0.H(this, r2);
                }
                String str = r2;
                fn0.d b10 = q0.b(Boolean.class);
                throw new IllegalArgumentException("extra " + str + " of class " + b10 + " is not supported");
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Boolean, java.lang.Object] */
            /* renamed from: getValue  reason: avoid collision after fix types in other method */
            public Boolean getValue2(Activity thisRef, k<?> property) {
                u.j(thisRef, "thisRef");
                u.j(property, "property");
                return getValue();
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, java.lang.Object] */
            @Override // bn0.d
            public /* bridge */ /* synthetic */ Boolean getValue(Activity activity, k kVar) {
                return getValue2(activity, (k<?>) kVar);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
            public final Boolean getValue() {
                return this.value$delegate.getValue();
            }
        };
    }

    public static final Intent createIntent(Context context, boolean z5) {
        return Companion.createIntent(context, z5);
    }

    private final r getBinding() {
        T value = this.binding$delegate.getValue(this, $$delegatedProperties[0]);
        u.i(value, "getValue(...)");
        return (r) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e getNavController() {
        return (e) this.navController$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShowAgreement() {
        return ((Boolean) this.showAgreement$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initToolbar() {
        setSupportActionBar(getBinding().f99443a);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.s(y70.a.c(2131230989, this, getColor(C1987R.color.textPrimary)));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!getNavController().N()) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new FoodSetupActivity$onCreate$1(this, null), 3, null);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
