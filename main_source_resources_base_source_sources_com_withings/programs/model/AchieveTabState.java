package com.withings.programs.model;

import androidx.camera.camera2.internal.o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: AchieveTabState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/withings/programs/model/AchieveTabState;", "", "()V", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "Companion", "LibraryTab", "ProgramTab", "Lcom/withings/programs/model/AchieveTabState$LibraryTab;", "Lcom/withings/programs/model/AchieveTabState$ProgramTab;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class AchieveTabState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int LIBRARY_TAB_INDEX = 1;
    public static final int PROGRAM_TAB_INDEX = 0;

    /* compiled from: AchieveTabState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0004J\n\u0010\b\u001a\u00020\u0004*\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/programs/model/AchieveTabState$Companion;", "", "()V", "LIBRARY_TAB_INDEX", "", "PROGRAM_TAB_INDEX", "retrieveAchieveTabState", "Lcom/withings/programs/model/AchieveTabState;", "retrieveTabIndex", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final AchieveTabState retrieveAchieveTabState(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return new ProgramTab(0, 1, null);
                }
                return new LibraryTab(0, 1, null);
            }
            return new ProgramTab(0, 1, null);
        }

        public final int retrieveTabIndex(AchieveTabState achieveTabState) {
            u.j(achieveTabState, "<this>");
            return achieveTabState instanceof LibraryTab ? 1 : 0;
        }

        private Companion() {
        }
    }

    /* compiled from: AchieveTabState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/programs/model/AchieveTabState$LibraryTab;", "Lcom/withings/programs/model/AchieveTabState;", FirebaseAnalytics.Param.INDEX, "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LibraryTab extends AchieveTabState {
        public static final int $stable = 0;
        private final int index;

        public LibraryTab() {
            this(0, 1, null);
        }

        public static /* synthetic */ LibraryTab copy$default(LibraryTab libraryTab, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = libraryTab.index;
            }
            return libraryTab.copy(i11);
        }

        public final int component1() {
            return this.index;
        }

        public final LibraryTab copy(int i11) {
            return new LibraryTab(i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof LibraryTab) && this.index == ((LibraryTab) obj).index) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.AchieveTabState
        public int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return o0.a("LibraryTab(index=", this.index, ")");
        }

        public /* synthetic */ LibraryTab(int i11, int i12, m mVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }

        public LibraryTab(int i11) {
            super(null);
            this.index = i11;
        }
    }

    /* compiled from: AchieveTabState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/programs/model/AchieveTabState$ProgramTab;", "Lcom/withings/programs/model/AchieveTabState;", FirebaseAnalytics.Param.INDEX, "", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProgramTab extends AchieveTabState {
        public static final int $stable = 0;
        private final int index;

        public ProgramTab() {
            this(0, 1, null);
        }

        public static /* synthetic */ ProgramTab copy$default(ProgramTab programTab, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = programTab.index;
            }
            return programTab.copy(i11);
        }

        public final int component1() {
            return this.index;
        }

        public final ProgramTab copy(int i11) {
            return new ProgramTab(i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ProgramTab) && this.index == ((ProgramTab) obj).index) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.AchieveTabState
        public int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return o0.a("ProgramTab(index=", this.index, ")");
        }

        public /* synthetic */ ProgramTab(int i11, int i12, m mVar) {
            this((i12 & 1) != 0 ? 0 : i11);
        }

        public ProgramTab(int i11) {
            super(null);
            this.index = i11;
        }
    }

    public /* synthetic */ AchieveTabState(m mVar) {
        this();
    }

    public abstract int getIndex();

    private AchieveTabState() {
    }
}
