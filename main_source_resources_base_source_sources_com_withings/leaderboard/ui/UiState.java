package com.withings.leaderboard.ui;

import bn.d;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: LeaderboardWeekPage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/withings/leaderboard/ui/UiState;", "", "()V", "Empty", "Leaderboard", "Loading", "Lcom/withings/leaderboard/ui/UiState$Empty;", "Lcom/withings/leaderboard/ui/UiState$Leaderboard;", "Lcom/withings/leaderboard/ui/UiState$Loading;", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UiState {
    public static final int $stable = 0;

    /* compiled from: LeaderboardWeekPage.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/leaderboard/ui/UiState$Empty;", "Lcom/withings/leaderboard/ui/UiState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Empty extends UiState {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return true;
        }

        public int hashCode() {
            return -1544602627;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* compiled from: LeaderboardWeekPage.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/leaderboard/ui/UiState$Leaderboard;", "Lcom/withings/leaderboard/ui/UiState;", "list", "", "Lcom/withings/leaderboard/repositories/data/LeaderboardEntry;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Leaderboard extends UiState {
        public static final int $stable = 8;
        private final List<LeaderboardEntry> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Leaderboard(List<LeaderboardEntry> list) {
            super(null);
            u.j(list, "list");
            this.list = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Leaderboard copy$default(Leaderboard leaderboard, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = leaderboard.list;
            }
            return leaderboard.copy(list);
        }

        public final List<LeaderboardEntry> component1() {
            return this.list;
        }

        public final Leaderboard copy(List<LeaderboardEntry> list) {
            u.j(list, "list");
            return new Leaderboard(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Leaderboard) && u.e(this.list, ((Leaderboard) obj).list)) {
                return true;
            }
            return false;
        }

        public final List<LeaderboardEntry> getList() {
            return this.list;
        }

        public int hashCode() {
            return this.list.hashCode();
        }

        public String toString() {
            return d.b("Leaderboard(list=", this.list, ")");
        }
    }

    /* compiled from: LeaderboardWeekPage.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/withings/leaderboard/ui/UiState$Loading;", "Lcom/withings/leaderboard/ui/UiState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Loading extends UiState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return true;
        }

        public int hashCode() {
            return -638931988;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ UiState(m mVar) {
        this();
    }

    private UiState() {
    }
}
