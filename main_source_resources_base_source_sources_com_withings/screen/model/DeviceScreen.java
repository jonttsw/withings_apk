package com.withings.screen.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.compose.material3.d;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import l1.a;
import org.joda.time.DateTime;
/* compiled from: DeviceScreen.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001:\u00045678Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0013HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\tHÆ\u0003J\u0080\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000fHÖ\u0001J\t\u00104\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001b¨\u00069"}, d2 = {"Lcom/withings/screen/model/DeviceScreen;", "", "id", "", "wsId", "embeddedId", "title", "", "images", "", "Lcom/withings/screen/model/DeviceScreen$Image;", "isFixed", "", "isActive", "selectableStatus", "", "contents", "Lcom/withings/screen/model/DeviceScreen$Content;", "metaData", "Lcom/withings/screen/model/DeviceScreen$MetaData;", "(JJLjava/lang/Long;Ljava/lang/String;Ljava/util/List;ZZILjava/util/List;Lcom/withings/screen/model/DeviceScreen$MetaData;)V", "getContents", "()Ljava/util/List;", "getEmbeddedId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "()J", "getImages", "()Z", "getMetaData", "()Lcom/withings/screen/model/DeviceScreen$MetaData;", "getSelectableStatus", "()I", "getTitle", "()Ljava/lang/String;", "getWsId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/Long;Ljava/lang/String;Ljava/util/List;ZZILjava/util/List;Lcom/withings/screen/model/DeviceScreen$MetaData;)Lcom/withings/screen/model/DeviceScreen;", "equals", "other", "hashCode", "toString", "Content", "DefaultValues", "Image", "MetaData", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceScreen {
    private final List<Content> contents;
    private final Long embeddedId;

    /* renamed from: id  reason: collision with root package name */
    private final long f43961id;
    private final List<Image> images;
    private final boolean isActive;
    private final boolean isFixed;
    private final MetaData metaData;
    private final int selectableStatus;
    private final String title;
    private final long wsId;

    /* compiled from: DeviceScreen.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/withings/screen/model/DeviceScreen$Content;", "", "displayStyle", "", "message", "", "metaData", "Lcom/withings/screen/model/DeviceScreen$Content$MetaData;", "(ILjava/lang/String;Lcom/withings/screen/model/DeviceScreen$Content$MetaData;)V", "getDisplayStyle", "()I", "getMessage", "()Ljava/lang/String;", "getMetaData", "()Lcom/withings/screen/model/DeviceScreen$Content$MetaData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "MetaData", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Content {
        private final int displayStyle;
        private final String message;
        private final MetaData metaData;

        /* compiled from: DeviceScreen.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/withings/screen/model/DeviceScreen$Content$MetaData;", "", "startDate", "Lorg/joda/time/DateTime;", "endDate", "modified", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getEndDate", "()Lorg/joda/time/DateTime;", "getModified", "getStartDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class MetaData {
            private final DateTime endDate;
            private final DateTime modified;
            private final DateTime startDate;

            public MetaData(DateTime dateTime, DateTime dateTime2, DateTime modified) {
                u.j(modified, "modified");
                this.startDate = dateTime;
                this.endDate = dateTime2;
                this.modified = modified;
            }

            public static /* synthetic */ MetaData copy$default(MetaData metaData, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    dateTime = metaData.startDate;
                }
                if ((i11 & 2) != 0) {
                    dateTime2 = metaData.endDate;
                }
                if ((i11 & 4) != 0) {
                    dateTime3 = metaData.modified;
                }
                return metaData.copy(dateTime, dateTime2, dateTime3);
            }

            public final DateTime component1() {
                return this.startDate;
            }

            public final DateTime component2() {
                return this.endDate;
            }

            public final DateTime component3() {
                return this.modified;
            }

            public final MetaData copy(DateTime dateTime, DateTime dateTime2, DateTime modified) {
                u.j(modified, "modified");
                return new MetaData(dateTime, dateTime2, modified);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MetaData)) {
                    return false;
                }
                MetaData metaData = (MetaData) obj;
                if (u.e(this.startDate, metaData.startDate) && u.e(this.endDate, metaData.endDate) && u.e(this.modified, metaData.modified)) {
                    return true;
                }
                return false;
            }

            public final DateTime getEndDate() {
                return this.endDate;
            }

            public final DateTime getModified() {
                return this.modified;
            }

            public final DateTime getStartDate() {
                return this.startDate;
            }

            public int hashCode() {
                int hashCode;
                DateTime dateTime = this.startDate;
                int i11 = 0;
                if (dateTime == null) {
                    hashCode = 0;
                } else {
                    hashCode = dateTime.hashCode();
                }
                int i12 = hashCode * 31;
                DateTime dateTime2 = this.endDate;
                if (dateTime2 != null) {
                    i11 = dateTime2.hashCode();
                }
                return this.modified.hashCode() + ((i12 + i11) * 31);
            }

            public String toString() {
                DateTime dateTime = this.startDate;
                DateTime dateTime2 = this.endDate;
                DateTime dateTime3 = this.modified;
                return "MetaData(startDate=" + dateTime + ", endDate=" + dateTime2 + ", modified=" + dateTime3 + ")";
            }
        }

        public Content(int i11, String message, MetaData metaData) {
            u.j(message, "message");
            u.j(metaData, "metaData");
            this.displayStyle = i11;
            this.message = message;
            this.metaData = metaData;
        }

        public static /* synthetic */ Content copy$default(Content content, int i11, String str, MetaData metaData, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = content.displayStyle;
            }
            if ((i12 & 2) != 0) {
                str = content.message;
            }
            if ((i12 & 4) != 0) {
                metaData = content.metaData;
            }
            return content.copy(i11, str, metaData);
        }

        public final int component1() {
            return this.displayStyle;
        }

        public final String component2() {
            return this.message;
        }

        public final MetaData component3() {
            return this.metaData;
        }

        public final Content copy(int i11, String message, MetaData metaData) {
            u.j(message, "message");
            u.j(metaData, "metaData");
            return new Content(i11, message, metaData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            if (this.displayStyle == content.displayStyle && u.e(this.message, content.message) && u.e(this.metaData, content.metaData)) {
                return true;
            }
            return false;
        }

        public final int getDisplayStyle() {
            return this.displayStyle;
        }

        public final String getMessage() {
            return this.message;
        }

        public final MetaData getMetaData() {
            return this.metaData;
        }

        public int hashCode() {
            return this.metaData.hashCode() + d.c(this.message, Integer.hashCode(this.displayStyle) * 31, 31);
        }

        public String toString() {
            int i11 = this.displayStyle;
            String str = this.message;
            MetaData metaData = this.metaData;
            StringBuilder a11 = d.a("Content(displayStyle=", i11, ", message=", str, ", metaData=");
            a11.append(metaData);
            a11.append(")");
            return a11.toString();
        }
    }

    /* compiled from: DeviceScreen.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/withings/screen/model/DeviceScreen$DefaultValues;", "", "isActive", "", ConstantsWs.REDOX_DATA_MODEL_ORDER, "", "(ZI)V", "()Z", "getOrder", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultValues {
        private final boolean isActive;
        private final int order;

        public DefaultValues(boolean z5, int i11) {
            this.isActive = z5;
            this.order = i11;
        }

        public static /* synthetic */ DefaultValues copy$default(DefaultValues defaultValues, boolean z5, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z5 = defaultValues.isActive;
            }
            if ((i12 & 2) != 0) {
                i11 = defaultValues.order;
            }
            return defaultValues.copy(z5, i11);
        }

        public final boolean component1() {
            return this.isActive;
        }

        public final int component2() {
            return this.order;
        }

        public final DefaultValues copy(boolean z5, int i11) {
            return new DefaultValues(z5, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultValues)) {
                return false;
            }
            DefaultValues defaultValues = (DefaultValues) obj;
            if (this.isActive == defaultValues.isActive && this.order == defaultValues.order) {
                return true;
            }
            return false;
        }

        public final int getOrder() {
            return this.order;
        }

        public int hashCode() {
            return Integer.hashCode(this.order) + (Boolean.hashCode(this.isActive) * 31);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public String toString() {
            boolean z5 = this.isActive;
            int i11 = this.order;
            return "DefaultValues(isActive=" + z5 + ", order=" + i11 + ")";
        }
    }

    /* compiled from: DeviceScreen.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/withings/screen/model/DeviceScreen$Image;", "", "type", "", "height", "width", "data", "", "(IIILjava/lang/String;)V", "getData", "()Ljava/lang/String;", "getHeight", "()I", "getType", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Image {
        private final String data;
        private final int height;
        private final int type;
        private final int width;

        public Image(int i11, int i12, int i13, String data) {
            u.j(data, "data");
            this.type = i11;
            this.height = i12;
            this.width = i13;
            this.data = data;
        }

        public static /* synthetic */ Image copy$default(Image image, int i11, int i12, int i13, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = image.type;
            }
            if ((i14 & 2) != 0) {
                i12 = image.height;
            }
            if ((i14 & 4) != 0) {
                i13 = image.width;
            }
            if ((i14 & 8) != 0) {
                str = image.data;
            }
            return image.copy(i11, i12, i13, str);
        }

        public final int component1() {
            return this.type;
        }

        public final int component2() {
            return this.height;
        }

        public final int component3() {
            return this.width;
        }

        public final String component4() {
            return this.data;
        }

        public final Image copy(int i11, int i12, int i13, String data) {
            u.j(data, "data");
            return new Image(i11, i12, i13, data);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            if (this.type == image.type && this.height == image.height && this.width == image.width && u.e(this.data, image.data)) {
                return true;
            }
            return false;
        }

        public final String getData() {
            return this.data;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getType() {
            return this.type;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.data.hashCode() + h.a(this.width, h.a(this.height, Integer.hashCode(this.type) * 31, 31), 31);
        }

        public String toString() {
            int i11 = this.type;
            int i12 = this.height;
            return a.b(h.e("Image(type=", i11, ", height=", i12, ", width="), this.width, ", data=", this.data, ")");
        }
    }

    /* compiled from: DeviceScreen.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0013HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0017\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J¢\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\bHÖ\u0001J\t\u00109\u001a\u00020\nHÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001f\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b¨\u0006:"}, d2 = {"Lcom/withings/screen/model/DeviceScreen$MetaData;", "", NavigationArguments.USER_ID, "", "deviceId", "parentId", "requiredFeatureIds", "", "", "appDependencies", "", "defaultValues", "Lcom/withings/screen/model/DeviceScreen$DefaultValues;", "source", "start", "Lorg/joda/time/DateTime;", "end", "modified", "isSyncedWithWs", "", "isSyncedWithDevice", "(JJLjava/lang/Long;Ljava/util/List;Ljava/util/List;Lcom/withings/screen/model/DeviceScreen$DefaultValues;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZ)V", "getAppDependencies", "()Ljava/util/List;", "getDefaultValues", "()Lcom/withings/screen/model/DeviceScreen$DefaultValues;", "getDeviceId", "()J", "getEnd", "()Lorg/joda/time/DateTime;", "()Z", "getModified", "getParentId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRequiredFeatureIds", "getSource", "()I", "getStart", "getUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/Long;Ljava/util/List;Ljava/util/List;Lcom/withings/screen/model/DeviceScreen$DefaultValues;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZ)Lcom/withings/screen/model/DeviceScreen$MetaData;", "equals", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MetaData {
        private final List<String> appDependencies;
        private final DefaultValues defaultValues;
        private final long deviceId;
        private final DateTime end;
        private final boolean isSyncedWithDevice;
        private final boolean isSyncedWithWs;
        private final DateTime modified;
        private final Long parentId;
        private final List<List<Integer>> requiredFeatureIds;
        private final int source;
        private final DateTime start;
        private final long userId;

        /* JADX WARN: Multi-variable type inference failed */
        public MetaData(long j5, long j11, Long l5, List<? extends List<Integer>> list, List<String> appDependencies, DefaultValues defaultValues, int i11, DateTime dateTime, DateTime dateTime2, DateTime modified, boolean z5, boolean z11) {
            u.j(appDependencies, "appDependencies");
            u.j(modified, "modified");
            this.userId = j5;
            this.deviceId = j11;
            this.parentId = l5;
            this.requiredFeatureIds = list;
            this.appDependencies = appDependencies;
            this.defaultValues = defaultValues;
            this.source = i11;
            this.start = dateTime;
            this.end = dateTime2;
            this.modified = modified;
            this.isSyncedWithWs = z5;
            this.isSyncedWithDevice = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MetaData copy$default(MetaData metaData, long j5, long j11, Long l5, List list, List list2, DefaultValues defaultValues, int i11, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z5, boolean z11, int i12, Object obj) {
            long j12;
            long j13;
            Long l6;
            List<List<Integer>> list3;
            List<String> list4;
            DefaultValues defaultValues2;
            int i13;
            DateTime dateTime4;
            DateTime dateTime5;
            DateTime dateTime6;
            boolean z12;
            boolean z13;
            if ((i12 & 1) != 0) {
                j12 = metaData.userId;
            } else {
                j12 = j5;
            }
            if ((i12 & 2) != 0) {
                j13 = metaData.deviceId;
            } else {
                j13 = j11;
            }
            if ((i12 & 4) != 0) {
                l6 = metaData.parentId;
            } else {
                l6 = l5;
            }
            if ((i12 & 8) != 0) {
                list3 = metaData.requiredFeatureIds;
            } else {
                list3 = list;
            }
            if ((i12 & 16) != 0) {
                list4 = metaData.appDependencies;
            } else {
                list4 = list2;
            }
            if ((i12 & 32) != 0) {
                defaultValues2 = metaData.defaultValues;
            } else {
                defaultValues2 = defaultValues;
            }
            if ((i12 & 64) != 0) {
                i13 = metaData.source;
            } else {
                i13 = i11;
            }
            if ((i12 & 128) != 0) {
                dateTime4 = metaData.start;
            } else {
                dateTime4 = dateTime;
            }
            if ((i12 & 256) != 0) {
                dateTime5 = metaData.end;
            } else {
                dateTime5 = dateTime2;
            }
            if ((i12 & 512) != 0) {
                dateTime6 = metaData.modified;
            } else {
                dateTime6 = dateTime3;
            }
            if ((i12 & 1024) != 0) {
                z12 = metaData.isSyncedWithWs;
            } else {
                z12 = z5;
            }
            if ((i12 & ModuleCopy.f28574b) != 0) {
                z13 = metaData.isSyncedWithDevice;
            } else {
                z13 = z11;
            }
            return metaData.copy(j12, j13, l6, list3, list4, defaultValues2, i13, dateTime4, dateTime5, dateTime6, z12, z13);
        }

        public final long component1() {
            return this.userId;
        }

        public final DateTime component10() {
            return this.modified;
        }

        public final boolean component11() {
            return this.isSyncedWithWs;
        }

        public final boolean component12() {
            return this.isSyncedWithDevice;
        }

        public final long component2() {
            return this.deviceId;
        }

        public final Long component3() {
            return this.parentId;
        }

        public final List<List<Integer>> component4() {
            return this.requiredFeatureIds;
        }

        public final List<String> component5() {
            return this.appDependencies;
        }

        public final DefaultValues component6() {
            return this.defaultValues;
        }

        public final int component7() {
            return this.source;
        }

        public final DateTime component8() {
            return this.start;
        }

        public final DateTime component9() {
            return this.end;
        }

        public final MetaData copy(long j5, long j11, Long l5, List<? extends List<Integer>> list, List<String> appDependencies, DefaultValues defaultValues, int i11, DateTime dateTime, DateTime dateTime2, DateTime modified, boolean z5, boolean z11) {
            u.j(appDependencies, "appDependencies");
            u.j(modified, "modified");
            return new MetaData(j5, j11, l5, list, appDependencies, defaultValues, i11, dateTime, dateTime2, modified, z5, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            if (this.userId == metaData.userId && this.deviceId == metaData.deviceId && u.e(this.parentId, metaData.parentId) && u.e(this.requiredFeatureIds, metaData.requiredFeatureIds) && u.e(this.appDependencies, metaData.appDependencies) && u.e(this.defaultValues, metaData.defaultValues) && this.source == metaData.source && u.e(this.start, metaData.start) && u.e(this.end, metaData.end) && u.e(this.modified, metaData.modified) && this.isSyncedWithWs == metaData.isSyncedWithWs && this.isSyncedWithDevice == metaData.isSyncedWithDevice) {
                return true;
            }
            return false;
        }

        public final List<String> getAppDependencies() {
            return this.appDependencies;
        }

        public final DefaultValues getDefaultValues() {
            return this.defaultValues;
        }

        public final long getDeviceId() {
            return this.deviceId;
        }

        public final DateTime getEnd() {
            return this.end;
        }

        public final DateTime getModified() {
            return this.modified;
        }

        public final Long getParentId() {
            return this.parentId;
        }

        public final List<List<Integer>> getRequiredFeatureIds() {
            return this.requiredFeatureIds;
        }

        public final int getSource() {
            return this.source;
        }

        public final DateTime getStart() {
            return this.start;
        }

        public final long getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int a11 = c.a(this.deviceId, Long.hashCode(this.userId) * 31, 31);
            Long l5 = this.parentId;
            int i11 = 0;
            if (l5 == null) {
                hashCode = 0;
            } else {
                hashCode = l5.hashCode();
            }
            int i12 = (a11 + hashCode) * 31;
            List<List<Integer>> list = this.requiredFeatureIds;
            if (list == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = list.hashCode();
            }
            int b10 = e.b(this.appDependencies, (i12 + hashCode2) * 31, 31);
            DefaultValues defaultValues = this.defaultValues;
            if (defaultValues == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = defaultValues.hashCode();
            }
            int a12 = h.a(this.source, (b10 + hashCode3) * 31, 31);
            DateTime dateTime = this.start;
            if (dateTime == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = dateTime.hashCode();
            }
            int i13 = (a12 + hashCode4) * 31;
            DateTime dateTime2 = this.end;
            if (dateTime2 != null) {
                i11 = dateTime2.hashCode();
            }
            return Boolean.hashCode(this.isSyncedWithDevice) + y1.a(this.isSyncedWithWs, com.google.android.gms.internal.mlkit_common.a.b(this.modified, (i13 + i11) * 31, 31), 31);
        }

        public final boolean isSyncedWithDevice() {
            return this.isSyncedWithDevice;
        }

        public final boolean isSyncedWithWs() {
            return this.isSyncedWithWs;
        }

        public String toString() {
            long j5 = this.userId;
            long j11 = this.deviceId;
            Long l5 = this.parentId;
            List<List<Integer>> list = this.requiredFeatureIds;
            List<String> list2 = this.appDependencies;
            DefaultValues defaultValues = this.defaultValues;
            int i11 = this.source;
            DateTime dateTime = this.start;
            DateTime dateTime2 = this.end;
            DateTime dateTime3 = this.modified;
            boolean z5 = this.isSyncedWithWs;
            boolean z11 = this.isSyncedWithDevice;
            StringBuilder e11 = v.e("MetaData(userId=", j5, ", deviceId=");
            e11.append(j11);
            e11.append(", parentId=");
            e11.append(l5);
            e11.append(", requiredFeatureIds=");
            e11.append(list);
            e11.append(", appDependencies=");
            e11.append(list2);
            e11.append(", defaultValues=");
            e11.append(defaultValues);
            e11.append(", source=");
            e11.append(i11);
            e11.append(", start=");
            e11.append(dateTime);
            e11.append(", end=");
            e11.append(dateTime2);
            e11.append(", modified=");
            e11.append(dateTime3);
            e11.append(", isSyncedWithWs=");
            e11.append(z5);
            e11.append(", isSyncedWithDevice=");
            e11.append(z11);
            e11.append(")");
            return e11.toString();
        }
    }

    public DeviceScreen(long j5, long j11, Long l5, String title, List<Image> images, boolean z5, boolean z11, int i11, List<Content> contents, MetaData metaData) {
        u.j(title, "title");
        u.j(images, "images");
        u.j(contents, "contents");
        u.j(metaData, "metaData");
        this.f43961id = j5;
        this.wsId = j11;
        this.embeddedId = l5;
        this.title = title;
        this.images = images;
        this.isFixed = z5;
        this.isActive = z11;
        this.selectableStatus = i11;
        this.contents = contents;
        this.metaData = metaData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceScreen copy$default(DeviceScreen deviceScreen, long j5, long j11, Long l5, String str, List list, boolean z5, boolean z11, int i11, List list2, MetaData metaData, int i12, Object obj) {
        long j12;
        long j13;
        Long l6;
        String str2;
        List<Image> list3;
        boolean z12;
        boolean z13;
        int i13;
        List<Content> list4;
        MetaData metaData2;
        if ((i12 & 1) != 0) {
            j12 = deviceScreen.f43961id;
        } else {
            j12 = j5;
        }
        if ((i12 & 2) != 0) {
            j13 = deviceScreen.wsId;
        } else {
            j13 = j11;
        }
        if ((i12 & 4) != 0) {
            l6 = deviceScreen.embeddedId;
        } else {
            l6 = l5;
        }
        if ((i12 & 8) != 0) {
            str2 = deviceScreen.title;
        } else {
            str2 = str;
        }
        if ((i12 & 16) != 0) {
            list3 = deviceScreen.images;
        } else {
            list3 = list;
        }
        if ((i12 & 32) != 0) {
            z12 = deviceScreen.isFixed;
        } else {
            z12 = z5;
        }
        if ((i12 & 64) != 0) {
            z13 = deviceScreen.isActive;
        } else {
            z13 = z11;
        }
        if ((i12 & 128) != 0) {
            i13 = deviceScreen.selectableStatus;
        } else {
            i13 = i11;
        }
        if ((i12 & 256) != 0) {
            list4 = deviceScreen.contents;
        } else {
            list4 = list2;
        }
        if ((i12 & 512) != 0) {
            metaData2 = deviceScreen.metaData;
        } else {
            metaData2 = metaData;
        }
        return deviceScreen.copy(j12, j13, l6, str2, list3, z12, z13, i13, list4, metaData2);
    }

    public final long component1() {
        return this.f43961id;
    }

    public final MetaData component10() {
        return this.metaData;
    }

    public final long component2() {
        return this.wsId;
    }

    public final Long component3() {
        return this.embeddedId;
    }

    public final String component4() {
        return this.title;
    }

    public final List<Image> component5() {
        return this.images;
    }

    public final boolean component6() {
        return this.isFixed;
    }

    public final boolean component7() {
        return this.isActive;
    }

    public final int component8() {
        return this.selectableStatus;
    }

    public final List<Content> component9() {
        return this.contents;
    }

    public final DeviceScreen copy(long j5, long j11, Long l5, String title, List<Image> images, boolean z5, boolean z11, int i11, List<Content> contents, MetaData metaData) {
        u.j(title, "title");
        u.j(images, "images");
        u.j(contents, "contents");
        u.j(metaData, "metaData");
        return new DeviceScreen(j5, j11, l5, title, images, z5, z11, i11, contents, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceScreen)) {
            return false;
        }
        DeviceScreen deviceScreen = (DeviceScreen) obj;
        if (this.f43961id == deviceScreen.f43961id && this.wsId == deviceScreen.wsId && u.e(this.embeddedId, deviceScreen.embeddedId) && u.e(this.title, deviceScreen.title) && u.e(this.images, deviceScreen.images) && this.isFixed == deviceScreen.isFixed && this.isActive == deviceScreen.isActive && this.selectableStatus == deviceScreen.selectableStatus && u.e(this.contents, deviceScreen.contents) && u.e(this.metaData, deviceScreen.metaData)) {
            return true;
        }
        return false;
    }

    public final List<Content> getContents() {
        return this.contents;
    }

    public final Long getEmbeddedId() {
        return this.embeddedId;
    }

    public final long getId() {
        return this.f43961id;
    }

    public final List<Image> getImages() {
        return this.images;
    }

    public final MetaData getMetaData() {
        return this.metaData;
    }

    public final int getSelectableStatus() {
        return this.selectableStatus;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int a11 = c.a(this.wsId, Long.hashCode(this.f43961id) * 31, 31);
        Long l5 = this.embeddedId;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        return this.metaData.hashCode() + e.b(this.contents, h.a(this.selectableStatus, y1.a(this.isActive, y1.a(this.isFixed, e.b(this.images, d.c(this.title, (a11 + hashCode) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isFixed() {
        return this.isFixed;
    }

    public String toString() {
        long j5 = this.f43961id;
        long j11 = this.wsId;
        Long l5 = this.embeddedId;
        String str = this.title;
        List<Image> list = this.images;
        boolean z5 = this.isFixed;
        boolean z11 = this.isActive;
        int i11 = this.selectableStatus;
        List<Content> list2 = this.contents;
        MetaData metaData = this.metaData;
        StringBuilder e11 = v.e("DeviceScreen(id=", j5, ", wsId=");
        e11.append(j11);
        e11.append(", embeddedId=");
        e11.append(l5);
        e11.append(", title=");
        e11.append(str);
        e11.append(", images=");
        e11.append(list);
        e11.append(", isFixed=");
        e11.append(z5);
        e11.append(", isActive=");
        e11.append(z11);
        e11.append(", selectableStatus=");
        e11.append(i11);
        e11.append(", contents=");
        e11.append(list2);
        e11.append(", metaData=");
        e11.append(metaData);
        e11.append(")");
        return e11.toString();
    }
}
