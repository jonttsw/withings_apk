package com.withings.wiscale2.food.ui.display;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.camera.core.v;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.media3.ui.i;
import bn0.d;
import com.google.android.material.bottomsheet.l;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import com.withings.views.view.SectionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.goal.ui.WeightGoalActivity;
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
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import u70.e;
/* compiled from: FoodOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodOptionSheetFragment;", "Lcom/google/android/material/bottomsheet/l;", "Lnm0/y;", "showHelps", "()V", "Landroid/app/Dialog;", "dialog", "", XHTMLText.STYLE, "setupDialog", "(Landroid/app/Dialog;I)V", "Lcom/withings/user/User;", "user$delegate", "Lbn0/d;", "getUser", "()Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/views/widget/LineCellView;", "chooseTargetWeight", "Lcom/withings/views/widget/LineCellView;", "getChooseTargetWeight", "()Lcom/withings/views/widget/LineCellView;", "setChooseTargetWeight", "(Lcom/withings/views/widget/LineCellView;)V", "addMeal", "getAddMeal", "setAddMeal", "Landroidx/compose/ui/platform/ComposeView;", "helpsSection", "Landroidx/compose/ui/platform/ComposeView;", "getHelpsSection", "()Landroidx/compose/ui/platform/ComposeView;", "setHelpsSection", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/withings/views/view/SectionView;", "helpsTitle", "Lcom/withings/views/view/SectionView;", "getHelpsTitle", "()Lcom/withings/views/view/SectionView;", "setHelpsTitle", "(Lcom/withings/views/view/SectionView;)V", "<init>", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodOptionSheetFragment extends l {
    public static final String EXTRA_USER = "extra_user";
    public LineCellView addMeal;
    public LineCellView chooseTargetWeight;
    public ComposeView helpsSection;
    public SectionView helpsTitle;
    private final d user$delegate = new d<Fragment, User>() { // from class: com.withings.wiscale2.food.ui.display.FoodOptionSheetFragment$special$$inlined$argument$1
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Fragment.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.wiscale2.food.ui.display.FoodOptionSheetFragment$special$$inlined$argument$1$1  reason: invalid class name */
        /* loaded from: classes5.dex */
        public static final class AnonymousClass1 extends w implements ym0.a<User> {
            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.user.User, java.lang.Object] */
            @Override // ym0.a
            public final User invoke() {
                return getArgument();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final User getArgument() {
            if (Parcelable.class.isAssignableFrom(User.class)) {
                return (User) yq.b.d(Fragment.this, r2);
            }
            if (Serializable.class.isAssignableFrom(User.class)) {
                return (User) yq.b.e(Fragment.this, r2);
            }
            String str = r2;
            fn0.d b10 = q0.b(User.class);
            throw new IllegalArgumentException("extra " + str + " of class " + b10 + " is not supported");
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.user.User, java.lang.Object] */
        /* renamed from: getValue  reason: avoid collision after fix types in other method */
        public User getValue2(Fragment thisRef, k<?> property) {
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return getValue();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public /* bridge */ /* synthetic */ User getValue(Fragment fragment, k kVar) {
            return getValue2(fragment, (k<?>) kVar);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.user.User, java.lang.Object] */
        public final User getValue() {
            return this.value$delegate.getValue();
        }
    };
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodOptionSheetFragment.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FoodOptionSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodOptionSheetFragment$Companion;", "", "()V", "EXTRA_USER", "", "newInstance", "Lcom/withings/wiscale2/food/ui/display/FoodOptionSheetFragment;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FoodOptionSheetFragment newInstance(User user) {
            u.j(user, "user");
            FoodOptionSheetFragment foodOptionSheetFragment = new FoodOptionSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_user", user);
            foodOptionSheetFragment.setArguments(bundle);
            return foodOptionSheetFragment;
        }

        private Companion() {
        }
    }

    private final User getUser() {
        return (User) this.user$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public static final void setupDialog$lambda$0(FoodOptionSheetFragment this$0, View view) {
        u.j(this$0, "this$0");
        this$0.startActivity(WeightGoalActivity.D3(view.getContext(), this$0.getUser()));
        this$0.dismiss();
    }

    public static final void setupDialog$lambda$1(FoodOptionSheetFragment this$0, View view) {
        u.j(this$0, "this$0");
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        e.d(context, Partner.f43455m.d());
        this$0.dismiss();
    }

    private final void showHelps() {
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new FoodOptionSheetFragment$showHelps$1(this, null), 3, null);
    }

    public static /* synthetic */ void t1(FoodOptionSheetFragment foodOptionSheetFragment, View view) {
        setupDialog$lambda$1(foodOptionSheetFragment, view);
    }

    public final LineCellView getAddMeal() {
        LineCellView lineCellView = this.addMeal;
        if (lineCellView != null) {
            return lineCellView;
        }
        u.s("addMeal");
        throw null;
    }

    public final LineCellView getChooseTargetWeight() {
        LineCellView lineCellView = this.chooseTargetWeight;
        if (lineCellView != null) {
            return lineCellView;
        }
        u.s("chooseTargetWeight");
        throw null;
    }

    public final ComposeView getHelpsSection() {
        ComposeView composeView = this.helpsSection;
        if (composeView != null) {
            return composeView;
        }
        u.s("helpsSection");
        throw null;
    }

    public final SectionView getHelpsTitle() {
        SectionView sectionView = this.helpsTitle;
        if (sectionView != null) {
            return sectionView;
        }
        u.s("helpsTitle");
        throw null;
    }

    public final void setAddMeal(LineCellView lineCellView) {
        u.j(lineCellView, "<set-?>");
        this.addMeal = lineCellView;
    }

    public final void setChooseTargetWeight(LineCellView lineCellView) {
        u.j(lineCellView, "<set-?>");
        this.chooseTargetWeight = lineCellView;
    }

    public final void setHelpsSection(ComposeView composeView) {
        u.j(composeView, "<set-?>");
        this.helpsSection = composeView;
    }

    public final void setHelpsTitle(SectionView sectionView) {
        u.j(sectionView, "<set-?>");
        this.helpsTitle = sectionView;
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public void setupDialog(Dialog dialog, int i11) {
        u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = View.inflate(getContext(), C1987R.layout.dialog_food, null);
        dialog.setContentView(inflate);
        View findViewById = inflate.findViewById(C1987R.id.dialog_food_choose_target_weight);
        u.i(findViewById, "findViewById(...)");
        setChooseTargetWeight((LineCellView) findViewById);
        View findViewById2 = inflate.findViewById(C1987R.id.dialog_food_add_meal);
        u.i(findViewById2, "findViewById(...)");
        setAddMeal((LineCellView) findViewById2);
        View findViewById3 = inflate.findViewById(C1987R.id.dialog_food_helps_container);
        u.i(findViewById3, "findViewById(...)");
        setHelpsSection((ComposeView) findViewById3);
        View findViewById4 = inflate.findViewById(C1987R.id.dialog_food_help_title);
        u.i(findViewById4, "findViewById(...)");
        setHelpsTitle((SectionView) findViewById4);
        getChooseTargetWeight().setOnClickListener(new androidx.media3.ui.h(this, 16));
        getAddMeal().setOnClickListener(new i(this, 17));
        showHelps();
    }
}
