package com.withings.tutorials.ui.screens.tab;

import com.withings.tutorials.ui.screens.tab.AchieveTabTutorial;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class a<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return pm0.a.b(Integer.valueOf(((AchieveTabTutorial.AchieveTabTutorialScreen) t11).b()), Integer.valueOf(((AchieveTabTutorial.AchieveTabTutorialScreen) t12).b()));
    }
}
