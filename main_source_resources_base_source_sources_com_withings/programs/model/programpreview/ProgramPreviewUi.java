package com.withings.programs.model.programpreview;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import androidx.compose.material.v;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.ProgressUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import v6.b;
/* compiled from: ProgramPreviewUi.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0012\u0010\u0016\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi;", "", "()V", "imageURL", "", "getImageURL", "()Ljava/lang/String;", "isAppCapability", "", "()Z", "isAvailable", "isNew", "labelText", "", "getLabelText", "()Ljava/util/List;", NavigationArguments.PROGRAM_ID, "", "getProgramId", "()I", "shortDescription", "getShortDescription", "title", "getTitle", "Discover", "OnGoing", "Planned", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Planned;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProgramPreviewUi {
    public static final int $stable = 0;

    /* compiled from: ProgramPreviewUi.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u001f B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\n\u0082\u0001\u0002!\"¨\u0006#"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi;", "()V", "atLeastOneIterationFinished", "", "getAtLeastOneIterationFinished", "()Z", "categoryIconId", "", "getCategoryIconId", "()Ljava/lang/String;", "currentStepProgression", "", "getCurrentStepProgression", "()Ljava/lang/Float;", "dateLastIterationFinished", "getDateLastIterationFinished", "isAccessible", "progress", "", "getProgress", "()Ljava/lang/Integer;", "progressMax", "getProgressMax", "()I", "progressUnit", "Lcom/withings/programs/model/ProgressUnit;", "getProgressUnit", "()Lcom/withings/programs/model/ProgressUnit;", DataLayout.Section.ELEMENT, "getSection", "Legacy", "Wifit", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover$Legacy;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover$Wifit;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class Discover extends ProgramPreviewUi {
        public static final int $stable = 0;

        public /* synthetic */ Discover(m mVar) {
            this();
        }

        public abstract boolean getAtLeastOneIterationFinished();

        public abstract String getCategoryIconId();

        public abstract Float getCurrentStepProgression();

        public abstract String getDateLastIterationFinished();

        public abstract Integer getProgress();

        public abstract int getProgressMax();

        public abstract ProgressUnit getProgressUnit();

        public abstract String getSection();

        public abstract boolean isAccessible();

        /* compiled from: ProgramPreviewUi.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0002\u0010\u001aJ\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010)J\t\u0010@\u001a\u00020\nHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÔ\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\nHÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0015\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001cR\u0014\u0010\u0016\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001cR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0014\u0010\u0011\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001e¨\u0006J"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover$Legacy;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover;", "currentStepProgression", "", "dateLastIterationFinished", "", "imageURL", "isLastIterationFinished", "", NavigationArguments.PROGRAM_ID, "", "progress", "progressMax", "progressUnit", "Lcom/withings/programs/model/ProgressUnit;", DataLayout.Section.ELEMENT, "categoryIconId", "shortDescription", "title", "labelText", "", "atLeastOneIterationFinished", "isAppCapability", "isAvailable", "isNew", "isAccessible", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;ILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZZ)V", "getAtLeastOneIterationFinished", "()Z", "getCategoryIconId", "()Ljava/lang/String;", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDateLastIterationFinished", "getImageURL", "getLabelText", "()Ljava/util/List;", "getProgramId", "()I", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgressMax", "getProgressUnit", "()Lcom/withings/programs/model/ProgressUnit;", "getSection", "getShortDescription", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;ILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZZZ)Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover$Legacy;", "equals", "other", "", "hashCode", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Legacy extends Discover {
            public static final int $stable = 8;
            private final boolean atLeastOneIterationFinished;
            private final String categoryIconId;
            private final Float currentStepProgression;
            private final String dateLastIterationFinished;
            private final String imageURL;
            private final boolean isAccessible;
            private final boolean isAppCapability;
            private final boolean isAvailable;
            private final boolean isLastIterationFinished;
            private final boolean isNew;
            private final List<String> labelText;
            private final int programId;
            private final Integer progress;
            private final int progressMax;
            private final ProgressUnit progressUnit;
            private final String section;
            private final String shortDescription;
            private final String title;

            public /* synthetic */ Legacy(Float f11, String str, String str2, boolean z5, int i11, Integer num, int i12, ProgressUnit progressUnit, String str3, String str4, String str5, String str6, List list, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i13, m mVar) {
                this(f11, str, str2, z5, i11, num, i12, progressUnit, str3, str4, str5, str6, (i13 & 4096) != 0 ? i0.f76187a : list, (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z11, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z12, (32768 & i13) != 0 ? true : z13, (65536 & i13) != 0 ? false : z14, (i13 & 131072) != 0 ? true : z15);
            }

            public final Float component1() {
                return this.currentStepProgression;
            }

            public final String component10() {
                return this.categoryIconId;
            }

            public final String component11() {
                return this.shortDescription;
            }

            public final String component12() {
                return this.title;
            }

            public final List<String> component13() {
                return this.labelText;
            }

            public final boolean component14() {
                return this.atLeastOneIterationFinished;
            }

            public final boolean component15() {
                return this.isAppCapability;
            }

            public final boolean component16() {
                return this.isAvailable;
            }

            public final boolean component17() {
                return this.isNew;
            }

            public final boolean component18() {
                return this.isAccessible;
            }

            public final String component2() {
                return this.dateLastIterationFinished;
            }

            public final String component3() {
                return this.imageURL;
            }

            public final boolean component4() {
                return this.isLastIterationFinished;
            }

            public final int component5() {
                return this.programId;
            }

            public final Integer component6() {
                return this.progress;
            }

            public final int component7() {
                return this.progressMax;
            }

            public final ProgressUnit component8() {
                return this.progressUnit;
            }

            public final String component9() {
                return this.section;
            }

            public final Legacy copy(Float f11, String str, String imageURL, boolean z5, int i11, Integer num, int i12, ProgressUnit progressUnit, String str2, String str3, String shortDescription, String title, List<String> labelText, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
                u.j(imageURL, "imageURL");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                return new Legacy(f11, str, imageURL, z5, i11, num, i12, progressUnit, str2, str3, shortDescription, title, labelText, z11, z12, z13, z14, z15);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Legacy)) {
                    return false;
                }
                Legacy legacy = (Legacy) obj;
                if (u.e(this.currentStepProgression, legacy.currentStepProgression) && u.e(this.dateLastIterationFinished, legacy.dateLastIterationFinished) && u.e(this.imageURL, legacy.imageURL) && this.isLastIterationFinished == legacy.isLastIterationFinished && this.programId == legacy.programId && u.e(this.progress, legacy.progress) && this.progressMax == legacy.progressMax && this.progressUnit == legacy.progressUnit && u.e(this.section, legacy.section) && u.e(this.categoryIconId, legacy.categoryIconId) && u.e(this.shortDescription, legacy.shortDescription) && u.e(this.title, legacy.title) && u.e(this.labelText, legacy.labelText) && this.atLeastOneIterationFinished == legacy.atLeastOneIterationFinished && this.isAppCapability == legacy.isAppCapability && this.isAvailable == legacy.isAvailable && this.isNew == legacy.isNew && this.isAccessible == legacy.isAccessible) {
                    return true;
                }
                return false;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public boolean getAtLeastOneIterationFinished() {
                return this.atLeastOneIterationFinished;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public String getCategoryIconId() {
                return this.categoryIconId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public Float getCurrentStepProgression() {
                return this.currentStepProgression;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public String getDateLastIterationFinished() {
                return this.dateLastIterationFinished;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getImageURL() {
                return this.imageURL;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public List<String> getLabelText() {
                return this.labelText;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public int getProgramId() {
                return this.programId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public Integer getProgress() {
                return this.progress;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public int getProgressMax() {
                return this.progressMax;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public ProgressUnit getProgressUnit() {
                return this.progressUnit;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public String getSection() {
                return this.section;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getShortDescription() {
                return this.shortDescription;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                int hashCode5;
                Float f11 = this.currentStepProgression;
                int i11 = 0;
                if (f11 == null) {
                    hashCode = 0;
                } else {
                    hashCode = f11.hashCode();
                }
                int i12 = hashCode * 31;
                String str = this.dateLastIterationFinished;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int a11 = h.a(this.programId, y1.a(this.isLastIterationFinished, d.c(this.imageURL, (i12 + hashCode2) * 31, 31), 31), 31);
                Integer num = this.progress;
                if (num == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = num.hashCode();
                }
                int a12 = h.a(this.progressMax, (a11 + hashCode3) * 31, 31);
                ProgressUnit progressUnit = this.progressUnit;
                if (progressUnit == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = progressUnit.hashCode();
                }
                int i13 = (a12 + hashCode4) * 31;
                String str2 = this.section;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i14 = (i13 + hashCode5) * 31;
                String str3 = this.categoryIconId;
                if (str3 != null) {
                    i11 = str3.hashCode();
                }
                return Boolean.hashCode(this.isAccessible) + y1.a(this.isNew, y1.a(this.isAvailable, y1.a(this.isAppCapability, y1.a(this.atLeastOneIterationFinished, e.b(this.labelText, d.c(this.title, d.c(this.shortDescription, (i14 + i11) * 31, 31), 31), 31), 31), 31), 31), 31);
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public boolean isAccessible() {
                return this.isAccessible;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAppCapability() {
                return this.isAppCapability;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAvailable() {
                return this.isAvailable;
            }

            public final boolean isLastIterationFinished() {
                return this.isLastIterationFinished;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isNew() {
                return this.isNew;
            }

            public String toString() {
                Float f11 = this.currentStepProgression;
                String str = this.dateLastIterationFinished;
                String str2 = this.imageURL;
                boolean z5 = this.isLastIterationFinished;
                int i11 = this.programId;
                Integer num = this.progress;
                int i12 = this.progressMax;
                ProgressUnit progressUnit = this.progressUnit;
                String str3 = this.section;
                String str4 = this.categoryIconId;
                String str5 = this.shortDescription;
                String str6 = this.title;
                List<String> list = this.labelText;
                boolean z11 = this.atLeastOneIterationFinished;
                boolean z12 = this.isAppCapability;
                boolean z13 = this.isAvailable;
                boolean z14 = this.isNew;
                boolean z15 = this.isAccessible;
                StringBuilder sb2 = new StringBuilder("Legacy(currentStepProgression=");
                sb2.append(f11);
                sb2.append(", dateLastIterationFinished=");
                sb2.append(str);
                sb2.append(", imageURL=");
                sb2.append(str2);
                sb2.append(", isLastIterationFinished=");
                sb2.append(z5);
                sb2.append(", programId=");
                sb2.append(i11);
                sb2.append(", progress=");
                sb2.append(num);
                sb2.append(", progressMax=");
                sb2.append(i12);
                sb2.append(", progressUnit=");
                sb2.append(progressUnit);
                sb2.append(", section=");
                b.d(sb2, str3, ", categoryIconId=", str4, ", shortDescription=");
                b.d(sb2, str5, ", title=", str6, ", labelText=");
                sb2.append(list);
                sb2.append(", atLeastOneIterationFinished=");
                sb2.append(z11);
                sb2.append(", isAppCapability=");
                sb2.append(z12);
                sb2.append(", isAvailable=");
                sb2.append(z13);
                sb2.append(", isNew=");
                sb2.append(z14);
                sb2.append(", isAccessible=");
                sb2.append(z15);
                sb2.append(")");
                return sb2.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Legacy(Float f11, String str, String imageURL, boolean z5, int i11, Integer num, int i12, ProgressUnit progressUnit, String str2, String str3, String shortDescription, String title, List<String> labelText, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
                super(null);
                u.j(imageURL, "imageURL");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                this.currentStepProgression = f11;
                this.dateLastIterationFinished = str;
                this.imageURL = imageURL;
                this.isLastIterationFinished = z5;
                this.programId = i11;
                this.progress = num;
                this.progressMax = i12;
                this.progressUnit = progressUnit;
                this.section = str2;
                this.categoryIconId = str3;
                this.shortDescription = shortDescription;
                this.title = title;
                this.labelText = labelText;
                this.atLeastOneIterationFinished = z11;
                this.isAppCapability = z12;
                this.isAvailable = z13;
                this.isNew = z14;
                this.isAccessible = z15;
            }
        }

        /* compiled from: ProgramPreviewUi.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0002\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\rHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'JÖ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010EJ\u0013\u0010F\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020\rHÖ\u0001J\t\u0010J\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001cR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001cR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b+\u0010'R\u0014\u0010\u000f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0014\u0010\u0014\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0014\u0010\u0015\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001e¨\u0006K"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover$Wifit;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover;", "atLeastOneIterationFinished", "", "currentStepProgression", "", "dateLastIterationFinished", "", "imageURL", "isAppCapability", "isAvailable", "isNew", NavigationArguments.PROGRAM_ID, "", "progress", "progressMax", "progressUnit", "Lcom/withings/programs/model/ProgressUnit;", DataLayout.Section.ELEMENT, "categoryIconId", "shortDescription", "title", "labelText", "", "lastFinishedInstanceId", "isAccessible", "(ZLjava/lang/Float;Ljava/lang/String;Ljava/lang/String;ZZZILjava/lang/Integer;ILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Z)V", "getAtLeastOneIterationFinished", "()Z", "getCategoryIconId", "()Ljava/lang/String;", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getDateLastIterationFinished", "getImageURL", "getLabelText", "()Ljava/util/List;", "getLastFinishedInstanceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgramId", "()I", "getProgress", "getProgressMax", "getProgressUnit", "()Lcom/withings/programs/model/ProgressUnit;", "getSection", "getShortDescription", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/Float;Ljava/lang/String;Ljava/lang/String;ZZZILjava/lang/Integer;ILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Z)Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Discover$Wifit;", "equals", "other", "", "hashCode", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Wifit extends Discover {
            public static final int $stable = 8;
            private final boolean atLeastOneIterationFinished;
            private final String categoryIconId;
            private final Float currentStepProgression;
            private final String dateLastIterationFinished;
            private final String imageURL;
            private final boolean isAccessible;
            private final boolean isAppCapability;
            private final boolean isAvailable;
            private final boolean isNew;
            private final List<String> labelText;
            private final Integer lastFinishedInstanceId;
            private final int programId;
            private final Integer progress;
            private final int progressMax;
            private final ProgressUnit progressUnit;
            private final String section;
            private final String shortDescription;
            private final String title;

            public /* synthetic */ Wifit(boolean z5, Float f11, String str, String str2, boolean z11, boolean z12, boolean z13, int i11, Integer num, int i12, ProgressUnit progressUnit, String str3, String str4, String str5, String str6, List list, Integer num2, boolean z14, int i13, m mVar) {
                this(z5, f11, str, str2, z11, z12, (i13 & 64) != 0 ? true : z13, i11, num, i12, progressUnit, str3, str4, str5, str6, (i13 & Utils.MAX_EVENT_SIZE) != 0 ? i0.f76187a : list, num2, z14);
            }

            public final boolean component1() {
                return this.atLeastOneIterationFinished;
            }

            public final int component10() {
                return this.progressMax;
            }

            public final ProgressUnit component11() {
                return this.progressUnit;
            }

            public final String component12() {
                return this.section;
            }

            public final String component13() {
                return this.categoryIconId;
            }

            public final String component14() {
                return this.shortDescription;
            }

            public final String component15() {
                return this.title;
            }

            public final List<String> component16() {
                return this.labelText;
            }

            public final Integer component17() {
                return this.lastFinishedInstanceId;
            }

            public final boolean component18() {
                return this.isAccessible;
            }

            public final Float component2() {
                return this.currentStepProgression;
            }

            public final String component3() {
                return this.dateLastIterationFinished;
            }

            public final String component4() {
                return this.imageURL;
            }

            public final boolean component5() {
                return this.isAppCapability;
            }

            public final boolean component6() {
                return this.isAvailable;
            }

            public final boolean component7() {
                return this.isNew;
            }

            public final int component8() {
                return this.programId;
            }

            public final Integer component9() {
                return this.progress;
            }

            public final Wifit copy(boolean z5, Float f11, String str, String imageURL, boolean z11, boolean z12, boolean z13, int i11, Integer num, int i12, ProgressUnit progressUnit, String str2, String str3, String shortDescription, String title, List<String> labelText, Integer num2, boolean z14) {
                u.j(imageURL, "imageURL");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                return new Wifit(z5, f11, str, imageURL, z11, z12, z13, i11, num, i12, progressUnit, str2, str3, shortDescription, title, labelText, num2, z14);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Wifit)) {
                    return false;
                }
                Wifit wifit = (Wifit) obj;
                if (this.atLeastOneIterationFinished == wifit.atLeastOneIterationFinished && u.e(this.currentStepProgression, wifit.currentStepProgression) && u.e(this.dateLastIterationFinished, wifit.dateLastIterationFinished) && u.e(this.imageURL, wifit.imageURL) && this.isAppCapability == wifit.isAppCapability && this.isAvailable == wifit.isAvailable && this.isNew == wifit.isNew && this.programId == wifit.programId && u.e(this.progress, wifit.progress) && this.progressMax == wifit.progressMax && this.progressUnit == wifit.progressUnit && u.e(this.section, wifit.section) && u.e(this.categoryIconId, wifit.categoryIconId) && u.e(this.shortDescription, wifit.shortDescription) && u.e(this.title, wifit.title) && u.e(this.labelText, wifit.labelText) && u.e(this.lastFinishedInstanceId, wifit.lastFinishedInstanceId) && this.isAccessible == wifit.isAccessible) {
                    return true;
                }
                return false;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public boolean getAtLeastOneIterationFinished() {
                return this.atLeastOneIterationFinished;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public String getCategoryIconId() {
                return this.categoryIconId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public Float getCurrentStepProgression() {
                return this.currentStepProgression;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public String getDateLastIterationFinished() {
                return this.dateLastIterationFinished;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getImageURL() {
                return this.imageURL;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public List<String> getLabelText() {
                return this.labelText;
            }

            public final Integer getLastFinishedInstanceId() {
                return this.lastFinishedInstanceId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public int getProgramId() {
                return this.programId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public Integer getProgress() {
                return this.progress;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public int getProgressMax() {
                return this.progressMax;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public ProgressUnit getProgressUnit() {
                return this.progressUnit;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public String getSection() {
                return this.section;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getShortDescription() {
                return this.shortDescription;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                int hashCode5;
                int hashCode6;
                int hashCode7 = Boolean.hashCode(this.atLeastOneIterationFinished) * 31;
                Float f11 = this.currentStepProgression;
                int i11 = 0;
                if (f11 == null) {
                    hashCode = 0;
                } else {
                    hashCode = f11.hashCode();
                }
                int i12 = (hashCode7 + hashCode) * 31;
                String str = this.dateLastIterationFinished;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int a11 = h.a(this.programId, y1.a(this.isNew, y1.a(this.isAvailable, y1.a(this.isAppCapability, d.c(this.imageURL, (i12 + hashCode2) * 31, 31), 31), 31), 31), 31);
                Integer num = this.progress;
                if (num == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = num.hashCode();
                }
                int a12 = h.a(this.progressMax, (a11 + hashCode3) * 31, 31);
                ProgressUnit progressUnit = this.progressUnit;
                if (progressUnit == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = progressUnit.hashCode();
                }
                int i13 = (a12 + hashCode4) * 31;
                String str2 = this.section;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i14 = (i13 + hashCode5) * 31;
                String str3 = this.categoryIconId;
                if (str3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = str3.hashCode();
                }
                int b10 = e.b(this.labelText, d.c(this.title, d.c(this.shortDescription, (i14 + hashCode6) * 31, 31), 31), 31);
                Integer num2 = this.lastFinishedInstanceId;
                if (num2 != null) {
                    i11 = num2.hashCode();
                }
                return Boolean.hashCode(this.isAccessible) + ((b10 + i11) * 31);
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.Discover
            public boolean isAccessible() {
                return this.isAccessible;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAppCapability() {
                return this.isAppCapability;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAvailable() {
                return this.isAvailable;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isNew() {
                return this.isNew;
            }

            public String toString() {
                boolean z5 = this.atLeastOneIterationFinished;
                Float f11 = this.currentStepProgression;
                String str = this.dateLastIterationFinished;
                String str2 = this.imageURL;
                boolean z11 = this.isAppCapability;
                boolean z12 = this.isAvailable;
                boolean z13 = this.isNew;
                int i11 = this.programId;
                Integer num = this.progress;
                int i12 = this.progressMax;
                ProgressUnit progressUnit = this.progressUnit;
                String str3 = this.section;
                String str4 = this.categoryIconId;
                String str5 = this.shortDescription;
                String str6 = this.title;
                List<String> list = this.labelText;
                Integer num2 = this.lastFinishedInstanceId;
                boolean z14 = this.isAccessible;
                StringBuilder sb2 = new StringBuilder("Wifit(atLeastOneIterationFinished=");
                sb2.append(z5);
                sb2.append(", currentStepProgression=");
                sb2.append(f11);
                sb2.append(", dateLastIterationFinished=");
                b.d(sb2, str, ", imageURL=", str2, ", isAppCapability=");
                sb2.append(z11);
                sb2.append(", isAvailable=");
                sb2.append(z12);
                sb2.append(", isNew=");
                sb2.append(z13);
                sb2.append(", programId=");
                sb2.append(i11);
                sb2.append(", progress=");
                sb2.append(num);
                sb2.append(", progressMax=");
                sb2.append(i12);
                sb2.append(", progressUnit=");
                sb2.append(progressUnit);
                sb2.append(", section=");
                sb2.append(str3);
                sb2.append(", categoryIconId=");
                b.d(sb2, str4, ", shortDescription=", str5, ", title=");
                c.d(sb2, str6, ", labelText=", list, ", lastFinishedInstanceId=");
                sb2.append(num2);
                sb2.append(", isAccessible=");
                sb2.append(z14);
                sb2.append(")");
                return sb2.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Wifit(boolean z5, Float f11, String str, String imageURL, boolean z11, boolean z12, boolean z13, int i11, Integer num, int i12, ProgressUnit progressUnit, String str2, String str3, String shortDescription, String title, List<String> labelText, Integer num2, boolean z14) {
                super(null);
                u.j(imageURL, "imageURL");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                this.atLeastOneIterationFinished = z5;
                this.currentStepProgression = f11;
                this.dateLastIterationFinished = str;
                this.imageURL = imageURL;
                this.isAppCapability = z11;
                this.isAvailable = z12;
                this.isNew = z13;
                this.programId = i11;
                this.progress = num;
                this.progressMax = i12;
                this.progressUnit = progressUnit;
                this.section = str2;
                this.categoryIconId = str3;
                this.shortDescription = shortDescription;
                this.title = title;
                this.labelText = labelText;
                this.lastFinishedInstanceId = num2;
                this.isAccessible = z14;
            }
        }

        private Discover() {
            super(null);
        }
    }

    /* compiled from: ProgramPreviewUi.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi;", "()V", "categoryIconId", "", "getCategoryIconId", "()Ljava/lang/String;", "currentStepProgression", "", "getCurrentStepProgression", "()Ljava/lang/Float;", NavigationArguments.INSTANCE_ID, "", "getInstanceId", "()I", "progress", "getProgress", "()Ljava/lang/Integer;", "progressMax", "getProgressMax", "progressUnit", "Lcom/withings/programs/model/ProgressUnit;", "getProgressUnit", "()Lcom/withings/programs/model/ProgressUnit;", DataLayout.Section.ELEMENT, "getSection", "Legacy", "Wifit", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing$Legacy;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing$Wifit;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class OnGoing extends ProgramPreviewUi {
        public static final int $stable = 0;

        public /* synthetic */ OnGoing(m mVar) {
            this();
        }

        public abstract String getCategoryIconId();

        public abstract Float getCurrentStepProgression();

        public abstract int getInstanceId();

        public abstract Integer getProgress();

        public abstract int getProgressMax();

        public abstract ProgressUnit getProgressUnit();

        public abstract String getSection();

        /* compiled from: ProgramPreviewUi.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0002\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0014HÆ\u0003J\t\u00103\u001a\u00020\u0014HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010%J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J´\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0007HÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R\u0014\u0010\u0015\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010 R\u0014\u0010\u0016\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010 R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019¨\u0006C"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing$Legacy;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing;", "currentStepProgression", "", "imageURL", "", NavigationArguments.INSTANCE_ID, "", NavigationArguments.PROGRAM_ID, "progress", "progressMax", "progressUnit", "Lcom/withings/programs/model/ProgressUnit;", DataLayout.Section.ELEMENT, "categoryIconId", "shortDescription", "title", "labelText", "", "isAppCapability", "", "isAvailable", "isNew", "(Ljava/lang/Float;Ljava/lang/String;IILjava/lang/Integer;ILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZ)V", "getCategoryIconId", "()Ljava/lang/String;", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getImageURL", "getInstanceId", "()I", "()Z", "getLabelText", "()Ljava/util/List;", "getProgramId", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgressMax", "getProgressUnit", "()Lcom/withings/programs/model/ProgressUnit;", "getSection", "getShortDescription", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Float;Ljava/lang/String;IILjava/lang/Integer;ILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZ)Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing$Legacy;", "equals", "other", "", "hashCode", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Legacy extends OnGoing {
            public static final int $stable = 8;
            private final String categoryIconId;
            private final Float currentStepProgression;
            private final String imageURL;
            private final int instanceId;
            private final boolean isAppCapability;
            private final boolean isAvailable;
            private final boolean isNew;
            private final List<String> labelText;
            private final int programId;
            private final Integer progress;
            private final int progressMax;
            private final ProgressUnit progressUnit;
            private final String section;
            private final String shortDescription;
            private final String title;

            public /* synthetic */ Legacy(Float f11, String str, int i11, int i12, Integer num, int i13, ProgressUnit progressUnit, String str2, String str3, String str4, String str5, List list, boolean z5, boolean z11, boolean z12, int i14, m mVar) {
                this(f11, str, i11, i12, num, i13, progressUnit, str2, str3, str4, str5, (i14 & ModuleCopy.f28574b) != 0 ? i0.f76187a : list, (i14 & 4096) != 0 ? true : z5, (i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? true : z11, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z12);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Legacy copy$default(Legacy legacy, Float f11, String str, int i11, int i12, Integer num, int i13, ProgressUnit progressUnit, String str2, String str3, String str4, String str5, List list, boolean z5, boolean z11, boolean z12, int i14, Object obj) {
                Float f12;
                String str6;
                int i15;
                int i16;
                Integer num2;
                int i17;
                ProgressUnit progressUnit2;
                String str7;
                String str8;
                String str9;
                String str10;
                List<String> list2;
                boolean z13;
                boolean z14;
                boolean z15;
                if ((i14 & 1) != 0) {
                    f12 = legacy.currentStepProgression;
                } else {
                    f12 = f11;
                }
                if ((i14 & 2) != 0) {
                    str6 = legacy.imageURL;
                } else {
                    str6 = str;
                }
                if ((i14 & 4) != 0) {
                    i15 = legacy.instanceId;
                } else {
                    i15 = i11;
                }
                if ((i14 & 8) != 0) {
                    i16 = legacy.programId;
                } else {
                    i16 = i12;
                }
                if ((i14 & 16) != 0) {
                    num2 = legacy.progress;
                } else {
                    num2 = num;
                }
                if ((i14 & 32) != 0) {
                    i17 = legacy.progressMax;
                } else {
                    i17 = i13;
                }
                if ((i14 & 64) != 0) {
                    progressUnit2 = legacy.progressUnit;
                } else {
                    progressUnit2 = progressUnit;
                }
                if ((i14 & 128) != 0) {
                    str7 = legacy.section;
                } else {
                    str7 = str2;
                }
                if ((i14 & 256) != 0) {
                    str8 = legacy.categoryIconId;
                } else {
                    str8 = str3;
                }
                if ((i14 & 512) != 0) {
                    str9 = legacy.shortDescription;
                } else {
                    str9 = str4;
                }
                if ((i14 & 1024) != 0) {
                    str10 = legacy.title;
                } else {
                    str10 = str5;
                }
                if ((i14 & ModuleCopy.f28574b) != 0) {
                    list2 = legacy.labelText;
                } else {
                    list2 = list;
                }
                if ((i14 & 4096) != 0) {
                    z13 = legacy.isAppCapability;
                } else {
                    z13 = z5;
                }
                if ((i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                    z14 = legacy.isAvailable;
                } else {
                    z14 = z11;
                }
                if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    z15 = legacy.isNew;
                } else {
                    z15 = z12;
                }
                return legacy.copy(f12, str6, i15, i16, num2, i17, progressUnit2, str7, str8, str9, str10, list2, z13, z14, z15);
            }

            public final Float component1() {
                return this.currentStepProgression;
            }

            public final String component10() {
                return this.shortDescription;
            }

            public final String component11() {
                return this.title;
            }

            public final List<String> component12() {
                return this.labelText;
            }

            public final boolean component13() {
                return this.isAppCapability;
            }

            public final boolean component14() {
                return this.isAvailable;
            }

            public final boolean component15() {
                return this.isNew;
            }

            public final String component2() {
                return this.imageURL;
            }

            public final int component3() {
                return this.instanceId;
            }

            public final int component4() {
                return this.programId;
            }

            public final Integer component5() {
                return this.progress;
            }

            public final int component6() {
                return this.progressMax;
            }

            public final ProgressUnit component7() {
                return this.progressUnit;
            }

            public final String component8() {
                return this.section;
            }

            public final String component9() {
                return this.categoryIconId;
            }

            public final Legacy copy(Float f11, String imageURL, int i11, int i12, Integer num, int i13, ProgressUnit progressUnit, String str, String str2, String shortDescription, String title, List<String> labelText, boolean z5, boolean z11, boolean z12) {
                u.j(imageURL, "imageURL");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                return new Legacy(f11, imageURL, i11, i12, num, i13, progressUnit, str, str2, shortDescription, title, labelText, z5, z11, z12);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Legacy)) {
                    return false;
                }
                Legacy legacy = (Legacy) obj;
                if (u.e(this.currentStepProgression, legacy.currentStepProgression) && u.e(this.imageURL, legacy.imageURL) && this.instanceId == legacy.instanceId && this.programId == legacy.programId && u.e(this.progress, legacy.progress) && this.progressMax == legacy.progressMax && this.progressUnit == legacy.progressUnit && u.e(this.section, legacy.section) && u.e(this.categoryIconId, legacy.categoryIconId) && u.e(this.shortDescription, legacy.shortDescription) && u.e(this.title, legacy.title) && u.e(this.labelText, legacy.labelText) && this.isAppCapability == legacy.isAppCapability && this.isAvailable == legacy.isAvailable && this.isNew == legacy.isNew) {
                    return true;
                }
                return false;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public String getCategoryIconId() {
                return this.categoryIconId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public Float getCurrentStepProgression() {
                return this.currentStepProgression;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getImageURL() {
                return this.imageURL;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public int getInstanceId() {
                return this.instanceId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public List<String> getLabelText() {
                return this.labelText;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public int getProgramId() {
                return this.programId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public Integer getProgress() {
                return this.progress;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public int getProgressMax() {
                return this.progressMax;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public ProgressUnit getProgressUnit() {
                return this.progressUnit;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public String getSection() {
                return this.section;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getShortDescription() {
                return this.shortDescription;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                Float f11 = this.currentStepProgression;
                int i11 = 0;
                if (f11 == null) {
                    hashCode = 0;
                } else {
                    hashCode = f11.hashCode();
                }
                int a11 = h.a(this.programId, h.a(this.instanceId, d.c(this.imageURL, hashCode * 31, 31), 31), 31);
                Integer num = this.progress;
                if (num == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = num.hashCode();
                }
                int a12 = h.a(this.progressMax, (a11 + hashCode2) * 31, 31);
                ProgressUnit progressUnit = this.progressUnit;
                if (progressUnit == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = progressUnit.hashCode();
                }
                int i12 = (a12 + hashCode3) * 31;
                String str = this.section;
                if (str == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = str.hashCode();
                }
                int i13 = (i12 + hashCode4) * 31;
                String str2 = this.categoryIconId;
                if (str2 != null) {
                    i11 = str2.hashCode();
                }
                return Boolean.hashCode(this.isNew) + y1.a(this.isAvailable, y1.a(this.isAppCapability, e.b(this.labelText, d.c(this.title, d.c(this.shortDescription, (i13 + i11) * 31, 31), 31), 31), 31), 31);
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAppCapability() {
                return this.isAppCapability;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAvailable() {
                return this.isAvailable;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isNew() {
                return this.isNew;
            }

            public String toString() {
                Float f11 = this.currentStepProgression;
                String str = this.imageURL;
                int i11 = this.instanceId;
                int i12 = this.programId;
                Integer num = this.progress;
                int i13 = this.progressMax;
                ProgressUnit progressUnit = this.progressUnit;
                String str2 = this.section;
                String str3 = this.categoryIconId;
                String str4 = this.shortDescription;
                String str5 = this.title;
                List<String> list = this.labelText;
                boolean z5 = this.isAppCapability;
                boolean z11 = this.isAvailable;
                boolean z12 = this.isNew;
                StringBuilder sb2 = new StringBuilder("Legacy(currentStepProgression=");
                sb2.append(f11);
                sb2.append(", imageURL=");
                sb2.append(str);
                sb2.append(", instanceId=");
                b.a(sb2, i11, ", programId=", i12, ", progress=");
                sb2.append(num);
                sb2.append(", progressMax=");
                sb2.append(i13);
                sb2.append(", progressUnit=");
                sb2.append(progressUnit);
                sb2.append(", section=");
                sb2.append(str2);
                sb2.append(", categoryIconId=");
                b.d(sb2, str3, ", shortDescription=", str4, ", title=");
                c.d(sb2, str5, ", labelText=", list, ", isAppCapability=");
                sb2.append(z5);
                sb2.append(", isAvailable=");
                sb2.append(z11);
                sb2.append(", isNew=");
                return h.d(sb2, z12, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Legacy(Float f11, String imageURL, int i11, int i12, Integer num, int i13, ProgressUnit progressUnit, String str, String str2, String shortDescription, String title, List<String> labelText, boolean z5, boolean z11, boolean z12) {
                super(null);
                u.j(imageURL, "imageURL");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                this.currentStepProgression = f11;
                this.imageURL = imageURL;
                this.instanceId = i11;
                this.programId = i12;
                this.progress = num;
                this.progressMax = i13;
                this.progressUnit = progressUnit;
                this.section = str;
                this.categoryIconId = str2;
                this.shortDescription = shortDescription;
                this.title = title;
                this.labelText = labelText;
                this.isAppCapability = z5;
                this.isAvailable = z11;
                this.isNew = z12;
            }
        }

        /* compiled from: ProgramPreviewUi.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J°\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\b\u0002\u0010\u0016\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0007HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010 R\u0014\u0010\u0016\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010 R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u0006B"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing$Wifit;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing;", "currentStepProgression", "", "imageURL", "", NavigationArguments.INSTANCE_ID, "", "isAppCapability", "", "isAvailable", NavigationArguments.PROGRAM_ID, "progress", "progressMax", "progressUnit", "Lcom/withings/programs/model/ProgressUnit;", DataLayout.Section.ELEMENT, "categoryIconId", "shortDescription", "title", "labelText", "", "isNew", "(Ljava/lang/Float;Ljava/lang/String;IZZIIILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getCategoryIconId", "()Ljava/lang/String;", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getImageURL", "getInstanceId", "()I", "()Z", "getLabelText", "()Ljava/util/List;", "getProgramId", "getProgress", "()Ljava/lang/Integer;", "getProgressMax", "getProgressUnit", "()Lcom/withings/programs/model/ProgressUnit;", "getSection", "getShortDescription", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Float;Ljava/lang/String;IZZIIILcom/withings/programs/model/ProgressUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/withings/programs/model/programpreview/ProgramPreviewUi$OnGoing$Wifit;", "equals", "other", "", "hashCode", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Wifit extends OnGoing {
            public static final int $stable = 8;
            private final String categoryIconId;
            private final Float currentStepProgression;
            private final String imageURL;
            private final int instanceId;
            private final boolean isAppCapability;
            private final boolean isAvailable;
            private final boolean isNew;
            private final List<String> labelText;
            private final int programId;
            private final int progress;
            private final int progressMax;
            private final ProgressUnit progressUnit;
            private final String section;
            private final String shortDescription;
            private final String title;

            public /* synthetic */ Wifit(Float f11, String str, int i11, boolean z5, boolean z11, int i12, int i13, int i14, ProgressUnit progressUnit, String str2, String str3, String str4, String str5, List list, boolean z12, int i15, m mVar) {
                this(f11, str, i11, z5, z11, i12, i13, i14, progressUnit, str2, str3, str4, str5, (i15 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? i0.f76187a : list, (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z12);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Wifit copy$default(Wifit wifit, Float f11, String str, int i11, boolean z5, boolean z11, int i12, int i13, int i14, ProgressUnit progressUnit, String str2, String str3, String str4, String str5, List list, boolean z12, int i15, Object obj) {
                Float f12;
                String str6;
                int i16;
                boolean z13;
                boolean z14;
                int i17;
                int i18;
                int i19;
                ProgressUnit progressUnit2;
                String str7;
                String str8;
                String str9;
                String str10;
                List<String> list2;
                boolean z15;
                if ((i15 & 1) != 0) {
                    f12 = wifit.currentStepProgression;
                } else {
                    f12 = f11;
                }
                if ((i15 & 2) != 0) {
                    str6 = wifit.imageURL;
                } else {
                    str6 = str;
                }
                if ((i15 & 4) != 0) {
                    i16 = wifit.instanceId;
                } else {
                    i16 = i11;
                }
                if ((i15 & 8) != 0) {
                    z13 = wifit.isAppCapability;
                } else {
                    z13 = z5;
                }
                if ((i15 & 16) != 0) {
                    z14 = wifit.isAvailable;
                } else {
                    z14 = z11;
                }
                if ((i15 & 32) != 0) {
                    i17 = wifit.programId;
                } else {
                    i17 = i12;
                }
                if ((i15 & 64) != 0) {
                    i18 = wifit.progress;
                } else {
                    i18 = i13;
                }
                if ((i15 & 128) != 0) {
                    i19 = wifit.progressMax;
                } else {
                    i19 = i14;
                }
                if ((i15 & 256) != 0) {
                    progressUnit2 = wifit.progressUnit;
                } else {
                    progressUnit2 = progressUnit;
                }
                if ((i15 & 512) != 0) {
                    str7 = wifit.section;
                } else {
                    str7 = str2;
                }
                if ((i15 & 1024) != 0) {
                    str8 = wifit.categoryIconId;
                } else {
                    str8 = str3;
                }
                if ((i15 & ModuleCopy.f28574b) != 0) {
                    str9 = wifit.shortDescription;
                } else {
                    str9 = str4;
                }
                if ((i15 & 4096) != 0) {
                    str10 = wifit.title;
                } else {
                    str10 = str5;
                }
                if ((i15 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                    list2 = wifit.labelText;
                } else {
                    list2 = list;
                }
                if ((i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    z15 = wifit.isNew;
                } else {
                    z15 = z12;
                }
                return wifit.copy(f12, str6, i16, z13, z14, i17, i18, i19, progressUnit2, str7, str8, str9, str10, list2, z15);
            }

            public final Float component1() {
                return this.currentStepProgression;
            }

            public final String component10() {
                return this.section;
            }

            public final String component11() {
                return this.categoryIconId;
            }

            public final String component12() {
                return this.shortDescription;
            }

            public final String component13() {
                return this.title;
            }

            public final List<String> component14() {
                return this.labelText;
            }

            public final boolean component15() {
                return this.isNew;
            }

            public final String component2() {
                return this.imageURL;
            }

            public final int component3() {
                return this.instanceId;
            }

            public final boolean component4() {
                return this.isAppCapability;
            }

            public final boolean component5() {
                return this.isAvailable;
            }

            public final int component6() {
                return this.programId;
            }

            public final int component7() {
                return this.progress;
            }

            public final int component8() {
                return this.progressMax;
            }

            public final ProgressUnit component9() {
                return this.progressUnit;
            }

            public final Wifit copy(Float f11, String imageURL, int i11, boolean z5, boolean z11, int i12, int i13, int i14, ProgressUnit progressUnit, String str, String str2, String shortDescription, String title, List<String> labelText, boolean z12) {
                u.j(imageURL, "imageURL");
                u.j(progressUnit, "progressUnit");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                return new Wifit(f11, imageURL, i11, z5, z11, i12, i13, i14, progressUnit, str, str2, shortDescription, title, labelText, z12);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Wifit)) {
                    return false;
                }
                Wifit wifit = (Wifit) obj;
                if (u.e(this.currentStepProgression, wifit.currentStepProgression) && u.e(this.imageURL, wifit.imageURL) && this.instanceId == wifit.instanceId && this.isAppCapability == wifit.isAppCapability && this.isAvailable == wifit.isAvailable && this.programId == wifit.programId && this.progress == wifit.progress && this.progressMax == wifit.progressMax && this.progressUnit == wifit.progressUnit && u.e(this.section, wifit.section) && u.e(this.categoryIconId, wifit.categoryIconId) && u.e(this.shortDescription, wifit.shortDescription) && u.e(this.title, wifit.title) && u.e(this.labelText, wifit.labelText) && this.isNew == wifit.isNew) {
                    return true;
                }
                return false;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public String getCategoryIconId() {
                return this.categoryIconId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public Float getCurrentStepProgression() {
                return this.currentStepProgression;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getImageURL() {
                return this.imageURL;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public int getInstanceId() {
                return this.instanceId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public List<String> getLabelText() {
                return this.labelText;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public int getProgramId() {
                return this.programId;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public Integer getProgress() {
                return Integer.valueOf(this.progress);
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public int getProgressMax() {
                return this.progressMax;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public ProgressUnit getProgressUnit() {
                return this.progressUnit;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi.OnGoing
            public String getSection() {
                return this.section;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getShortDescription() {
                return this.shortDescription;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                Float f11 = this.currentStepProgression;
                int i11 = 0;
                if (f11 == null) {
                    hashCode = 0;
                } else {
                    hashCode = f11.hashCode();
                }
                int hashCode3 = (this.progressUnit.hashCode() + h.a(this.progressMax, h.a(this.progress, h.a(this.programId, y1.a(this.isAvailable, y1.a(this.isAppCapability, h.a(this.instanceId, d.c(this.imageURL, hashCode * 31, 31), 31), 31), 31), 31), 31), 31)) * 31;
                String str = this.section;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i12 = (hashCode3 + hashCode2) * 31;
                String str2 = this.categoryIconId;
                if (str2 != null) {
                    i11 = str2.hashCode();
                }
                return Boolean.hashCode(this.isNew) + e.b(this.labelText, d.c(this.title, d.c(this.shortDescription, (i12 + i11) * 31, 31), 31), 31);
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAppCapability() {
                return this.isAppCapability;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isAvailable() {
                return this.isAvailable;
            }

            @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
            public boolean isNew() {
                return this.isNew;
            }

            public String toString() {
                Float f11 = this.currentStepProgression;
                String str = this.imageURL;
                int i11 = this.instanceId;
                boolean z5 = this.isAppCapability;
                boolean z11 = this.isAvailable;
                int i12 = this.programId;
                int i13 = this.progress;
                int i14 = this.progressMax;
                ProgressUnit progressUnit = this.progressUnit;
                String str2 = this.section;
                String str3 = this.categoryIconId;
                String str4 = this.shortDescription;
                String str5 = this.title;
                List<String> list = this.labelText;
                boolean z12 = this.isNew;
                StringBuilder sb2 = new StringBuilder("Wifit(currentStepProgression=");
                sb2.append(f11);
                sb2.append(", imageURL=");
                sb2.append(str);
                sb2.append(", instanceId=");
                sb2.append(i11);
                sb2.append(", isAppCapability=");
                sb2.append(z5);
                sb2.append(", isAvailable=");
                sb2.append(z11);
                sb2.append(", programId=");
                sb2.append(i12);
                sb2.append(", progress=");
                b.a(sb2, i13, ", progressMax=", i14, ", progressUnit=");
                sb2.append(progressUnit);
                sb2.append(", section=");
                sb2.append(str2);
                sb2.append(", categoryIconId=");
                b.d(sb2, str3, ", shortDescription=", str4, ", title=");
                c.d(sb2, str5, ", labelText=", list, ", isNew=");
                return h.d(sb2, z12, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Wifit(Float f11, String imageURL, int i11, boolean z5, boolean z11, int i12, int i13, int i14, ProgressUnit progressUnit, String str, String str2, String shortDescription, String title, List<String> labelText, boolean z12) {
                super(null);
                u.j(imageURL, "imageURL");
                u.j(progressUnit, "progressUnit");
                u.j(shortDescription, "shortDescription");
                u.j(title, "title");
                u.j(labelText, "labelText");
                this.currentStepProgression = f11;
                this.imageURL = imageURL;
                this.instanceId = i11;
                this.isAppCapability = z5;
                this.isAvailable = z11;
                this.programId = i12;
                this.progress = i13;
                this.progressMax = i14;
                this.progressUnit = progressUnit;
                this.section = str;
                this.categoryIconId = str2;
                this.shortDescription = shortDescription;
                this.title = title;
                this.labelText = labelText;
                this.isNew = z12;
            }
        }

        private OnGoing() {
            super(null);
        }
    }

    public /* synthetic */ ProgramPreviewUi(m mVar) {
        this();
    }

    public abstract String getImageURL();

    public abstract List<String> getLabelText();

    public abstract int getProgramId();

    public abstract String getShortDescription();

    public abstract String getTitle();

    public abstract boolean isAppCapability();

    public abstract boolean isAvailable();

    public abstract boolean isNew();

    /* compiled from: ProgramPreviewUi.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006,"}, d2 = {"Lcom/withings/programs/model/programpreview/ProgramPreviewUi$Planned;", "Lcom/withings/programs/model/programpreview/ProgramPreviewUi;", "imageURL", "", "isAppCapability", "", "isAvailable", "isNew", NavigationArguments.PROGRAM_ID, "", "shortDescription", "title", "labelText", "", "daysBeforeStart", NavigationArguments.INSTANCE_ID, "(Ljava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/util/List;II)V", "getDaysBeforeStart", "()I", "getImageURL", "()Ljava/lang/String;", "getInstanceId", "()Z", "getLabelText", "()Ljava/util/List;", "getProgramId", "getShortDescription", "getTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Planned extends ProgramPreviewUi {
        public static final int $stable = 8;
        private final int daysBeforeStart;
        private final String imageURL;
        private final int instanceId;
        private final boolean isAppCapability;
        private final boolean isAvailable;
        private final boolean isNew;
        private final List<String> labelText;
        private final int programId;
        private final String shortDescription;
        private final String title;

        public /* synthetic */ Planned(String str, boolean z5, boolean z11, boolean z12, int i11, String str2, String str3, List list, int i12, int i13, int i14, m mVar) {
            this(str, z5, z11, (i14 & 8) != 0 ? false : z12, i11, str2, str3, (i14 & 128) != 0 ? i0.f76187a : list, i12, i13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Planned copy$default(Planned planned, String str, boolean z5, boolean z11, boolean z12, int i11, String str2, String str3, List list, int i12, int i13, int i14, Object obj) {
            String str4;
            boolean z13;
            boolean z14;
            boolean z15;
            int i15;
            String str5;
            String str6;
            List<String> list2;
            int i16;
            int i17;
            if ((i14 & 1) != 0) {
                str4 = planned.imageURL;
            } else {
                str4 = str;
            }
            if ((i14 & 2) != 0) {
                z13 = planned.isAppCapability;
            } else {
                z13 = z5;
            }
            if ((i14 & 4) != 0) {
                z14 = planned.isAvailable;
            } else {
                z14 = z11;
            }
            if ((i14 & 8) != 0) {
                z15 = planned.isNew;
            } else {
                z15 = z12;
            }
            if ((i14 & 16) != 0) {
                i15 = planned.programId;
            } else {
                i15 = i11;
            }
            if ((i14 & 32) != 0) {
                str5 = planned.shortDescription;
            } else {
                str5 = str2;
            }
            if ((i14 & 64) != 0) {
                str6 = planned.title;
            } else {
                str6 = str3;
            }
            if ((i14 & 128) != 0) {
                list2 = planned.labelText;
            } else {
                list2 = list;
            }
            if ((i14 & 256) != 0) {
                i16 = planned.daysBeforeStart;
            } else {
                i16 = i12;
            }
            if ((i14 & 512) != 0) {
                i17 = planned.instanceId;
            } else {
                i17 = i13;
            }
            return planned.copy(str4, z13, z14, z15, i15, str5, str6, list2, i16, i17);
        }

        public final String component1() {
            return this.imageURL;
        }

        public final int component10() {
            return this.instanceId;
        }

        public final boolean component2() {
            return this.isAppCapability;
        }

        public final boolean component3() {
            return this.isAvailable;
        }

        public final boolean component4() {
            return this.isNew;
        }

        public final int component5() {
            return this.programId;
        }

        public final String component6() {
            return this.shortDescription;
        }

        public final String component7() {
            return this.title;
        }

        public final List<String> component8() {
            return this.labelText;
        }

        public final int component9() {
            return this.daysBeforeStart;
        }

        public final Planned copy(String imageURL, boolean z5, boolean z11, boolean z12, int i11, String shortDescription, String title, List<String> labelText, int i12, int i13) {
            u.j(imageURL, "imageURL");
            u.j(shortDescription, "shortDescription");
            u.j(title, "title");
            u.j(labelText, "labelText");
            return new Planned(imageURL, z5, z11, z12, i11, shortDescription, title, labelText, i12, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Planned)) {
                return false;
            }
            Planned planned = (Planned) obj;
            if (u.e(this.imageURL, planned.imageURL) && this.isAppCapability == planned.isAppCapability && this.isAvailable == planned.isAvailable && this.isNew == planned.isNew && this.programId == planned.programId && u.e(this.shortDescription, planned.shortDescription) && u.e(this.title, planned.title) && u.e(this.labelText, planned.labelText) && this.daysBeforeStart == planned.daysBeforeStart && this.instanceId == planned.instanceId) {
                return true;
            }
            return false;
        }

        public final int getDaysBeforeStart() {
            return this.daysBeforeStart;
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public String getImageURL() {
            return this.imageURL;
        }

        public final int getInstanceId() {
            return this.instanceId;
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public List<String> getLabelText() {
            return this.labelText;
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public int getProgramId() {
            return this.programId;
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public String getShortDescription() {
            return this.shortDescription;
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.instanceId) + h.a(this.daysBeforeStart, e.b(this.labelText, d.c(this.title, d.c(this.shortDescription, h.a(this.programId, y1.a(this.isNew, y1.a(this.isAvailable, y1.a(this.isAppCapability, this.imageURL.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public boolean isAppCapability() {
            return this.isAppCapability;
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public boolean isAvailable() {
            return this.isAvailable;
        }

        @Override // com.withings.programs.model.programpreview.ProgramPreviewUi
        public boolean isNew() {
            return this.isNew;
        }

        public String toString() {
            String str = this.imageURL;
            boolean z5 = this.isAppCapability;
            boolean z11 = this.isAvailable;
            boolean z12 = this.isNew;
            int i11 = this.programId;
            String str2 = this.shortDescription;
            String str3 = this.title;
            List<String> list = this.labelText;
            int i12 = this.daysBeforeStart;
            int i13 = this.instanceId;
            StringBuilder sb2 = new StringBuilder("Planned(imageURL=");
            sb2.append(str);
            sb2.append(", isAppCapability=");
            sb2.append(z5);
            sb2.append(", isAvailable=");
            sb2.append(z11);
            sb2.append(", isNew=");
            sb2.append(z12);
            sb2.append(", programId=");
            v.c(sb2, i11, ", shortDescription=", str2, ", title=");
            c.d(sb2, str3, ", labelText=", list, ", daysBeforeStart=");
            sb2.append(i12);
            sb2.append(", instanceId=");
            sb2.append(i13);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Planned(String imageURL, boolean z5, boolean z11, boolean z12, int i11, String shortDescription, String title, List<String> labelText, int i12, int i13) {
            super(null);
            u.j(imageURL, "imageURL");
            u.j(shortDescription, "shortDescription");
            u.j(title, "title");
            u.j(labelText, "labelText");
            this.imageURL = imageURL;
            this.isAppCapability = z5;
            this.isAvailable = z11;
            this.isNew = z12;
            this.programId = i11;
            this.shortDescription = shortDescription;
            this.title = title;
            this.labelText = labelText;
            this.daysBeforeStart = i12;
            this.instanceId = i13;
        }
    }

    private ProgramPreviewUi() {
    }
}
