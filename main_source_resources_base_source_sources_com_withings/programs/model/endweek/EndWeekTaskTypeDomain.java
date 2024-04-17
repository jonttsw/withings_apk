package com.withings.programs.model.endweek;

import com.withings.favorite.model.FavoriteCategoryKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: EndWeekStatsDomain.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "", "()V", "ARTICLE", FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, "MEASUREMENT", "OTHER", "RECIPE", "WORKOUT", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$ARTICLE;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$All;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$MEASUREMENT;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$OTHER;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$RECIPE;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$WORKOUT;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class EndWeekTaskTypeDomain {

    /* compiled from: EndWeekStatsDomain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$ARTICLE;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ARTICLE extends EndWeekTaskTypeDomain {
        public static final ARTICLE INSTANCE = new ARTICLE();

        private ARTICLE() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ARTICLE)) {
                return false;
            }
            ARTICLE article = (ARTICLE) obj;
            return true;
        }

        public int hashCode() {
            return -882834175;
        }

        public String toString() {
            return "ARTICLE";
        }
    }

    /* compiled from: EndWeekStatsDomain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$All;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class All extends EndWeekTaskTypeDomain {
        public static final All INSTANCE = new All();

        private All() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof All)) {
                return false;
            }
            All all = (All) obj;
            return true;
        }

        public int hashCode() {
            return -1925678292;
        }

        public String toString() {
            return FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY;
        }
    }

    /* compiled from: EndWeekStatsDomain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$MEASUREMENT;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MEASUREMENT extends EndWeekTaskTypeDomain {
        public static final MEASUREMENT INSTANCE = new MEASUREMENT();

        private MEASUREMENT() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MEASUREMENT)) {
                return false;
            }
            MEASUREMENT measurement = (MEASUREMENT) obj;
            return true;
        }

        public int hashCode() {
            return -592769465;
        }

        public String toString() {
            return "MEASUREMENT";
        }
    }

    /* compiled from: EndWeekStatsDomain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$OTHER;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class OTHER extends EndWeekTaskTypeDomain {
        public static final OTHER INSTANCE = new OTHER();

        private OTHER() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OTHER)) {
                return false;
            }
            OTHER other = (OTHER) obj;
            return true;
        }

        public int hashCode() {
            return 566247899;
        }

        public String toString() {
            return "OTHER";
        }
    }

    /* compiled from: EndWeekStatsDomain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$RECIPE;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RECIPE extends EndWeekTaskTypeDomain {
        public static final RECIPE INSTANCE = new RECIPE();

        private RECIPE() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RECIPE)) {
                return false;
            }
            RECIPE recipe = (RECIPE) obj;
            return true;
        }

        public int hashCode() {
            return 445705219;
        }

        public String toString() {
            return "RECIPE";
        }
    }

    /* compiled from: EndWeekStatsDomain.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain$WORKOUT;", "Lcom/withings/programs/model/endweek/EndWeekTaskTypeDomain;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WORKOUT extends EndWeekTaskTypeDomain {
        public static final WORKOUT INSTANCE = new WORKOUT();

        private WORKOUT() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WORKOUT)) {
                return false;
            }
            WORKOUT workout = (WORKOUT) obj;
            return true;
        }

        public int hashCode() {
            return 1374714536;
        }

        public String toString() {
            return "WORKOUT";
        }
    }

    public /* synthetic */ EndWeekTaskTypeDomain(m mVar) {
        this();
    }

    private EndWeekTaskTypeDomain() {
    }
}
