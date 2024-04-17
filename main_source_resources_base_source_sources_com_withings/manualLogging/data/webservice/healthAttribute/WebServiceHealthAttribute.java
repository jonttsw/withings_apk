package com.withings.manualLogging.data.webservice.healthAttribute;

import androidx.appcompat.widget.v0;
import androidx.camera.core.y1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: WebServiceHealthAttribute.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b1\b\u0086\b\u0018\u0000 ?2\u00020\u0001:\u0001?B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J²\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\t\u0010>\u001a\u00020\bHÖ\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u001b¨\u0006@"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/WebServiceHealthAttribute;", "", "type", "", "id", "", NavigationArguments.USER_ID, "name", "", "key", "keyDescription", "descriptionDefaultValue", "lastServerModification", "Lorg/joda/time/DateTime;", "isDeleted", "", "minAge", "maxAge", "category", "subCategory", WebServiceHealthAttribute.FIELD_ASSET_NAME, "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Ljava/lang/String;", "getCategory", "getDescriptionDefaultValue", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getKey", "getKeyDescription", "getLastServerModification", "()Lorg/joda/time/DateTime;", "getMaxAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinAge", "getName", "getSubCategory", "getType", "()I", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withings/manualLogging/data/webservice/healthAttribute/WebServiceHealthAttribute;", "equals", "other", "hashCode", "toString", "Companion", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebServiceHealthAttribute {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_ASSET_NAME = "asset";
    public static final String FIELD_CATEGORY_NAME = "category";
    public static final String FIELD_DESCRIPTION_DEFAULT_VALUE_NAME = "description_default";
    public static final String FIELD_IS_DELETED_NAME = "deleted";
    public static final String FIELD_KEY_DESCRIPTION_NAME = "description_key";
    public static final String FIELD_KEY_NAME = "key";
    public static final String FIELD_MAX_AGE_NAME = "age_max";
    public static final String FIELD_MIN_AGE_NAME = "age_min";
    public static final String FIELD_NAME_NAME = "name";
    public static final String FIELD_REMOTE_ID_NAME = "healthattributeid";
    public static final String FIELD_SERVER_MODIFICATION_NAME = "modified";
    public static final String FIELD_SUBCATEGORY_NAME = "subcategory";
    public static final String FIELD_TYPE_NAME = "type";
    public static final String FIELD_USER_ID_NAME = "userid";
    @SerializedName(FIELD_ASSET_NAME)
    private final String asset;
    @SerializedName("category")
    private final String category;
    @SerializedName(FIELD_DESCRIPTION_DEFAULT_VALUE_NAME)
    private final String descriptionDefaultValue;
    @SerializedName(FIELD_REMOTE_ID_NAME)

    /* renamed from: id  reason: collision with root package name */
    private final Long f40692id;
    @SerializedName("deleted")
    private final boolean isDeleted;
    @SerializedName("key")
    private final String key;
    @SerializedName(FIELD_KEY_DESCRIPTION_NAME)
    private final String keyDescription;
    @SerializedName("modified")
    private final DateTime lastServerModification;
    @SerializedName(FIELD_MAX_AGE_NAME)
    private final Integer maxAge;
    @SerializedName(FIELD_MIN_AGE_NAME)
    private final Integer minAge;
    @SerializedName("name")
    private final String name;
    @SerializedName(FIELD_SUBCATEGORY_NAME)
    private final String subCategory;
    @SerializedName("type")
    private final int type;
    @SerializedName("userid")
    private final Long userId;

    /* compiled from: WebServiceHealthAttribute.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/WebServiceHealthAttribute$Companion;", "", "()V", "FIELD_ASSET_NAME", "", "FIELD_CATEGORY_NAME", "FIELD_DESCRIPTION_DEFAULT_VALUE_NAME", "FIELD_IS_DELETED_NAME", "FIELD_KEY_DESCRIPTION_NAME", "FIELD_KEY_NAME", "FIELD_MAX_AGE_NAME", "FIELD_MIN_AGE_NAME", "FIELD_NAME_NAME", "FIELD_REMOTE_ID_NAME", "FIELD_SERVER_MODIFICATION_NAME", "FIELD_SUBCATEGORY_NAME", "FIELD_TYPE_NAME", "FIELD_USER_ID_NAME", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public WebServiceHealthAttribute(int i11, Long l5, Long l6, String str, String str2, String str3, String str4, DateTime dateTime, boolean z5, Integer num, Integer num2, String str5, String str6, String str7) {
        this.type = i11;
        this.f40692id = l5;
        this.userId = l6;
        this.name = str;
        this.key = str2;
        this.keyDescription = str3;
        this.descriptionDefaultValue = str4;
        this.lastServerModification = dateTime;
        this.isDeleted = z5;
        this.minAge = num;
        this.maxAge = num2;
        this.category = str5;
        this.subCategory = str6;
        this.asset = str7;
    }

    public static /* synthetic */ WebServiceHealthAttribute copy$default(WebServiceHealthAttribute webServiceHealthAttribute, int i11, Long l5, Long l6, String str, String str2, String str3, String str4, DateTime dateTime, boolean z5, Integer num, Integer num2, String str5, String str6, String str7, int i12, Object obj) {
        int i13;
        Long l11;
        Long l12;
        String str8;
        String str9;
        String str10;
        String str11;
        DateTime dateTime2;
        boolean z11;
        Integer num3;
        Integer num4;
        String str12;
        String str13;
        String str14;
        if ((i12 & 1) != 0) {
            i13 = webServiceHealthAttribute.type;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            l11 = webServiceHealthAttribute.f40692id;
        } else {
            l11 = l5;
        }
        if ((i12 & 4) != 0) {
            l12 = webServiceHealthAttribute.userId;
        } else {
            l12 = l6;
        }
        if ((i12 & 8) != 0) {
            str8 = webServiceHealthAttribute.name;
        } else {
            str8 = str;
        }
        if ((i12 & 16) != 0) {
            str9 = webServiceHealthAttribute.key;
        } else {
            str9 = str2;
        }
        if ((i12 & 32) != 0) {
            str10 = webServiceHealthAttribute.keyDescription;
        } else {
            str10 = str3;
        }
        if ((i12 & 64) != 0) {
            str11 = webServiceHealthAttribute.descriptionDefaultValue;
        } else {
            str11 = str4;
        }
        if ((i12 & 128) != 0) {
            dateTime2 = webServiceHealthAttribute.lastServerModification;
        } else {
            dateTime2 = dateTime;
        }
        if ((i12 & 256) != 0) {
            z11 = webServiceHealthAttribute.isDeleted;
        } else {
            z11 = z5;
        }
        if ((i12 & 512) != 0) {
            num3 = webServiceHealthAttribute.minAge;
        } else {
            num3 = num;
        }
        if ((i12 & 1024) != 0) {
            num4 = webServiceHealthAttribute.maxAge;
        } else {
            num4 = num2;
        }
        if ((i12 & ModuleCopy.f28574b) != 0) {
            str12 = webServiceHealthAttribute.category;
        } else {
            str12 = str5;
        }
        if ((i12 & 4096) != 0) {
            str13 = webServiceHealthAttribute.subCategory;
        } else {
            str13 = str6;
        }
        if ((i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str14 = webServiceHealthAttribute.asset;
        } else {
            str14 = str7;
        }
        return webServiceHealthAttribute.copy(i13, l11, l12, str8, str9, str10, str11, dateTime2, z11, num3, num4, str12, str13, str14);
    }

    public final int component1() {
        return this.type;
    }

    public final Integer component10() {
        return this.minAge;
    }

    public final Integer component11() {
        return this.maxAge;
    }

    public final String component12() {
        return this.category;
    }

    public final String component13() {
        return this.subCategory;
    }

    public final String component14() {
        return this.asset;
    }

    public final Long component2() {
        return this.f40692id;
    }

    public final Long component3() {
        return this.userId;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.key;
    }

    public final String component6() {
        return this.keyDescription;
    }

    public final String component7() {
        return this.descriptionDefaultValue;
    }

    public final DateTime component8() {
        return this.lastServerModification;
    }

    public final boolean component9() {
        return this.isDeleted;
    }

    public final WebServiceHealthAttribute copy(int i11, Long l5, Long l6, String str, String str2, String str3, String str4, DateTime dateTime, boolean z5, Integer num, Integer num2, String str5, String str6, String str7) {
        return new WebServiceHealthAttribute(i11, l5, l6, str, str2, str3, str4, dateTime, z5, num, num2, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebServiceHealthAttribute)) {
            return false;
        }
        WebServiceHealthAttribute webServiceHealthAttribute = (WebServiceHealthAttribute) obj;
        if (this.type == webServiceHealthAttribute.type && u.e(this.f40692id, webServiceHealthAttribute.f40692id) && u.e(this.userId, webServiceHealthAttribute.userId) && u.e(this.name, webServiceHealthAttribute.name) && u.e(this.key, webServiceHealthAttribute.key) && u.e(this.keyDescription, webServiceHealthAttribute.keyDescription) && u.e(this.descriptionDefaultValue, webServiceHealthAttribute.descriptionDefaultValue) && u.e(this.lastServerModification, webServiceHealthAttribute.lastServerModification) && this.isDeleted == webServiceHealthAttribute.isDeleted && u.e(this.minAge, webServiceHealthAttribute.minAge) && u.e(this.maxAge, webServiceHealthAttribute.maxAge) && u.e(this.category, webServiceHealthAttribute.category) && u.e(this.subCategory, webServiceHealthAttribute.subCategory) && u.e(this.asset, webServiceHealthAttribute.asset)) {
            return true;
        }
        return false;
    }

    public final String getAsset() {
        return this.asset;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDescriptionDefaultValue() {
        return this.descriptionDefaultValue;
    }

    public final Long getId() {
        return this.f40692id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getKeyDescription() {
        return this.keyDescription;
    }

    public final DateTime getLastServerModification() {
        return this.lastServerModification;
    }

    public final Integer getMaxAge() {
        return this.maxAge;
    }

    public final Integer getMinAge() {
        return this.minAge;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubCategory() {
        return this.subCategory;
    }

    public final int getType() {
        return this.type;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = Integer.hashCode(this.type) * 31;
        Long l5 = this.f40692id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (hashCode12 + hashCode) * 31;
        Long l6 = this.userId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.name;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.key;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str3 = this.keyDescription;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str4 = this.descriptionDefaultValue;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        DateTime dateTime = this.lastServerModification;
        if (dateTime == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = dateTime.hashCode();
        }
        int a11 = y1.a(this.isDeleted, (i17 + hashCode7) * 31, 31);
        Integer num = this.minAge;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i18 = (a11 + hashCode8) * 31;
        Integer num2 = this.maxAge;
        if (num2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num2.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        String str5 = this.category;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i21 = (i19 + hashCode10) * 31;
        String str6 = this.subCategory;
        if (str6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str6.hashCode();
        }
        int i22 = (i21 + hashCode11) * 31;
        String str7 = this.asset;
        if (str7 != null) {
            i11 = str7.hashCode();
        }
        return i22 + i11;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public String toString() {
        int i11 = this.type;
        Long l5 = this.f40692id;
        Long l6 = this.userId;
        String str = this.name;
        String str2 = this.key;
        String str3 = this.keyDescription;
        String str4 = this.descriptionDefaultValue;
        DateTime dateTime = this.lastServerModification;
        boolean z5 = this.isDeleted;
        Integer num = this.minAge;
        Integer num2 = this.maxAge;
        String str5 = this.category;
        String str6 = this.subCategory;
        String str7 = this.asset;
        StringBuilder sb2 = new StringBuilder("WebServiceHealthAttribute(type=");
        sb2.append(i11);
        sb2.append(", id=");
        sb2.append(l5);
        sb2.append(", userId=");
        sb2.append(l6);
        sb2.append(", name=");
        sb2.append(str);
        sb2.append(", key=");
        b.d(sb2, str2, ", keyDescription=", str3, ", descriptionDefaultValue=");
        sb2.append(str4);
        sb2.append(", lastServerModification=");
        sb2.append(dateTime);
        sb2.append(", isDeleted=");
        sb2.append(z5);
        sb2.append(", minAge=");
        sb2.append(num);
        sb2.append(", maxAge=");
        sb2.append(num2);
        sb2.append(", category=");
        sb2.append(str5);
        sb2.append(", subCategory=");
        return v0.d(sb2, str6, ", asset=", str7, ")");
    }

    public /* synthetic */ WebServiceHealthAttribute(int i11, Long l5, Long l6, String str, String str2, String str3, String str4, DateTime dateTime, boolean z5, Integer num, Integer num2, String str5, String str6, String str7, int i12, m mVar) {
        this(i11, (i12 & 2) != 0 ? null : l5, (i12 & 4) != 0 ? null : l6, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4, (i12 & 128) != 0 ? null : dateTime, (i12 & 256) != 0 ? false : z5, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : num2, (i12 & ModuleCopy.f28574b) != 0 ? null : str5, (i12 & 4096) != 0 ? null : str6, (i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 ? str7 : null);
    }
}
