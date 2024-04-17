package com.withings.healthplus.explore.ui.viewmodel;

import androidx.lifecycle.u0;
import com.withings.healthplus.contentscreens.ui.model.ContentScreenUi;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import ou.a;
/* compiled from: NutritionSheetViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/healthplus/explore/ui/viewmodel/NutritionSheetViewModel;", "Lou/a;", "Landroidx/lifecycle/u0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/u0;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NutritionSheetViewModel extends a {

    /* renamed from: a  reason: collision with root package name */
    private final List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi> f40359a;

    @Inject
    public NutritionSheetViewModel(u0 savedStateHandle) {
        u.j(savedStateHandle, "savedStateHandle");
        String str = (String) savedStateHandle.c(NavigationArguments.NUTRITION_INFO);
        if (str != null) {
            Json.Default r02 = Json.Default;
            r02.getSerializersModule();
            this.f40359a = (List) r02.decodeFromString(new ArrayListSerializer(ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi.Companion.serializer()), str);
            return;
        }
        throw new Exception("nutritionInformation shouldn't be null");
    }

    @Override // ou.a
    public final List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi> f0() {
        return this.f40359a;
    }
}
