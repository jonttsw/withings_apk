package com.withings.wiscale2.food.ui.display;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.camera.core.v;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import bn0.d;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.util.ui.CustomTextAppearanceSpan;
import com.withings.views.measure.detail.ui.views.DataView;
import com.withings.views.view.CustomScrollViewGroup;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.model.FoodDayData;
import com.withings.wiscale2.food.model.MealAggregate;
import com.withings.wiscale2.food.model.MealName;
import fn0.k;
import java.io.Serializable;
import java.util.List;
import jm.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.g;
import nm0.h;
import org.joda.time.DateTime;
/* compiled from: FoodDayFragment.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0002XYB\u0007¢\u0006\u0004\bW\u0010\u001fJ'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010#\u001a\u00020\t2\n\u0010\"\u001a\u00060!R\u00020\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodDayFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/CustomScrollViewGroup$b;", "", "isUnderBudget", "Lcom/withings/wiscale2/food/model/FoodDayData;", "foodDayData", "", "remainingCaloriesValue", "Lnm0/y;", "setGoalRing", "(ZLcom/withings/wiscale2/food/model/FoodDayData;I)V", "setRemainingCalories", "(IZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "onAttach", "(Landroid/content/Context;)V", "onDetach", "()V", "loadAndShowData", "Lcom/withings/wiscale2/food/ui/display/FoodDayFragment$FoodDayDataHolder;", "foodDayDataHolder", "showData", "(Lcom/withings/wiscale2/food/ui/display/FoodDayFragment$FoodDayDataHolder;)V", "getScrollY", "()I", "getMaxScrollY", "currY", "scrollTo", "(I)V", "Landroid/widget/ProgressBar;", "progressView", "Landroid/widget/ProgressBar;", "Lcom/withings/views/view/CustomScrollViewGroup;", "scrollViewGroup", "Lcom/withings/views/view/CustomScrollViewGroup;", "Landroidx/core/widget/NestedScrollView;", "scrollView", "Landroidx/core/widget/NestedScrollView;", "Lcom/withings/views/measure/detail/ui/views/DataView;", "remainingCalories", "Lcom/withings/views/measure/detail/ui/views/DataView;", "Landroidx/compose/ui/platform/ComposeView;", "caloriesGoalRing", "Landroidx/compose/ui/platform/ComposeView;", "Lcom/withings/views/widget/LineCellView;", "eatenCalories", "Lcom/withings/views/widget/LineCellView;", "activityCalories", "initialGoalCalories", "mealsSeparator", "Landroid/view/View;", "macroMealsLayout", "Landroid/view/ViewGroup;", "Lcom/withings/wiscale2/food/ui/display/MacroMealsView;", "macroMealsView", "Lcom/withings/wiscale2/food/ui/display/MacroMealsView;", "Ljm/a;", "measureFormatter", "Ljm/a;", "Lcom/withings/user/User;", "user$delegate", "Lbn0/d;", "getUser", "()Lcom/withings/user/User;", "user", "Lorg/joda/time/DateTime;", "day$delegate", "Lnm0/g;", "getDay", "()Lorg/joda/time/DateTime;", FoodDayFragment.ARG_DAY, "delegate", "Lcom/withings/views/view/CustomScrollViewGroup$b;", "<init>", "Companion", "FoodDayDataHolder", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodDayFragment extends Fragment implements CustomScrollViewGroup.b {
    public static final String ARG_DAY = "day";
    private static final String ARG_USER = "user";
    private static final int HACK_SCROLL_OFFSET = 1000;
    private LineCellView activityCalories;
    private ComposeView caloriesGoalRing;
    private CustomScrollViewGroup.b delegate;
    private LineCellView eatenCalories;
    private LineCellView initialGoalCalories;
    private ViewGroup macroMealsLayout;
    private MacroMealsView macroMealsView;
    private View mealsSeparator;
    private jm.a measureFormatter;
    private ProgressBar progressView;
    private DataView remainingCalories;
    private NestedScrollView scrollView;
    private CustomScrollViewGroup scrollViewGroup;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodDayFragment.class, "user", "getUser()Lcom/withings/user/User;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final d user$delegate = new d<Fragment, User>() { // from class: com.withings.wiscale2.food.ui.display.FoodDayFragment$special$$inlined$argument$1
        private final g value$delegate = h.b(new AnonymousClass1());

        /* compiled from: Fragment.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.withings.wiscale2.food.ui.display.FoodDayFragment$special$$inlined$argument$1$1  reason: invalid class name */
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
    private final g day$delegate = h.b(new FoodDayFragment$day$2(this));

    /* compiled from: FoodDayFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodDayFragment$Companion;", "", "()V", "ARG_DAY", "", "ARG_USER", "HACK_SCROLL_OFFSET", "", "newInstance", "Lcom/withings/wiscale2/food/ui/display/FoodDayFragment;", "user", "Lcom/withings/user/User;", FoodDayFragment.ARG_DAY, "Lorg/joda/time/DateTime;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FoodDayFragment newInstance(User user, DateTime day) {
            u.j(user, "user");
            u.j(day, "day");
            FoodDayFragment foodDayFragment = new FoodDayFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("user", user);
            bundle.putSerializable(FoodDayFragment.ARG_DAY, day);
            foodDayFragment.setArguments(bundle);
            return foodDayFragment;
        }

        private Companion() {
        }
    }

    /* compiled from: FoodDayFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodDayFragment$FoodDayDataHolder;", "", "foodDayData", "Lcom/withings/wiscale2/food/model/FoodDayData;", "mealNames", "", "Lcom/withings/wiscale2/food/model/MealName;", "(Lcom/withings/wiscale2/food/ui/display/FoodDayFragment;Lcom/withings/wiscale2/food/model/FoodDayData;Ljava/util/List;)V", "getFoodDayData", "()Lcom/withings/wiscale2/food/model/FoodDayData;", "setFoodDayData", "(Lcom/withings/wiscale2/food/model/FoodDayData;)V", "getMealNames", "()Ljava/util/List;", "setMealNames", "(Ljava/util/List;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public final class FoodDayDataHolder {
        private FoodDayData foodDayData;
        private List<MealName> mealNames;
        final /* synthetic */ FoodDayFragment this$0;

        public FoodDayDataHolder(FoodDayFragment foodDayFragment, FoodDayData foodDayData, List<MealName> mealNames) {
            u.j(foodDayData, "foodDayData");
            u.j(mealNames, "mealNames");
            this.this$0 = foodDayFragment;
            this.foodDayData = foodDayData;
            this.mealNames = mealNames;
        }

        public final FoodDayData getFoodDayData() {
            return this.foodDayData;
        }

        public final List<MealName> getMealNames() {
            return this.mealNames;
        }

        public final void setFoodDayData(FoodDayData foodDayData) {
            u.j(foodDayData, "<set-?>");
            this.foodDayData = foodDayData;
        }

        public final void setMealNames(List<MealName> list) {
            u.j(list, "<set-?>");
            this.mealNames = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DateTime getDay() {
        return (DateTime) this.day$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.user$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final void setGoalRing(boolean z5, FoodDayData foodDayData, int i11) {
        ComposeView composeView = this.caloriesGoalRing;
        if (composeView != null) {
            composeView.setContent(new s1.a(true, -1326319418, new FoodDayFragment$setGoalRing$1(z5, foodDayData, i11)));
        } else {
            u.s("caloriesGoalRing");
            throw null;
        }
    }

    private final void setRemainingCalories(int i11, boolean z5) {
        int i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        jm.a aVar = this.measureFormatter;
        if (aVar != null) {
            spannableStringBuilder.append((CharSequence) jm.a.c(aVar, 87, Math.abs(i11), 0, 0, 60));
            if (!z5) {
                CustomScrollViewGroup customScrollViewGroup = this.scrollViewGroup;
                if (customScrollViewGroup != null) {
                    Context context = customScrollViewGroup.getContext();
                    u.i(context, "getContext(...)");
                    CustomTextAppearanceSpan customTextAppearanceSpan = new CustomTextAppearanceSpan(context, C1987R.style.data7);
                    int length = spannableStringBuilder.length();
                    String string = getString(C1987R.string._CALORIES_OVER_);
                    spannableStringBuilder.append((CharSequence) (" " + string));
                    spannableStringBuilder.setSpan(customTextAppearanceSpan, length, spannableStringBuilder.length(), 17);
                } else {
                    u.s("scrollViewGroup");
                    throw null;
                }
            }
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            DataView dataView = this.remainingCalories;
            if (dataView != null) {
                dataView.setValue(spannedString);
                DataView dataView2 = this.remainingCalories;
                if (dataView2 != null) {
                    if (z5) {
                        i12 = C1987R.string._FOOD_REMAINING_;
                    } else {
                        i12 = C1987R.string._FOOD_OUT_OF_BUDGET_;
                    }
                    dataView2.setLabel(i12);
                    return;
                }
                u.s("remainingCalories");
                throw null;
            }
            u.s("remainingCalories");
            throw null;
        }
        u.s("measureFormatter");
        throw null;
    }

    @Override // com.withings.views.view.CustomScrollViewGroup.b
    public int getMaxScrollY() {
        int i11;
        CustomScrollViewGroup.b bVar = this.delegate;
        if (bVar != null) {
            i11 = bVar.getMaxScrollY();
        } else {
            i11 = 0;
        }
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            return nestedScrollView.getHeight() + i11 + 1000;
        }
        u.s("scrollView");
        throw null;
    }

    @Override // com.withings.views.view.CustomScrollViewGroup.b
    public int getScrollY() {
        int i11;
        CustomScrollViewGroup.b bVar = this.delegate;
        if (bVar != null) {
            i11 = bVar.getScrollY();
        } else {
            i11 = 0;
        }
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            return nestedScrollView.getScrollY() + i11;
        }
        u.s("scrollView");
        throw null;
    }

    public final void loadAndShowData() {
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new FoodDayFragment$loadAndShowData$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        loadAndShowData();
        if (context instanceof CustomScrollViewGroup.b) {
            this.delegate = (CustomScrollViewGroup.b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        View inflate = inflater.inflate(C1987R.layout.fragment_food_day, viewGroup, false);
        u.i(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        vh.h.k(this);
        this.delegate = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        this.measureFormatter = a.d.a(context);
        View findViewById = view.findViewById(C1987R.id.progress_view);
        u.i(findViewById, "findViewById(...)");
        this.progressView = (ProgressBar) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.scroll_view_group);
        u.i(findViewById2, "findViewById(...)");
        this.scrollViewGroup = (CustomScrollViewGroup) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.scroll_view);
        u.i(findViewById3, "findViewById(...)");
        this.scrollView = (NestedScrollView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.calories);
        u.i(findViewById4, "findViewById(...)");
        this.remainingCalories = (DataView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.calories_goal);
        u.i(findViewById5, "findViewById(...)");
        this.caloriesGoalRing = (ComposeView) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.eaten_calories);
        u.i(findViewById6, "findViewById(...)");
        this.eatenCalories = (LineCellView) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.activity_calories);
        u.i(findViewById7, "findViewById(...)");
        this.activityCalories = (LineCellView) findViewById7;
        View findViewById8 = view.findViewById(C1987R.id.initial_goal_calories);
        u.i(findViewById8, "findViewById(...)");
        this.initialGoalCalories = (LineCellView) findViewById8;
        View findViewById9 = view.findViewById(C1987R.id.meals_separator);
        u.i(findViewById9, "findViewById(...)");
        this.mealsSeparator = findViewById9;
        View findViewById10 = view.findViewById(C1987R.id.macro_meals_layout);
        u.i(findViewById10, "findViewById(...)");
        this.macroMealsLayout = (ViewGroup) findViewById10;
        View findViewById11 = view.findViewById(C1987R.id.macro_meals_view);
        u.i(findViewById11, "findViewById(...)");
        this.macroMealsView = (MacroMealsView) findViewById11;
        CustomScrollViewGroup customScrollViewGroup = this.scrollViewGroup;
        if (customScrollViewGroup != null) {
            customScrollViewGroup.setDelegate(this);
        } else {
            u.s("scrollViewGroup");
            throw null;
        }
    }

    @Override // com.withings.views.view.CustomScrollViewGroup.b
    public void scrollTo(int i11) {
        int i12;
        CustomScrollViewGroup.b bVar = this.delegate;
        if (bVar != null) {
            bVar.scrollTo(i11);
        }
        CustomScrollViewGroup.b bVar2 = this.delegate;
        if (bVar2 != null) {
            i12 = bVar2.getScrollY();
        } else {
            i12 = 0;
        }
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, i11 - i12);
        } else {
            u.s("scrollView");
            throw null;
        }
    }

    public final void showData(FoodDayDataHolder foodDayDataHolder) {
        boolean z5;
        u.j(foodDayDataHolder, "foodDayDataHolder");
        FoodDayData foodDayData = foodDayDataHolder.getFoodDayData();
        List<MealName> mealNames = foodDayDataHolder.getMealNames();
        MealAggregate dailyMealAggregate = foodDayData.getDailyMealAggregate();
        if (foodDayData.getEatenCalories() <= foodDayData.getTotalBudget()) {
            z5 = true;
        } else {
            z5 = false;
        }
        int totalBudget = foodDayData.getTotalBudget() - foodDayData.getEatenCalories();
        setRemainingCalories(totalBudget, z5);
        setGoalRing(z5, foodDayData, totalBudget);
        LineCellView lineCellView = this.eatenCalories;
        if (lineCellView != null) {
            jm.a aVar = this.measureFormatter;
            if (aVar != null) {
                lineCellView.setValue(aVar.f(foodDayData.getEatenCalories(), 87));
                LineCellView lineCellView2 = this.activityCalories;
                if (lineCellView2 != null) {
                    jm.a aVar2 = this.measureFormatter;
                    if (aVar2 != null) {
                        lineCellView2.setValue(aVar2.f(foodDayData.getEarnedCalories(), 87));
                        LineCellView lineCellView3 = this.initialGoalCalories;
                        if (lineCellView3 != null) {
                            jm.a aVar3 = this.measureFormatter;
                            if (aVar3 != null) {
                                lineCellView3.setValue(aVar3.f(foodDayData.getInitialBudget(), 87));
                                if (dailyMealAggregate.getMeals().isEmpty()) {
                                    View view = this.mealsSeparator;
                                    if (view != null) {
                                        view.setVisibility(8);
                                        ViewGroup viewGroup = this.macroMealsLayout;
                                        if (viewGroup != null) {
                                            viewGroup.setVisibility(8);
                                            return;
                                        } else {
                                            u.s("macroMealsLayout");
                                            throw null;
                                        }
                                    }
                                    u.s("mealsSeparator");
                                    throw null;
                                }
                                MacroMealsView macroMealsView = this.macroMealsView;
                                if (macroMealsView != null) {
                                    macroMealsView.setMacroMeals(dailyMealAggregate, mealNames);
                                    return;
                                } else {
                                    u.s("macroMealsView");
                                    throw null;
                                }
                            }
                            u.s("measureFormatter");
                            throw null;
                        }
                        u.s("initialGoalCalories");
                        throw null;
                    }
                    u.s("measureFormatter");
                    throw null;
                }
                u.s("activityCalories");
                throw null;
            }
            u.s("measureFormatter");
            throw null;
        }
        u.s("eatenCalories");
        throw null;
    }
}
