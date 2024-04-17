package com.withings.wiscale2.food.ui.display;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import androidx.glance.appwidget.protobuf.g;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.view.HorizontalSausageWithLegendsView;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.model.Meal;
import com.withings.wiscale2.food.model.MealAggregate;
import com.withings.wiscale2.food.model.MealName;
import com.withings.wiscale2.n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm.a;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: MacroMealsView.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006*"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/MacroMealsView;", "Landroid/widget/LinearLayout;", "Lcom/withings/wiscale2/food/model/Meal;", ConstantsWs.SYNC_PROCESS_MEAL, "", "getValue", "(Lcom/withings/wiscale2/food/model/Meal;)Ljava/lang/String;", "", RemoteMessageConst.Notification.COLOR, "", Constants.ScionAnalytics.PARAM_LABEL, "mealAggregate", "Lcom/withings/views/view/HorizontalSausageWithLegendsView$b;", "getHorizontalSausageWithLegendsView", "(ILjava/lang/CharSequence;Lcom/withings/wiscale2/food/model/Meal;)Lcom/withings/views/view/HorizontalSausageWithLegendsView$b;", "Lcom/withings/wiscale2/food/model/MealAggregate;", "", "Lcom/withings/wiscale2/food/model/MealName;", "mealsName", "Lnm0/y;", "setMacroMeals", "(Lcom/withings/wiscale2/food/model/MealAggregate;Ljava/util/List;)V", "Lcom/withings/wiscale2/food/ui/display/MacroMealsView$MealInfo;", "possibleMealsName", "Ljava/util/List;", "possibleMealsColors", "Lcom/withings/views/view/HorizontalSausageWithLegendsView;", "horizontalSausageWithLegendsView", "Lcom/withings/views/view/HorizontalSausageWithLegendsView;", "details", "Landroid/widget/LinearLayout;", "Lcom/withings/views/view/SectionView;", "title", "Lcom/withings/views/view/SectionView;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MealInfo", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MacroMealsView extends LinearLayout {
    public static final int $stable = 8;
    private LinearLayout details;
    private HorizontalSausageWithLegendsView horizontalSausageWithLegendsView;
    private final List<Integer> possibleMealsColors;
    private final List<MealInfo> possibleMealsName;
    private SectionView title;

    /* compiled from: MacroMealsView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/wiscale2/food/ui/display/MacroMealsView$MealInfo;", "", "defaultName", "", "resId", "", "resColor", "(Ljava/lang/String;II)V", "getDefaultName", "()Ljava/lang/String;", "getResColor", "()I", "getResId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class MealInfo {
        public static final int $stable = 0;
        private final String defaultName;
        private final int resColor;
        private final int resId;

        public MealInfo(String defaultName, int i11, int i12) {
            u.j(defaultName, "defaultName");
            this.defaultName = defaultName;
            this.resId = i11;
            this.resColor = i12;
        }

        public static /* synthetic */ MealInfo copy$default(MealInfo mealInfo, String str, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = mealInfo.defaultName;
            }
            if ((i13 & 2) != 0) {
                i11 = mealInfo.resId;
            }
            if ((i13 & 4) != 0) {
                i12 = mealInfo.resColor;
            }
            return mealInfo.copy(str, i11, i12);
        }

        public final String component1() {
            return this.defaultName;
        }

        public final int component2() {
            return this.resId;
        }

        public final int component3() {
            return this.resColor;
        }

        public final MealInfo copy(String defaultName, int i11, int i12) {
            u.j(defaultName, "defaultName");
            return new MealInfo(defaultName, i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MealInfo)) {
                return false;
            }
            MealInfo mealInfo = (MealInfo) obj;
            if (u.e(this.defaultName, mealInfo.defaultName) && this.resId == mealInfo.resId && this.resColor == mealInfo.resColor) {
                return true;
            }
            return false;
        }

        public final String getDefaultName() {
            return this.defaultName;
        }

        public final int getResColor() {
            return this.resColor;
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return Integer.hashCode(this.resColor) + h.a(this.resId, this.defaultName.hashCode() * 31, 31);
        }

        public String toString() {
            String str = this.defaultName;
            int i11 = this.resId;
            return e.c(g.b("MealInfo(defaultName=", str, ", resId=", i11, ", resColor="), this.resColor, ")");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MacroMealsView(Context context) {
        this(context, null, 0, 6, null);
        u.j(context, "context");
    }

    private final HorizontalSausageWithLegendsView.b getHorizontalSausageWithLegendsView(int i11, CharSequence charSequence, Meal meal) {
        float f11;
        Float calories;
        String value = getValue(meal);
        if (meal != null && (calories = meal.getCalories()) != null) {
            f11 = calories.floatValue();
        } else {
            f11 = 0.0f;
        }
        return new HorizontalSausageWithLegendsView.b(i11, charSequence, value, f11, false, 48);
    }

    private final String getValue(Meal meal) {
        Float f11;
        if (meal != null) {
            f11 = meal.getCalories();
        } else {
            f11 = null;
        }
        if (f11 != null && meal.getTotalGramsEaten() != null && !u.d(meal.getTotalGramsEaten(), 0.0f)) {
            Context context = getContext();
            u.i(context, "getContext(...)");
            return jm.a.c(a.d.a(context), 47, f11.floatValue(), 0, 0, 60).toString();
        }
        return " - ";
    }

    public final void setMacroMeals(MealAggregate mealAggregate, List<MealName> mealsName) {
        Object obj;
        u.j(mealAggregate, "mealAggregate");
        u.j(mealsName, "mealsName");
        ArrayList arrayList = new ArrayList();
        for (MealName mealName : mealsName) {
            Meal mealForMealName = mealAggregate.getMealForMealName(mealName);
            Iterator<T> it = this.possibleMealsName.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (u.e(((MealInfo) obj).getDefaultName(), mealName.getName())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MealInfo mealInfo = (MealInfo) obj;
            if (mealInfo != null) {
                int resColor = mealInfo.getResColor();
                String string = getContext().getString(mealInfo.getResId());
                u.i(string, "getString(...)");
                arrayList.add(getHorizontalSausageWithLegendsView(resColor, string, mealForMealName));
            } else {
                int intValue = this.possibleMealsColors.get(arrayList.size()).intValue();
                String name = mealName.getName();
                if (name == null) {
                    name = "";
                }
                arrayList.add(getHorizontalSausageWithLegendsView(intValue, name, mealForMealName));
            }
        }
        this.horizontalSausageWithLegendsView.setLegends(arrayList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MacroMealsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        u.j(context, "context");
    }

    public /* synthetic */ MacroMealsView(Context context, AttributeSet attributeSet, int i11, int i12, m mVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MacroMealsView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.possibleMealsName = x.W(new MealInfo("Breakfast", C1987R.string._FOOD_BREAKFAST_, C1987R.color.datavizMonochromaticNeutral1), new MealInfo("Lunch", C1987R.string._FOOD_LUNCH_, C1987R.color.datavizMonochromaticNeutral2), new MealInfo("Dinner", C1987R.string._FOOD_DINNER_, C1987R.color.datavizMonochromaticNeutral3), new MealInfo("Snacks", C1987R.string._FOOD_SNACKS_, C1987R.color.datavizMonochromaticNeutral4));
        Integer valueOf = Integer.valueOf((int) C1987R.color.datavizMonochromaticNeutral5);
        this.possibleMealsColors = x.W(valueOf, Integer.valueOf((int) C1987R.color.datavizMonochromaticNeutral4), Integer.valueOf((int) C1987R.color.datavizMonochromaticNeutral3), Integer.valueOf((int) C1987R.color.datavizMonochromaticNeutral2), Integer.valueOf((int) C1987R.color.datavizMonochromaticNeutral1), valueOf);
        View inflate = LayoutInflater.from(context).inflate(C1987R.layout.view_macro_nutriment, this);
        View findViewById = inflate.findViewById(C1987R.id.donut_with_legends);
        u.i(findViewById, "findViewById(...)");
        this.horizontalSausageWithLegendsView = (HorizontalSausageWithLegendsView) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.title);
        u.i(findViewById2, "findViewById(...)");
        this.title = (SectionView) findViewById2;
        View findViewById3 = inflate.findViewById(C1987R.id.details);
        u.i(findViewById3, "findViewById(...)");
        this.details = (LinearLayout) findViewById3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2.f58722b);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.title.setTitle(context.getString(obtainStyledAttributes.getResourceId(0, C1987R.string._FOOD_CALOY_BUDGET_)));
        obtainStyledAttributes.recycle();
    }
}
