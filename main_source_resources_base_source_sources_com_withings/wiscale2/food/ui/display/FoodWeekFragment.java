package com.withings.wiscale2.food.ui.display;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.core.v;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import bn0.d;
import by.kirich1409.viewbindingdelegate.e;
import by.kirich1409.viewbindingdelegate.f;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.measure.detail.ui.views.DataView;
import com.withings.views.view.CustomFrameLayout;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.model.FoodWeekData;
import com.withings.wiscale2.food.model.MealAggregate;
import com.withings.wiscale2.food.model.MealName;
import com.withings.wiscale2.food.ui.graph.FoodDataHolder;
import com.withings.wiscale2.food.ui.graph.FoodWeekGraphFactory;
import fm.c;
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
import nm0.h;
import org.joda.time.DateTime;
import tb0.s2;
import ys.g;
/* compiled from: FoodWeekFragment.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002JKB\u0007¢\u0006\u0004\bI\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0007J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J1\u00102\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010'\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/CustomNestedScrollView$c;", "Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$ClickOnDatumListener;", "Lys/g$a;", "Lnm0/y;", "loadAndShowData", "()V", "Lcom/withings/wiscale2/food/ui/display/FoodWeekDataHolder;", "foodWeekDataHolder", "showData", "(Lcom/withings/wiscale2/food/ui/display/FoodWeekDataHolder;)V", "Lcom/withings/wiscale2/food/model/FoodWeekData;", "foodWeekData", "initGraphView", "(Lcom/withings/wiscale2/food/model/FoodWeekData;)V", "initCustomNestedScrollView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "onAttach", "(Landroid/content/Context;)V", "onDetach", "onDestroy", "", "scrollBy", "customScrollTo", "(I)V", "Lcom/withings/views/view/CustomNestedScrollView;", "scrollView", "scrolledBy", "onScrolled", "(Lcom/withings/views/view/CustomNestedScrollView;I)V", "Lorg/joda/time/DateTime;", "day", "onDatumClickListener", "(Lorg/joda/time/DateTime;)V", "Lcom/withings/graph/GraphView;", "graphView", "Lys/g;", "popup", "Lrs/e;", "datum", "Landroid/graphics/PointF;", "position", "onPopupDisplayChanged", "(Lcom/withings/graph/GraphView;Lys/g;Lrs/e;Landroid/graphics/PointF;)V", "Ltb0/s2;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Ltb0/s2;", "binding", "Lcom/withings/user/User;", "user$delegate", "Lbn0/d;", "getUser", "()Lcom/withings/user/User;", "user", "day$delegate", "Lnm0/g;", "getDay", "()Lorg/joda/time/DateTime;", "Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment$Delegate;", "delegate", "Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment$Delegate;", "currentScroll", "I", "<init>", "Companion", "Delegate", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodWeekFragment extends Fragment implements CustomNestedScrollView.c, FoodWeekGraphFactory.ClickOnDatumListener, g.a {
    private static final String ARG_DAY = "day";
    private static final String ARG_USER = "user";
    private static final int DATE_TIME_MINUS = 1;
    private static final float DAY_MARGIN = 1.0f;
    private static final float STICKY_COLLAPSED_RATIO = 0.42857143f;
    private static final float STICKY_EXPANDED_RATIO = 0.75f;
    private final f binding$delegate;
    private int currentScroll;
    private final nm0.g day$delegate;
    private Delegate delegate;
    private final d user$delegate;
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(FoodWeekFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentFoodWeekBinding;", 0), v.c(FoodWeekFragment.class, "user", "getUser()Lcom/withings/user/User;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FoodWeekFragment.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment$Companion;", "", "()V", "ARG_DAY", "", "ARG_USER", "DATE_TIME_MINUS", "", "DAY_MARGIN", "", "STICKY_COLLAPSED_RATIO", "STICKY_EXPANDED_RATIO", "newInstance", "Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment;", "user", "Lcom/withings/user/User;", "day", "Lorg/joda/time/DateTime;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FoodWeekFragment newInstance(User user, DateTime day) {
            u.j(user, "user");
            u.j(day, "day");
            Bundle bundle = new Bundle();
            bundle.putParcelable("user", user);
            bundle.putSerializable("day", day);
            FoodWeekFragment foodWeekFragment = new FoodWeekFragment();
            foodWeekFragment.setArguments(bundle);
            return foodWeekFragment;
        }

        private Companion() {
        }
    }

    /* compiled from: FoodWeekFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment$Delegate;", "", "Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment;", "foodWeekFragment", "", "scrolledBy", "Lnm0/y;", "onScrolled", "(Lcom/withings/wiscale2/food/ui/display/FoodWeekFragment;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface Delegate {
        void onScrolled(FoodWeekFragment foodWeekFragment, int i11);
    }

    public FoodWeekFragment() {
        super(C1987R.layout.fragment_food_week);
        this.binding$delegate = e.a(this, new FoodWeekFragment$special$$inlined$viewBindingFragment$default$1(), u9.a.a());
        this.user$delegate = new d<Fragment, User>() { // from class: com.withings.wiscale2.food.ui.display.FoodWeekFragment$special$$inlined$argument$1
            private final nm0.g value$delegate = h.b(new AnonymousClass1());

            /* compiled from: Fragment.kt */
            @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.withings.wiscale2.food.ui.display.FoodWeekFragment$special$$inlined$argument$1$1  reason: invalid class name */
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
        this.day$delegate = h.b(new FoodWeekFragment$day$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s2 getBinding() {
        return (s2) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DateTime getDay() {
        return (DateTime) this.day$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.user$delegate.getValue(this, $$delegatedProperties[1]);
    }

    private final void initCustomNestedScrollView() {
        int i11 = i70.b.a(getActivity()).x;
        int i12 = (int) (i11 * STICKY_COLLAPSED_RATIO);
        int i13 = (int) (i11 * STICKY_EXPANDED_RATIO);
        s2 binding = getBinding();
        binding.f99477i.getLayoutParams().height = i13;
        binding.f99477i.requestLayout();
        LinearLayout linearLayout = binding.f99475g;
        CustomFrameLayout customFrameLayout = binding.f99470b;
        CustomNestedScrollView customNestedScrollView = binding.f99471c;
        customNestedScrollView.E(binding.f99477i, linearLayout, customFrameLayout, i12, i13);
        customNestedScrollView.setDelegate(this);
        customNestedScrollView.F(this.currentScroll);
    }

    private final void initGraphView(FoodWeekData foodWeekData) {
        FoodDataHolder foodDataHolder = new FoodDataHolder(new FoodWeekViewModel(foodWeekData).getFoodDatumList());
        GraphView weekMealGraph = getBinding().f99479k;
        u.i(weekMealGraph, "weekMealGraph");
        FoodWeekGraphFactory.Builder leftRightMargin = new FoodWeekGraphFactory.Builder(weekMealGraph, foodDataHolder, this).setLeftRightMargin(1.0f);
        GraphPopupView viewPopup = getBinding().f99478j;
        u.i(viewPopup, "viewPopup");
        FoodWeekGraphFactory build = leftRightMargin.setGraphPopup(viewPopup).setCaloriesBudget(foodWeekData.getMaxBudget()).shouldShowLabelDecorator(true).shouldShowLineDecorator(true).build();
        getBinding().f99479k.setOnScrubbingListener(new GraphView.e() { // from class: com.withings.wiscale2.food.ui.display.FoodWeekFragment$initGraphView$1
            @Override // com.withings.graph.GraphView.e
            public void onScrubbingEnded() {
                s2 binding;
                binding = FoodWeekFragment.this.getBinding();
                binding.f99471c.setScrollingEnabled(true);
            }

            @Override // com.withings.graph.GraphView.e
            public void onScrubbingStarted() {
                s2 binding;
                binding = FoodWeekFragment.this.getBinding();
                binding.f99471c.setScrollingEnabled(false);
            }
        });
        build.init();
    }

    private final void loadAndShowData() {
        BuildersKt__Builders_commonKt.launch$default(t.l(this), Dispatchers.getMain(), null, new FoodWeekFragment$loadAndShowData$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showData(FoodWeekDataHolder foodWeekDataHolder) {
        FoodWeekData foodWeekData = foodWeekDataHolder.getFoodWeekData();
        List<MealName> mealNames = foodWeekDataHolder.getMealNames();
        MealAggregate sumAggregate = foodWeekData.getSumAggregate();
        s2 binding = getBinding();
        tn.h hVar = binding.f99472d;
        Context context = hVar.a().getContext();
        u.i(context, "getContext(...)");
        ((DataView) hVar.f100337b).setValue(jm.a.c(a.d.a(context), 87, foodWeekData.getAverageEaten(), 0, 0, 60));
        tn.h hVar2 = binding.f99472d;
        ((ComposeView) hVar2.f100339d).setContent(new s1.a(true, -1201979916, new FoodWeekFragment$showData$1$1(foodWeekData)));
        if (sumAggregate.getMeals().isEmpty()) {
            ((c) hVar2.f100338c).b().setVisibility(8);
            binding.f99473e.setVisibility(8);
        } else {
            binding.f99474f.setMacroMeals(sumAggregate, mealNames);
        }
        initGraphView(foodWeekData);
    }

    public final void customScrollTo(int i11) {
        getBinding().f99471c.C(i11);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        loadAndShowData();
    }

    @Override // com.withings.wiscale2.food.ui.graph.FoodWeekGraphFactory.ClickOnDatumListener
    public void onDatumClickListener(DateTime day) {
        u.j(day, "day");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        vh.h.b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.delegate = null;
        super.onDetach();
    }

    @Override // ys.g.a
    public void onPopupDisplayChanged(GraphView graphView, g popup, rs.e datum, PointF pointF) {
        u.j(graphView, "graphView");
        u.j(popup, "popup");
        u.j(datum, "datum");
        graphView.G(popup, datum, pointF);
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public void onScrolled(CustomNestedScrollView scrollView, int i11) {
        int i12;
        u.j(scrollView, "scrollView");
        this.currentScroll = i11;
        View view = getBinding().f99469a;
        if (this.currentScroll > getBinding().f99477i.getMeasuredHeight()) {
            i12 = 0;
        } else {
            i12 = 4;
        }
        view.setVisibility(i12);
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onScrolled(this, i11);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i11;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = getBinding().f99469a;
        if (this.currentScroll > getBinding().f99477i.getMeasuredHeight()) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        view2.setVisibility(i11);
        initCustomNestedScrollView();
    }
}
