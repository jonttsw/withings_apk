package com.withings.programs.model.endweek;

import androidx.appcompat.app.h;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.favorite.model.FavoriteCategoryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: EndWeekStatsUi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u001b\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi;", "", "title", "", RemoteMessageConst.Notification.ICON, "(II)V", "getIcon", "()I", "getTitle", FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, "Article", "Measurement", "Other", "Recipe", "Workout", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$All;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Article;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Measurement;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Other;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Recipe;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Workout;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EndWeekTaskTypeUi {
    public static final int $stable = 0;
    private final int icon;
    private final int title;

    /* compiled from: EndWeekStatsUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$All;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi;", "title", "", RemoteMessageConst.Notification.ICON, "(II)V", "getIcon", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class All extends EndWeekTaskTypeUi {
        public static final int $stable = 0;
        private final int icon;
        private final int title;

        public All() {
            this(0, 0, 3, null);
        }

        public static /* synthetic */ All copy$default(All all, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = all.title;
            }
            if ((i13 & 2) != 0) {
                i12 = all.icon;
            }
            return all.copy(i11, i12);
        }

        public final int component1() {
            return this.title;
        }

        public final int component2() {
            return this.icon;
        }

        public final All copy(int i11, int i12) {
            return new All(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof All)) {
                return false;
            }
            All all = (All) obj;
            if (this.title == all.title && this.icon == all.icon) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getIcon() {
            return this.icon;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.icon) + (Integer.hashCode(this.title) * 31);
        }

        public String toString() {
            return h.c("All(title=", this.title, ", icon=", this.icon, ")");
        }

        public /* synthetic */ All(int i11, int i12, int i13, m mVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
        }

        public All(int i11, int i12) {
            super(i11, i12, null);
            this.title = i11;
            this.icon = i12;
        }
    }

    /* compiled from: EndWeekStatsUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Article;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi;", "title", "", RemoteMessageConst.Notification.ICON, "(II)V", "getIcon", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Article extends EndWeekTaskTypeUi {
        public static final int $stable = 0;
        private final int icon;
        private final int title;

        public Article() {
            this(0, 0, 3, null);
        }

        public static /* synthetic */ Article copy$default(Article article, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = article.title;
            }
            if ((i13 & 2) != 0) {
                i12 = article.icon;
            }
            return article.copy(i11, i12);
        }

        public final int component1() {
            return this.title;
        }

        public final int component2() {
            return this.icon;
        }

        public final Article copy(int i11, int i12) {
            return new Article(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Article)) {
                return false;
            }
            Article article = (Article) obj;
            if (this.title == article.title && this.icon == article.icon) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getIcon() {
            return this.icon;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.icon) + (Integer.hashCode(this.title) * 31);
        }

        public String toString() {
            return h.c("Article(title=", this.title, ", icon=", this.icon, ")");
        }

        public /* synthetic */ Article(int i11, int i12, int i13, m mVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
        }

        public Article(int i11, int i12) {
            super(i11, i12, null);
            this.title = i11;
            this.icon = i12;
        }
    }

    /* compiled from: EndWeekStatsUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Measurement;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi;", "title", "", RemoteMessageConst.Notification.ICON, "(II)V", "getIcon", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Measurement extends EndWeekTaskTypeUi {
        public static final int $stable = 0;
        private final int icon;
        private final int title;

        public Measurement() {
            this(0, 0, 3, null);
        }

        public static /* synthetic */ Measurement copy$default(Measurement measurement, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = measurement.title;
            }
            if ((i13 & 2) != 0) {
                i12 = measurement.icon;
            }
            return measurement.copy(i11, i12);
        }

        public final int component1() {
            return this.title;
        }

        public final int component2() {
            return this.icon;
        }

        public final Measurement copy(int i11, int i12) {
            return new Measurement(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Measurement)) {
                return false;
            }
            Measurement measurement = (Measurement) obj;
            if (this.title == measurement.title && this.icon == measurement.icon) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getIcon() {
            return this.icon;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.icon) + (Integer.hashCode(this.title) * 31);
        }

        public String toString() {
            return h.c("Measurement(title=", this.title, ", icon=", this.icon, ")");
        }

        public /* synthetic */ Measurement(int i11, int i12, int i13, m mVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
        }

        public Measurement(int i11, int i12) {
            super(i11, i12, null);
            this.title = i11;
            this.icon = i12;
        }
    }

    /* compiled from: EndWeekStatsUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Other;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi;", "title", "", RemoteMessageConst.Notification.ICON, "(II)V", "getIcon", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Other extends EndWeekTaskTypeUi {
        public static final int $stable = 0;
        private final int icon;
        private final int title;

        public Other() {
            this(0, 0, 3, null);
        }

        public static /* synthetic */ Other copy$default(Other other, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = other.title;
            }
            if ((i13 & 2) != 0) {
                i12 = other.icon;
            }
            return other.copy(i11, i12);
        }

        public final int component1() {
            return this.title;
        }

        public final int component2() {
            return this.icon;
        }

        public final Other copy(int i11, int i12) {
            return new Other(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Other)) {
                return false;
            }
            Other other = (Other) obj;
            if (this.title == other.title && this.icon == other.icon) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getIcon() {
            return this.icon;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.icon) + (Integer.hashCode(this.title) * 31);
        }

        public String toString() {
            return h.c("Other(title=", this.title, ", icon=", this.icon, ")");
        }

        public /* synthetic */ Other(int i11, int i12, int i13, m mVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
        }

        public Other(int i11, int i12) {
            super(i11, i12, null);
            this.title = i11;
            this.icon = i12;
        }
    }

    /* compiled from: EndWeekStatsUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Recipe;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi;", "title", "", RemoteMessageConst.Notification.ICON, "(II)V", "getIcon", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Recipe extends EndWeekTaskTypeUi {
        public static final int $stable = 0;
        private final int icon;
        private final int title;

        public Recipe() {
            this(0, 0, 3, null);
        }

        public static /* synthetic */ Recipe copy$default(Recipe recipe, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = recipe.title;
            }
            if ((i13 & 2) != 0) {
                i12 = recipe.icon;
            }
            return recipe.copy(i11, i12);
        }

        public final int component1() {
            return this.title;
        }

        public final int component2() {
            return this.icon;
        }

        public final Recipe copy(int i11, int i12) {
            return new Recipe(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recipe)) {
                return false;
            }
            Recipe recipe = (Recipe) obj;
            if (this.title == recipe.title && this.icon == recipe.icon) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getIcon() {
            return this.icon;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.icon) + (Integer.hashCode(this.title) * 31);
        }

        public String toString() {
            return h.c("Recipe(title=", this.title, ", icon=", this.icon, ")");
        }

        public /* synthetic */ Recipe(int i11, int i12, int i13, m mVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
        }

        public Recipe(int i11, int i12) {
            super(i11, i12, null);
            this.title = i11;
            this.icon = i12;
        }
    }

    /* compiled from: EndWeekStatsUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi$Workout;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeUi;", "title", "", RemoteMessageConst.Notification.ICON, "(II)V", "getIcon", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Workout extends EndWeekTaskTypeUi {
        public static final int $stable = 0;
        private final int icon;
        private final int title;

        public Workout() {
            this(0, 0, 3, null);
        }

        public static /* synthetic */ Workout copy$default(Workout workout, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = workout.title;
            }
            if ((i13 & 2) != 0) {
                i12 = workout.icon;
            }
            return workout.copy(i11, i12);
        }

        public final int component1() {
            return this.title;
        }

        public final int component2() {
            return this.icon;
        }

        public final Workout copy(int i11, int i12) {
            return new Workout(i11, i12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Workout)) {
                return false;
            }
            Workout workout = (Workout) obj;
            if (this.title == workout.title && this.icon == workout.icon) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getIcon() {
            return this.icon;
        }

        @Override // com.withings.programs.model.endweek.EndWeekTaskTypeUi
        public int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.icon) + (Integer.hashCode(this.title) * 31);
        }

        public String toString() {
            return h.c("Workout(title=", this.title, ", icon=", this.icon, ")");
        }

        public /* synthetic */ Workout(int i11, int i12, int i13, m mVar) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
        }

        public Workout(int i11, int i12) {
            super(i11, i12, null);
            this.title = i11;
            this.icon = i12;
        }
    }

    public /* synthetic */ EndWeekTaskTypeUi(int i11, int i12, m mVar) {
        this(i11, i12);
    }

    public int getIcon() {
        return this.icon;
    }

    public int getTitle() {
        return this.title;
    }

    private EndWeekTaskTypeUi(int i11, int i12) {
        this.title = i11;
        this.icon = i12;
    }
}
