package com.withings.healthplus.explore.ui.activity;

import com.withings.healthplus.contentscreens.ui.model.ContentScreenUi;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.l<List<? extends ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40296a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ExploreTabActivity exploreTabActivity) {
        super(1);
        this.f40296a = exploreTabActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi> list) {
        List<? extends ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi> nutritionInfo = list;
        kotlin.jvm.internal.u.j(nutritionInfo, "nutritionInfo");
        r8.n nVar = this.f40296a.f40243f;
        if (nVar != null) {
            NavigationArguments.NutritionInformationSheetDestination nutritionInformationSheetDestination = NavigationArguments.NutritionInformationSheetDestination.INSTANCE;
            Json.Default r32 = Json.Default;
            r32.getSerializersModule();
            androidx.navigation.e.L(nVar, nutritionInformationSheetDestination.route(r32.encodeToString(new ArrayListSerializer(ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi.Companion.serializer()), nutritionInfo)), null, 6);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
