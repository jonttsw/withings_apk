package com.withings.healthplus.contentscreens.ui.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.healthplus.congrats.ui.model.SuccessTaskInfo;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kk.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jivesoftware.smack.packet.Message;
/* compiled from: ContentScreenUi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\b\u001c\u001d\u001e\u001f !\"#B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0012\u0010\u001a\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010\u0082\u0001\u0007$%&'()*¨\u0006+"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "", "()V", "canBeCompleted", "", "getCanBeCompleted", "()Z", "canBeFavorite", "getCanBeFavorite", "canBeSwap", "getCanBeSwap", "canTts", "getCanTts", NavigationArguments.CONTENT_ID, "", "getContentId", "()Ljava/lang/String;", "imageUrl", "getImageUrl", "tagList", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "getTagList", "()Ljava/util/List;", "title", "getTitle", "type", "getType", "ArticleScreenUi", "Companion", "DiscoveryScreenUi", "MeasurementScreenUi", "ObjectiveScreenUi", "RecipeScreenUi", "SurveyScreenUi", "WorkoutScreenUi", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$ArticleScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$DiscoveryScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$MeasurementScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$ObjectiveScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$SurveyScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$WorkoutScreenUi;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ContentScreenUi {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$Companion;", "", "()V", "retrieveSuccessTaskInfo", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "isManualMeasurement", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static /* synthetic */ SuccessTaskInfo retrieveSuccessTaskInfo$default(Companion companion, ContentScreenUi contentScreenUi, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z5 = false;
            }
            return companion.retrieveSuccessTaskInfo(contentScreenUi, z5);
        }

        public final SuccessTaskInfo retrieveSuccessTaskInfo(ContentScreenUi contentScreenUi, boolean z5) {
            u.j(contentScreenUi, "<this>");
            if (contentScreenUi instanceof ArticleScreenUi) {
                return SuccessTaskInfo.f40095h;
            }
            if (contentScreenUi instanceof WorkoutScreenUi) {
                return SuccessTaskInfo.f40100m;
            }
            if (contentScreenUi instanceof RecipeScreenUi) {
                return SuccessTaskInfo.f40099l;
            }
            if (contentScreenUi instanceof DiscoveryScreenUi) {
                return SuccessTaskInfo.f40102o;
            }
            if (contentScreenUi instanceof SurveyScreenUi) {
                return SuccessTaskInfo.f40101n;
            }
            if (contentScreenUi instanceof MeasurementScreenUi) {
                if (z5) {
                    return SuccessTaskInfo.f40098k;
                }
                return SuccessTaskInfo.f40097j;
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ContentScreenUi(m mVar) {
        this();
    }

    public abstract boolean getCanBeCompleted();

    public abstract boolean getCanBeFavorite();

    public abstract boolean getCanBeSwap();

    public abstract boolean getCanTts();

    public abstract String getContentId();

    public abstract String getImageUrl();

    public abstract List<TagUi> getTagList();

    public abstract String getTitle();

    public abstract String getType();

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0097\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001J\u0013\u00102\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0011\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00068"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$ArticleScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "type", "", "title", "tagList", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "canBeCompleted", "", NavigationArguments.CONTENT_ID, "imageUrl", "canBeSwap", Message.BODY, HealthConstants.FoodInfo.DESCRIPTION, HealthConstants.HealthDocument.AUTHOR, "authorLink", "canBeFavorite", "canTts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAuthor", "()Ljava/lang/String;", "getAuthorLink", "getBody", "getCanBeCompleted", "()Z", "getCanBeFavorite", "getCanBeSwap", "getCanTts", "getContentId", "getDescription", "getImageUrl", "getTagList", "()Ljava/util/List;", "getTitle", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ArticleScreenUi extends ContentScreenUi {
        public static final int $stable = 8;
        private final String author;
        private final String authorLink;
        private final String body;
        private final boolean canBeCompleted;
        private final boolean canBeFavorite;
        private final boolean canBeSwap;
        private final boolean canTts;
        private final String contentId;
        private final String description;
        private final String imageUrl;
        private final List<TagUi> tagList;
        private final String title;
        private final String type;

        public /* synthetic */ ArticleScreenUi(String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, String str6, String str7, String str8, boolean z12, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE : str, str2, list, z5, str3, str4, z11, str5, str6, str7, str8, (i11 & ModuleCopy.f28574b) != 0 ? true : z12, (i11 & 4096) != 0 ? true : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ArticleScreenUi copy$default(ArticleScreenUi articleScreenUi, String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, String str6, String str7, String str8, boolean z12, boolean z13, int i11, Object obj) {
            String str9;
            String str10;
            List<TagUi> list2;
            boolean z14;
            String str11;
            String str12;
            boolean z15;
            String str13;
            String str14;
            String str15;
            String str16;
            boolean z16;
            boolean z17;
            if ((i11 & 1) != 0) {
                str9 = articleScreenUi.type;
            } else {
                str9 = str;
            }
            if ((i11 & 2) != 0) {
                str10 = articleScreenUi.title;
            } else {
                str10 = str2;
            }
            if ((i11 & 4) != 0) {
                list2 = articleScreenUi.tagList;
            } else {
                list2 = list;
            }
            if ((i11 & 8) != 0) {
                z14 = articleScreenUi.canBeCompleted;
            } else {
                z14 = z5;
            }
            if ((i11 & 16) != 0) {
                str11 = articleScreenUi.contentId;
            } else {
                str11 = str3;
            }
            if ((i11 & 32) != 0) {
                str12 = articleScreenUi.imageUrl;
            } else {
                str12 = str4;
            }
            if ((i11 & 64) != 0) {
                z15 = articleScreenUi.canBeSwap;
            } else {
                z15 = z11;
            }
            if ((i11 & 128) != 0) {
                str13 = articleScreenUi.body;
            } else {
                str13 = str5;
            }
            if ((i11 & 256) != 0) {
                str14 = articleScreenUi.description;
            } else {
                str14 = str6;
            }
            if ((i11 & 512) != 0) {
                str15 = articleScreenUi.author;
            } else {
                str15 = str7;
            }
            if ((i11 & 1024) != 0) {
                str16 = articleScreenUi.authorLink;
            } else {
                str16 = str8;
            }
            if ((i11 & ModuleCopy.f28574b) != 0) {
                z16 = articleScreenUi.canBeFavorite;
            } else {
                z16 = z12;
            }
            if ((i11 & 4096) != 0) {
                z17 = articleScreenUi.canTts;
            } else {
                z17 = z13;
            }
            return articleScreenUi.copy(str9, str10, list2, z14, str11, str12, z15, str13, str14, str15, str16, z16, z17);
        }

        public final String component1() {
            return this.type;
        }

        public final String component10() {
            return this.author;
        }

        public final String component11() {
            return this.authorLink;
        }

        public final boolean component12() {
            return this.canBeFavorite;
        }

        public final boolean component13() {
            return this.canTts;
        }

        public final String component2() {
            return this.title;
        }

        public final List<TagUi> component3() {
            return this.tagList;
        }

        public final boolean component4() {
            return this.canBeCompleted;
        }

        public final String component5() {
            return this.contentId;
        }

        public final String component6() {
            return this.imageUrl;
        }

        public final boolean component7() {
            return this.canBeSwap;
        }

        public final String component8() {
            return this.body;
        }

        public final String component9() {
            return this.description;
        }

        public final ArticleScreenUi copy(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String body, String str, String str2, String str3, boolean z12, boolean z13) {
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(body, "body");
            return new ArticleScreenUi(type, title, tagList, z5, contentId, imageUrl, z11, body, str, str2, str3, z12, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleScreenUi)) {
                return false;
            }
            ArticleScreenUi articleScreenUi = (ArticleScreenUi) obj;
            if (u.e(this.type, articleScreenUi.type) && u.e(this.title, articleScreenUi.title) && u.e(this.tagList, articleScreenUi.tagList) && this.canBeCompleted == articleScreenUi.canBeCompleted && u.e(this.contentId, articleScreenUi.contentId) && u.e(this.imageUrl, articleScreenUi.imageUrl) && this.canBeSwap == articleScreenUi.canBeSwap && u.e(this.body, articleScreenUi.body) && u.e(this.description, articleScreenUi.description) && u.e(this.author, articleScreenUi.author) && u.e(this.authorLink, articleScreenUi.authorLink) && this.canBeFavorite == articleScreenUi.canBeFavorite && this.canTts == articleScreenUi.canTts) {
                return true;
            }
            return false;
        }

        public final String getAuthor() {
            return this.author;
        }

        public final String getAuthorLink() {
            return this.authorLink;
        }

        public final String getBody() {
            return this.body;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeCompleted() {
            return this.canBeCompleted;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeFavorite() {
            return this.canBeFavorite;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeSwap() {
            return this.canBeSwap;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanTts() {
            return this.canTts;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getContentId() {
            return this.contentId;
        }

        public final String getDescription() {
            return this.description;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getImageUrl() {
            return this.imageUrl;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public List<TagUi> getTagList() {
            return this.tagList;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getTitle() {
            return this.title;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int c11 = d.c(this.body, y1.a(this.canBeSwap, d.c(this.imageUrl, d.c(this.contentId, y1.a(this.canBeCompleted, e.b(this.tagList, d.c(this.title, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
            String str = this.description;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (c11 + hashCode) * 31;
            String str2 = this.author;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.authorLink;
            if (str3 != null) {
                i11 = str3.hashCode();
            }
            return Boolean.hashCode(this.canTts) + y1.a(this.canBeFavorite, (i13 + i11) * 31, 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.title;
            List<TagUi> list = this.tagList;
            boolean z5 = this.canBeCompleted;
            String str3 = this.contentId;
            String str4 = this.imageUrl;
            boolean z11 = this.canBeSwap;
            String str5 = this.body;
            String str6 = this.description;
            String str7 = this.author;
            String str8 = this.authorLink;
            boolean z12 = this.canBeFavorite;
            boolean z13 = this.canTts;
            StringBuilder b10 = l0.b("ArticleScreenUi(type=", str, ", title=", str2, ", tagList=");
            b10.append(list);
            b10.append(", canBeCompleted=");
            b10.append(z5);
            b10.append(", contentId=");
            b.d(b10, str3, ", imageUrl=", str4, ", canBeSwap=");
            b10.append(z11);
            b10.append(", body=");
            b10.append(str5);
            b10.append(", description=");
            b.d(b10, str6, ", author=", str7, ", authorLink=");
            b10.append(str8);
            b10.append(", canBeFavorite=");
            b10.append(z12);
            b10.append(", canTts=");
            return h.d(b10, z13, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleScreenUi(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String body, String str, String str2, String str3, boolean z12, boolean z13) {
            super(null);
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(body, "body");
            this.type = type;
            this.title = title;
            this.tagList = tagList;
            this.canBeCompleted = z5;
            this.contentId = contentId;
            this.imageUrl = imageUrl;
            this.canBeSwap = z11;
            this.body = body;
            this.description = str;
            this.author = str2;
            this.authorLink = str3;
            this.canBeFavorite = z12;
            this.canTts = z13;
        }
    }

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003Js\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u000f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006/"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$DiscoveryScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "type", "", "title", "tagList", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "canBeCompleted", "", NavigationArguments.CONTENT_ID, "imageUrl", "canBeSwap", Message.BODY, "canBeFavorite", "canTts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZ)V", "getBody", "()Ljava/lang/String;", "getCanBeCompleted", "()Z", "getCanBeFavorite", "getCanBeSwap", "getCanTts", "getContentId", "getImageUrl", "getTagList", "()Ljava/util/List;", "getTitle", "getType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DiscoveryScreenUi extends ContentScreenUi {
        public static final int $stable = 8;
        private final String body;
        private final boolean canBeCompleted;
        private final boolean canBeFavorite;
        private final boolean canBeSwap;
        private final boolean canTts;
        private final String contentId;
        private final String imageUrl;
        private final List<TagUi> tagList;
        private final String title;
        private final String type;

        public /* synthetic */ DiscoveryScreenUi(String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, boolean z12, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? ConstantsWs.WELLNESS_TASK_TYPE_DISCOVERY : str, str2, list, z5, str3, str4, z11, str5, (i11 & 256) != 0 ? true : z12, (i11 & 512) != 0 ? true : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DiscoveryScreenUi copy$default(DiscoveryScreenUi discoveryScreenUi, String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, boolean z12, boolean z13, int i11, Object obj) {
            String str6;
            String str7;
            List<TagUi> list2;
            boolean z14;
            String str8;
            String str9;
            boolean z15;
            String str10;
            boolean z16;
            boolean z17;
            if ((i11 & 1) != 0) {
                str6 = discoveryScreenUi.type;
            } else {
                str6 = str;
            }
            if ((i11 & 2) != 0) {
                str7 = discoveryScreenUi.title;
            } else {
                str7 = str2;
            }
            if ((i11 & 4) != 0) {
                list2 = discoveryScreenUi.tagList;
            } else {
                list2 = list;
            }
            if ((i11 & 8) != 0) {
                z14 = discoveryScreenUi.canBeCompleted;
            } else {
                z14 = z5;
            }
            if ((i11 & 16) != 0) {
                str8 = discoveryScreenUi.contentId;
            } else {
                str8 = str3;
            }
            if ((i11 & 32) != 0) {
                str9 = discoveryScreenUi.imageUrl;
            } else {
                str9 = str4;
            }
            if ((i11 & 64) != 0) {
                z15 = discoveryScreenUi.canBeSwap;
            } else {
                z15 = z11;
            }
            if ((i11 & 128) != 0) {
                str10 = discoveryScreenUi.body;
            } else {
                str10 = str5;
            }
            if ((i11 & 256) != 0) {
                z16 = discoveryScreenUi.canBeFavorite;
            } else {
                z16 = z12;
            }
            if ((i11 & 512) != 0) {
                z17 = discoveryScreenUi.canTts;
            } else {
                z17 = z13;
            }
            return discoveryScreenUi.copy(str6, str7, list2, z14, str8, str9, z15, str10, z16, z17);
        }

        public final String component1() {
            return this.type;
        }

        public final boolean component10() {
            return this.canTts;
        }

        public final String component2() {
            return this.title;
        }

        public final List<TagUi> component3() {
            return this.tagList;
        }

        public final boolean component4() {
            return this.canBeCompleted;
        }

        public final String component5() {
            return this.contentId;
        }

        public final String component6() {
            return this.imageUrl;
        }

        public final boolean component7() {
            return this.canBeSwap;
        }

        public final String component8() {
            return this.body;
        }

        public final boolean component9() {
            return this.canBeFavorite;
        }

        public final DiscoveryScreenUi copy(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String body, boolean z12, boolean z13) {
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(body, "body");
            return new DiscoveryScreenUi(type, title, tagList, z5, contentId, imageUrl, z11, body, z12, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscoveryScreenUi)) {
                return false;
            }
            DiscoveryScreenUi discoveryScreenUi = (DiscoveryScreenUi) obj;
            if (u.e(this.type, discoveryScreenUi.type) && u.e(this.title, discoveryScreenUi.title) && u.e(this.tagList, discoveryScreenUi.tagList) && this.canBeCompleted == discoveryScreenUi.canBeCompleted && u.e(this.contentId, discoveryScreenUi.contentId) && u.e(this.imageUrl, discoveryScreenUi.imageUrl) && this.canBeSwap == discoveryScreenUi.canBeSwap && u.e(this.body, discoveryScreenUi.body) && this.canBeFavorite == discoveryScreenUi.canBeFavorite && this.canTts == discoveryScreenUi.canTts) {
                return true;
            }
            return false;
        }

        public final String getBody() {
            return this.body;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeCompleted() {
            return this.canBeCompleted;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeFavorite() {
            return this.canBeFavorite;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeSwap() {
            return this.canBeSwap;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanTts() {
            return this.canTts;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getContentId() {
            return this.contentId;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getImageUrl() {
            return this.imageUrl;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public List<TagUi> getTagList() {
            return this.tagList;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getTitle() {
            return this.title;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Boolean.hashCode(this.canTts) + y1.a(this.canBeFavorite, d.c(this.body, y1.a(this.canBeSwap, d.c(this.imageUrl, d.c(this.contentId, y1.a(this.canBeCompleted, e.b(this.tagList, d.c(this.title, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.title;
            List<TagUi> list = this.tagList;
            boolean z5 = this.canBeCompleted;
            String str3 = this.contentId;
            String str4 = this.imageUrl;
            boolean z11 = this.canBeSwap;
            String str5 = this.body;
            boolean z12 = this.canBeFavorite;
            boolean z13 = this.canTts;
            StringBuilder b10 = l0.b("DiscoveryScreenUi(type=", str, ", title=", str2, ", tagList=");
            b10.append(list);
            b10.append(", canBeCompleted=");
            b10.append(z5);
            b10.append(", contentId=");
            b.d(b10, str3, ", imageUrl=", str4, ", canBeSwap=");
            b10.append(z11);
            b10.append(", body=");
            b10.append(str5);
            b10.append(", canBeFavorite=");
            b10.append(z12);
            b10.append(", canTts=");
            b10.append(z13);
            b10.append(")");
            return b10.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscoveryScreenUi(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String body, boolean z12, boolean z13) {
            super(null);
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(body, "body");
            this.type = type;
            this.title = title;
            this.tagList = tagList;
            this.canBeCompleted = z5;
            this.contentId = contentId;
            this.imageUrl = imageUrl;
            this.canBeSwap = z11;
            this.body = body;
            this.canBeFavorite = z12;
            this.canTts = z13;
        }
    }

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b8\u00109J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u008c\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0004J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0015\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010*\u001a\u0004\b+\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b,\u0010\u0004R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010\tR\u001a\u0010\u0018\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b1\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b2\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b3\u0010\fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b4\u0010\u0004R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b5\u0010\tR\u001a\u0010\u001e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b6\u0010\fR\u001a\u0010\u001f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b7\u0010\f¨\u0006:"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$ObjectiveScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "", "component1", "()Ljava/lang/String;", "component2", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "component3", "()Ljava/util/List;", "", "component4", "()Z", "component5", "component6", "component7", "component8", "Lkk/a;", "component9", "component10", "component11", "type", "title", "tagList", "canBeCompleted", NavigationArguments.CONTENT_ID, "imageUrl", "canBeSwap", HealthConstants.FoodInfo.DESCRIPTION, "recommendedDevices", "canBeFavorite", "canTts", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZZ)Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$ObjectiveScreenUi;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getTitle", "Ljava/util/List;", "getTagList", "Z", "getCanBeCompleted", "getContentId", "getImageUrl", "getCanBeSwap", "getDescription", "getRecommendedDevices", "getCanBeFavorite", "getCanTts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ZZ)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ObjectiveScreenUi extends ContentScreenUi {
        public static final int $stable = 8;
        private final boolean canBeCompleted;
        private final boolean canBeFavorite;
        private final boolean canBeSwap;
        private final boolean canTts;
        private final String contentId;
        private final String description;
        private final String imageUrl;
        private final List<a> recommendedDevices;
        private final List<TagUi> tagList;
        private final String title;
        private final String type;

        public /* synthetic */ ObjectiveScreenUi(String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, List list2, boolean z12, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? ConstantsWs.WELLNESS_TASK_TYPE_OBJECTIVE : str, str2, list, z5, str3, str4, z11, str5, list2, (i11 & 512) != 0 ? false : z12, (i11 & 1024) != 0 ? false : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ObjectiveScreenUi copy$default(ObjectiveScreenUi objectiveScreenUi, String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, List list2, boolean z12, boolean z13, int i11, Object obj) {
            String str6;
            String str7;
            List<TagUi> list3;
            boolean z14;
            String str8;
            String str9;
            boolean z15;
            String str10;
            List<a> list4;
            boolean z16;
            boolean z17;
            if ((i11 & 1) != 0) {
                str6 = objectiveScreenUi.type;
            } else {
                str6 = str;
            }
            if ((i11 & 2) != 0) {
                str7 = objectiveScreenUi.title;
            } else {
                str7 = str2;
            }
            if ((i11 & 4) != 0) {
                list3 = objectiveScreenUi.tagList;
            } else {
                list3 = list;
            }
            if ((i11 & 8) != 0) {
                z14 = objectiveScreenUi.canBeCompleted;
            } else {
                z14 = z5;
            }
            if ((i11 & 16) != 0) {
                str8 = objectiveScreenUi.contentId;
            } else {
                str8 = str3;
            }
            if ((i11 & 32) != 0) {
                str9 = objectiveScreenUi.imageUrl;
            } else {
                str9 = str4;
            }
            if ((i11 & 64) != 0) {
                z15 = objectiveScreenUi.canBeSwap;
            } else {
                z15 = z11;
            }
            if ((i11 & 128) != 0) {
                str10 = objectiveScreenUi.description;
            } else {
                str10 = str5;
            }
            if ((i11 & 256) != 0) {
                list4 = objectiveScreenUi.recommendedDevices;
            } else {
                list4 = list2;
            }
            if ((i11 & 512) != 0) {
                z16 = objectiveScreenUi.canBeFavorite;
            } else {
                z16 = z12;
            }
            if ((i11 & 1024) != 0) {
                z17 = objectiveScreenUi.canTts;
            } else {
                z17 = z13;
            }
            return objectiveScreenUi.copy(str6, str7, list3, z14, str8, str9, z15, str10, list4, z16, z17);
        }

        public final String component1() {
            return this.type;
        }

        public final boolean component10() {
            return this.canBeFavorite;
        }

        public final boolean component11() {
            return this.canTts;
        }

        public final String component2() {
            return this.title;
        }

        public final List<TagUi> component3() {
            return this.tagList;
        }

        public final boolean component4() {
            return this.canBeCompleted;
        }

        public final String component5() {
            return this.contentId;
        }

        public final String component6() {
            return this.imageUrl;
        }

        public final boolean component7() {
            return this.canBeSwap;
        }

        public final String component8() {
            return this.description;
        }

        public final List<a> component9() {
            return this.recommendedDevices;
        }

        public final ObjectiveScreenUi copy(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String str, List<a> recommendedDevices, boolean z12, boolean z13) {
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(recommendedDevices, "recommendedDevices");
            return new ObjectiveScreenUi(type, title, tagList, z5, contentId, imageUrl, z11, str, recommendedDevices, z12, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ObjectiveScreenUi)) {
                return false;
            }
            ObjectiveScreenUi objectiveScreenUi = (ObjectiveScreenUi) obj;
            if (u.e(this.type, objectiveScreenUi.type) && u.e(this.title, objectiveScreenUi.title) && u.e(this.tagList, objectiveScreenUi.tagList) && this.canBeCompleted == objectiveScreenUi.canBeCompleted && u.e(this.contentId, objectiveScreenUi.contentId) && u.e(this.imageUrl, objectiveScreenUi.imageUrl) && this.canBeSwap == objectiveScreenUi.canBeSwap && u.e(this.description, objectiveScreenUi.description) && u.e(this.recommendedDevices, objectiveScreenUi.recommendedDevices) && this.canBeFavorite == objectiveScreenUi.canBeFavorite && this.canTts == objectiveScreenUi.canTts) {
                return true;
            }
            return false;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeCompleted() {
            return this.canBeCompleted;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeFavorite() {
            return this.canBeFavorite;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeSwap() {
            return this.canBeSwap;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanTts() {
            return this.canTts;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getContentId() {
            return this.contentId;
        }

        public final String getDescription() {
            return this.description;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final List<a> getRecommendedDevices() {
            return this.recommendedDevices;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public List<TagUi> getTagList() {
            return this.tagList;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getTitle() {
            return this.title;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int a11 = y1.a(this.canBeSwap, d.c(this.imageUrl, d.c(this.contentId, y1.a(this.canBeCompleted, e.b(this.tagList, d.c(this.title, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31);
            String str = this.description;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.canTts) + y1.a(this.canBeFavorite, e.b(this.recommendedDevices, (a11 + hashCode) * 31, 31), 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.title;
            List<TagUi> list = this.tagList;
            boolean z5 = this.canBeCompleted;
            String str3 = this.contentId;
            String str4 = this.imageUrl;
            boolean z11 = this.canBeSwap;
            String str5 = this.description;
            List<a> list2 = this.recommendedDevices;
            boolean z12 = this.canBeFavorite;
            boolean z13 = this.canTts;
            StringBuilder b10 = l0.b("ObjectiveScreenUi(type=", str, ", title=", str2, ", tagList=");
            b10.append(list);
            b10.append(", canBeCompleted=");
            b10.append(z5);
            b10.append(", contentId=");
            b.d(b10, str3, ", imageUrl=", str4, ", canBeSwap=");
            b10.append(z11);
            b10.append(", description=");
            b10.append(str5);
            b10.append(", recommendedDevices=");
            b10.append(list2);
            b10.append(", canBeFavorite=");
            b10.append(z12);
            b10.append(", canTts=");
            return h.d(b10, z13, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ObjectiveScreenUi(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String str, List<a> recommendedDevices, boolean z12, boolean z13) {
            super(null);
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(recommendedDevices, "recommendedDevices");
            this.type = type;
            this.title = title;
            this.tagList = tagList;
            this.canBeCompleted = z5;
            this.contentId = contentId;
            this.imageUrl = imageUrl;
            this.canBeSwap = z11;
            this.description = str;
            this.recommendedDevices = recommendedDevices;
            this.canBeFavorite = z12;
            this.canTts = z13;
        }
    }

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004;<=>B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003J¥\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tHÆ\u0001J\u0013\u00105\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001d¨\u0006?"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "type", "", "title", "tagList", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "canBeCompleted", "", NavigationArguments.CONTENT_ID, "imageUrl", "canBeSwap", HealthConstants.FoodInfo.DESCRIPTION, "nutritionalValue", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi;", "ingredients", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeIngredientUi;", "instructions", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeInstructionUi;", "canBeFavorite", "canTts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "getCanBeCompleted", "()Z", "getCanBeFavorite", "getCanBeSwap", "getCanTts", "getContentId", "()Ljava/lang/String;", "getDescription", "getImageUrl", "getIngredients", "()Ljava/util/List;", "getInstructions", "getNutritionalValue", "getTagList", "getTitle", "getType", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "RecipeIngredientUi", "RecipeInstructionUi", "RecipeNutritionalValueChildrenUi", "RecipeNutritionalValueUi", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RecipeScreenUi extends ContentScreenUi {
        public static final int $stable = 8;
        private final boolean canBeCompleted;
        private final boolean canBeFavorite;
        private final boolean canBeSwap;
        private final boolean canTts;
        private final String contentId;
        private final String description;
        private final String imageUrl;
        private final List<RecipeIngredientUi> ingredients;
        private final List<RecipeInstructionUi> instructions;
        private final List<RecipeNutritionalValueUi> nutritionalValue;
        private final List<TagUi> tagList;
        private final String title;
        private final String type;

        /* compiled from: ContentScreenUi.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeIngredientUi;", "", "name", "", "replacement", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getReplacement", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class RecipeIngredientUi {
            public static final int $stable = 0;
            private final String name;
            private final String replacement;

            public RecipeIngredientUi(String name, String str) {
                u.j(name, "name");
                this.name = name;
                this.replacement = str;
            }

            public static /* synthetic */ RecipeIngredientUi copy$default(RecipeIngredientUi recipeIngredientUi, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = recipeIngredientUi.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = recipeIngredientUi.replacement;
                }
                return recipeIngredientUi.copy(str, str2);
            }

            public final String component1() {
                return this.name;
            }

            public final String component2() {
                return this.replacement;
            }

            public final RecipeIngredientUi copy(String name, String str) {
                u.j(name, "name");
                return new RecipeIngredientUi(name, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RecipeIngredientUi)) {
                    return false;
                }
                RecipeIngredientUi recipeIngredientUi = (RecipeIngredientUi) obj;
                if (u.e(this.name, recipeIngredientUi.name) && u.e(this.replacement, recipeIngredientUi.replacement)) {
                    return true;
                }
                return false;
            }

            public final String getName() {
                return this.name;
            }

            public final String getReplacement() {
                return this.replacement;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.name.hashCode() * 31;
                String str = this.replacement;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                return k0.c("RecipeIngredientUi(name=", this.name, ", replacement=", this.replacement, ")");
            }
        }

        /* compiled from: ContentScreenUi.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeInstructionUi;", "", "title", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class RecipeInstructionUi {
            public static final int $stable = 0;
            private final String text;
            private final String title;

            public RecipeInstructionUi(String title, String text) {
                u.j(title, "title");
                u.j(text, "text");
                this.title = title;
                this.text = text;
            }

            public static /* synthetic */ RecipeInstructionUi copy$default(RecipeInstructionUi recipeInstructionUi, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = recipeInstructionUi.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = recipeInstructionUi.text;
                }
                return recipeInstructionUi.copy(str, str2);
            }

            public final String component1() {
                return this.title;
            }

            public final String component2() {
                return this.text;
            }

            public final RecipeInstructionUi copy(String title, String text) {
                u.j(title, "title");
                u.j(text, "text");
                return new RecipeInstructionUi(title, text);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RecipeInstructionUi)) {
                    return false;
                }
                RecipeInstructionUi recipeInstructionUi = (RecipeInstructionUi) obj;
                if (u.e(this.title, recipeInstructionUi.title) && u.e(this.text, recipeInstructionUi.text)) {
                    return true;
                }
                return false;
            }

            public final String getText() {
                return this.text;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.text.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return k0.c("RecipeInstructionUi(title=", this.title, ", text=", this.text, ")");
            }
        }

        /* compiled from: ContentScreenUi.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fB/\b\u0011\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001d\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$ui_release", "(Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", Constants.ScionAnalytics.PARAM_LABEL, "value", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "ui_release"}, k = 1, mv = {1, 9, 0})
        @Serializable
        /* loaded from: classes3.dex */
        public static final class RecipeNutritionalValueChildrenUi {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String label;
            private final String value;

            /* compiled from: ContentScreenUi.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(m mVar) {
                    this();
                }

                public final KSerializer<RecipeNutritionalValueChildrenUi> serializer() {
                    return ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ RecipeNutritionalValueChildrenUi(int i11, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i11 & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 3, ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer.INSTANCE.getDescriptor());
                }
                this.label = str;
                this.value = str2;
            }

            public static /* synthetic */ RecipeNutritionalValueChildrenUi copy$default(RecipeNutritionalValueChildrenUi recipeNutritionalValueChildrenUi, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = recipeNutritionalValueChildrenUi.label;
                }
                if ((i11 & 2) != 0) {
                    str2 = recipeNutritionalValueChildrenUi.value;
                }
                return recipeNutritionalValueChildrenUi.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$ui_release(RecipeNutritionalValueChildrenUi recipeNutritionalValueChildrenUi, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, recipeNutritionalValueChildrenUi.label);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, recipeNutritionalValueChildrenUi.value);
            }

            public final String component1() {
                return this.label;
            }

            public final String component2() {
                return this.value;
            }

            public final RecipeNutritionalValueChildrenUi copy(String label, String value) {
                u.j(label, "label");
                u.j(value, "value");
                return new RecipeNutritionalValueChildrenUi(label, value);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RecipeNutritionalValueChildrenUi)) {
                    return false;
                }
                RecipeNutritionalValueChildrenUi recipeNutritionalValueChildrenUi = (RecipeNutritionalValueChildrenUi) obj;
                if (u.e(this.label, recipeNutritionalValueChildrenUi.label) && u.e(this.value, recipeNutritionalValueChildrenUi.value)) {
                    return true;
                }
                return false;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + (this.label.hashCode() * 31);
            }

            public String toString() {
                return k0.c("RecipeNutritionalValueChildrenUi(label=", this.label, ", value=", this.value, ")");
            }

            public RecipeNutritionalValueChildrenUi(String label, String value) {
                u.j(label, "label");
                u.j(value, "value");
                this.label = label;
                this.value = value;
            }
        }

        /* compiled from: ContentScreenUi.kt */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b%\u0010&B?\b\u0011\u0012\u0006\u0010'\u001a\u00020\u0019\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\"\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006-"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$ui_release", "(Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi;", "component3", "()Ljava/util/List;", Constants.ScionAnalytics.PARAM_LABEL, "value", "children", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getValue", "Ljava/util/List;", "getChildren", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "ui_release"}, k = 1, mv = {1, 9, 0})
        @Serializable
        /* loaded from: classes3.dex */
        public static final class RecipeNutritionalValueUi {
            private final List<RecipeNutritionalValueChildrenUi> children;
            private final String label;
            private final String value;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueChildrenUi$$serializer.INSTANCE)};

            /* compiled from: ContentScreenUi.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class Companion {
                public /* synthetic */ Companion(m mVar) {
                    this();
                }

                public final KSerializer<RecipeNutritionalValueUi> serializer() {
                    return ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ RecipeNutritionalValueUi(int i11, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i11 & 7)) {
                    PluginExceptionsKt.throwMissingFieldException(i11, 7, ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi$$serializer.INSTANCE.getDescriptor());
                }
                this.label = str;
                this.value = str2;
                this.children = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RecipeNutritionalValueUi copy$default(RecipeNutritionalValueUi recipeNutritionalValueUi, String str, String str2, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = recipeNutritionalValueUi.label;
                }
                if ((i11 & 2) != 0) {
                    str2 = recipeNutritionalValueUi.value;
                }
                if ((i11 & 4) != 0) {
                    list = recipeNutritionalValueUi.children;
                }
                return recipeNutritionalValueUi.copy(str, str2, list);
            }

            public static final /* synthetic */ void write$Self$ui_release(RecipeNutritionalValueUi recipeNutritionalValueUi, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                compositeEncoder.encodeStringElement(serialDescriptor, 0, recipeNutritionalValueUi.label);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, recipeNutritionalValueUi.value);
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], recipeNutritionalValueUi.children);
            }

            public final String component1() {
                return this.label;
            }

            public final String component2() {
                return this.value;
            }

            public final List<RecipeNutritionalValueChildrenUi> component3() {
                return this.children;
            }

            public final RecipeNutritionalValueUi copy(String label, String value, List<RecipeNutritionalValueChildrenUi> list) {
                u.j(label, "label");
                u.j(value, "value");
                return new RecipeNutritionalValueUi(label, value, list);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RecipeNutritionalValueUi)) {
                    return false;
                }
                RecipeNutritionalValueUi recipeNutritionalValueUi = (RecipeNutritionalValueUi) obj;
                if (u.e(this.label, recipeNutritionalValueUi.label) && u.e(this.value, recipeNutritionalValueUi.value) && u.e(this.children, recipeNutritionalValueUi.children)) {
                    return true;
                }
                return false;
            }

            public final List<RecipeNutritionalValueChildrenUi> getChildren() {
                return this.children;
            }

            public final String getLabel() {
                return this.label;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int hashCode;
                int c11 = d.c(this.value, this.label.hashCode() * 31, 31);
                List<RecipeNutritionalValueChildrenUi> list = this.children;
                if (list == null) {
                    hashCode = 0;
                } else {
                    hashCode = list.hashCode();
                }
                return c11 + hashCode;
            }

            public String toString() {
                String str = this.label;
                String str2 = this.value;
                return d.i(l0.b("RecipeNutritionalValueUi(label=", str, ", value=", str2, ", children="), this.children, ")");
            }

            public RecipeNutritionalValueUi(String label, String value, List<RecipeNutritionalValueChildrenUi> list) {
                u.j(label, "label");
                u.j(value, "value");
                this.label = label;
                this.value = value;
                this.children = list;
            }
        }

        public /* synthetic */ RecipeScreenUi(String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, List list2, List list3, List list4, boolean z12, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? ConstantsWs.WELLNESS_TASK_TYPE_RECIPE : str, str2, list, z5, str3, str4, z11, str5, list2, list3, list4, (i11 & ModuleCopy.f28574b) != 0 ? true : z12, (i11 & 4096) != 0 ? false : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecipeScreenUi copy$default(RecipeScreenUi recipeScreenUi, String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, List list2, List list3, List list4, boolean z12, boolean z13, int i11, Object obj) {
            String str6;
            String str7;
            List<TagUi> list5;
            boolean z14;
            String str8;
            String str9;
            boolean z15;
            String str10;
            List<RecipeNutritionalValueUi> list6;
            List<RecipeIngredientUi> list7;
            List<RecipeInstructionUi> list8;
            boolean z16;
            boolean z17;
            if ((i11 & 1) != 0) {
                str6 = recipeScreenUi.type;
            } else {
                str6 = str;
            }
            if ((i11 & 2) != 0) {
                str7 = recipeScreenUi.title;
            } else {
                str7 = str2;
            }
            if ((i11 & 4) != 0) {
                list5 = recipeScreenUi.tagList;
            } else {
                list5 = list;
            }
            if ((i11 & 8) != 0) {
                z14 = recipeScreenUi.canBeCompleted;
            } else {
                z14 = z5;
            }
            if ((i11 & 16) != 0) {
                str8 = recipeScreenUi.contentId;
            } else {
                str8 = str3;
            }
            if ((i11 & 32) != 0) {
                str9 = recipeScreenUi.imageUrl;
            } else {
                str9 = str4;
            }
            if ((i11 & 64) != 0) {
                z15 = recipeScreenUi.canBeSwap;
            } else {
                z15 = z11;
            }
            if ((i11 & 128) != 0) {
                str10 = recipeScreenUi.description;
            } else {
                str10 = str5;
            }
            if ((i11 & 256) != 0) {
                list6 = recipeScreenUi.nutritionalValue;
            } else {
                list6 = list2;
            }
            if ((i11 & 512) != 0) {
                list7 = recipeScreenUi.ingredients;
            } else {
                list7 = list3;
            }
            if ((i11 & 1024) != 0) {
                list8 = recipeScreenUi.instructions;
            } else {
                list8 = list4;
            }
            if ((i11 & ModuleCopy.f28574b) != 0) {
                z16 = recipeScreenUi.canBeFavorite;
            } else {
                z16 = z12;
            }
            if ((i11 & 4096) != 0) {
                z17 = recipeScreenUi.canTts;
            } else {
                z17 = z13;
            }
            return recipeScreenUi.copy(str6, str7, list5, z14, str8, str9, z15, str10, list6, list7, list8, z16, z17);
        }

        public final String component1() {
            return this.type;
        }

        public final List<RecipeIngredientUi> component10() {
            return this.ingredients;
        }

        public final List<RecipeInstructionUi> component11() {
            return this.instructions;
        }

        public final boolean component12() {
            return this.canBeFavorite;
        }

        public final boolean component13() {
            return this.canTts;
        }

        public final String component2() {
            return this.title;
        }

        public final List<TagUi> component3() {
            return this.tagList;
        }

        public final boolean component4() {
            return this.canBeCompleted;
        }

        public final String component5() {
            return this.contentId;
        }

        public final String component6() {
            return this.imageUrl;
        }

        public final boolean component7() {
            return this.canBeSwap;
        }

        public final String component8() {
            return this.description;
        }

        public final List<RecipeNutritionalValueUi> component9() {
            return this.nutritionalValue;
        }

        public final RecipeScreenUi copy(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String str, List<RecipeNutritionalValueUi> nutritionalValue, List<RecipeIngredientUi> ingredients, List<RecipeInstructionUi> instructions, boolean z12, boolean z13) {
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(nutritionalValue, "nutritionalValue");
            u.j(ingredients, "ingredients");
            u.j(instructions, "instructions");
            return new RecipeScreenUi(type, title, tagList, z5, contentId, imageUrl, z11, str, nutritionalValue, ingredients, instructions, z12, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipeScreenUi)) {
                return false;
            }
            RecipeScreenUi recipeScreenUi = (RecipeScreenUi) obj;
            if (u.e(this.type, recipeScreenUi.type) && u.e(this.title, recipeScreenUi.title) && u.e(this.tagList, recipeScreenUi.tagList) && this.canBeCompleted == recipeScreenUi.canBeCompleted && u.e(this.contentId, recipeScreenUi.contentId) && u.e(this.imageUrl, recipeScreenUi.imageUrl) && this.canBeSwap == recipeScreenUi.canBeSwap && u.e(this.description, recipeScreenUi.description) && u.e(this.nutritionalValue, recipeScreenUi.nutritionalValue) && u.e(this.ingredients, recipeScreenUi.ingredients) && u.e(this.instructions, recipeScreenUi.instructions) && this.canBeFavorite == recipeScreenUi.canBeFavorite && this.canTts == recipeScreenUi.canTts) {
                return true;
            }
            return false;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeCompleted() {
            return this.canBeCompleted;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeFavorite() {
            return this.canBeFavorite;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeSwap() {
            return this.canBeSwap;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanTts() {
            return this.canTts;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getContentId() {
            return this.contentId;
        }

        public final String getDescription() {
            return this.description;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final List<RecipeIngredientUi> getIngredients() {
            return this.ingredients;
        }

        public final List<RecipeInstructionUi> getInstructions() {
            return this.instructions;
        }

        public final List<RecipeNutritionalValueUi> getNutritionalValue() {
            return this.nutritionalValue;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public List<TagUi> getTagList() {
            return this.tagList;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getTitle() {
            return this.title;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int a11 = y1.a(this.canBeSwap, d.c(this.imageUrl, d.c(this.contentId, y1.a(this.canBeCompleted, e.b(this.tagList, d.c(this.title, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31);
            String str = this.description;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.canTts) + y1.a(this.canBeFavorite, e.b(this.instructions, e.b(this.ingredients, e.b(this.nutritionalValue, (a11 + hashCode) * 31, 31), 31), 31), 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.title;
            List<TagUi> list = this.tagList;
            boolean z5 = this.canBeCompleted;
            String str3 = this.contentId;
            String str4 = this.imageUrl;
            boolean z11 = this.canBeSwap;
            String str5 = this.description;
            List<RecipeNutritionalValueUi> list2 = this.nutritionalValue;
            List<RecipeIngredientUi> list3 = this.ingredients;
            List<RecipeInstructionUi> list4 = this.instructions;
            boolean z12 = this.canBeFavorite;
            boolean z13 = this.canTts;
            StringBuilder b10 = l0.b("RecipeScreenUi(type=", str, ", title=", str2, ", tagList=");
            b10.append(list);
            b10.append(", canBeCompleted=");
            b10.append(z5);
            b10.append(", contentId=");
            b.d(b10, str3, ", imageUrl=", str4, ", canBeSwap=");
            b10.append(z11);
            b10.append(", description=");
            b10.append(str5);
            b10.append(", nutritionalValue=");
            com.withings.contentproviders.eightfit.model.webservice.a.a(b10, list2, ", ingredients=", list3, ", instructions=");
            b10.append(list4);
            b10.append(", canBeFavorite=");
            b10.append(z12);
            b10.append(", canTts=");
            return h.d(b10, z13, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecipeScreenUi(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String str, List<RecipeNutritionalValueUi> nutritionalValue, List<RecipeIngredientUi> ingredients, List<RecipeInstructionUi> instructions, boolean z12, boolean z13) {
            super(null);
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(nutritionalValue, "nutritionalValue");
            u.j(ingredients, "ingredients");
            u.j(instructions, "instructions");
            this.type = type;
            this.title = title;
            this.tagList = tagList;
            this.canBeCompleted = z5;
            this.contentId = contentId;
            this.imageUrl = imageUrl;
            this.canBeSwap = z11;
            this.description = str;
            this.nutritionalValue = nutritionalValue;
            this.ingredients = ingredients;
            this.instructions = instructions;
            this.canBeFavorite = z12;
            this.canTts = z13;
        }
    }

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\f\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u00062"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$SurveyScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "type", "", "title", "tagList", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "canBeCompleted", "", NavigationArguments.CONTENT_ID, "imageUrl", "canBeSwap", "surveyId", HealthConstants.FoodInfo.DESCRIPTION, "canBeFavorite", "canTts", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZ)V", "getCanBeCompleted", "()Z", "getCanBeFavorite", "getCanBeSwap", "getCanTts", "getContentId", "()Ljava/lang/String;", "getDescription", "getImageUrl", "getSurveyId", "getTagList", "()Ljava/util/List;", "getTitle", "getType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SurveyScreenUi extends ContentScreenUi {
        public static final int $stable = 8;
        private final boolean canBeCompleted;
        private final boolean canBeFavorite;
        private final boolean canBeSwap;
        private final boolean canTts;
        private final String contentId;
        private final String description;
        private final String imageUrl;
        private final String surveyId;
        private final List<TagUi> tagList;
        private final String title;
        private final String type;

        public /* synthetic */ SurveyScreenUi(String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, String str6, boolean z12, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? ConstantsWs.WELLNESS_TASK_TYPE_SURVEY : str, str2, list, z5, str3, str4, z11, str5, str6, (i11 & 512) != 0 ? false : z12, (i11 & 1024) != 0 ? false : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SurveyScreenUi copy$default(SurveyScreenUi surveyScreenUi, String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, String str6, boolean z12, boolean z13, int i11, Object obj) {
            String str7;
            String str8;
            List<TagUi> list2;
            boolean z14;
            String str9;
            String str10;
            boolean z15;
            String str11;
            String str12;
            boolean z16;
            boolean z17;
            if ((i11 & 1) != 0) {
                str7 = surveyScreenUi.type;
            } else {
                str7 = str;
            }
            if ((i11 & 2) != 0) {
                str8 = surveyScreenUi.title;
            } else {
                str8 = str2;
            }
            if ((i11 & 4) != 0) {
                list2 = surveyScreenUi.tagList;
            } else {
                list2 = list;
            }
            if ((i11 & 8) != 0) {
                z14 = surveyScreenUi.canBeCompleted;
            } else {
                z14 = z5;
            }
            if ((i11 & 16) != 0) {
                str9 = surveyScreenUi.contentId;
            } else {
                str9 = str3;
            }
            if ((i11 & 32) != 0) {
                str10 = surveyScreenUi.imageUrl;
            } else {
                str10 = str4;
            }
            if ((i11 & 64) != 0) {
                z15 = surveyScreenUi.canBeSwap;
            } else {
                z15 = z11;
            }
            if ((i11 & 128) != 0) {
                str11 = surveyScreenUi.surveyId;
            } else {
                str11 = str5;
            }
            if ((i11 & 256) != 0) {
                str12 = surveyScreenUi.description;
            } else {
                str12 = str6;
            }
            if ((i11 & 512) != 0) {
                z16 = surveyScreenUi.canBeFavorite;
            } else {
                z16 = z12;
            }
            if ((i11 & 1024) != 0) {
                z17 = surveyScreenUi.canTts;
            } else {
                z17 = z13;
            }
            return surveyScreenUi.copy(str7, str8, list2, z14, str9, str10, z15, str11, str12, z16, z17);
        }

        public final String component1() {
            return this.type;
        }

        public final boolean component10() {
            return this.canBeFavorite;
        }

        public final boolean component11() {
            return this.canTts;
        }

        public final String component2() {
            return this.title;
        }

        public final List<TagUi> component3() {
            return this.tagList;
        }

        public final boolean component4() {
            return this.canBeCompleted;
        }

        public final String component5() {
            return this.contentId;
        }

        public final String component6() {
            return this.imageUrl;
        }

        public final boolean component7() {
            return this.canBeSwap;
        }

        public final String component8() {
            return this.surveyId;
        }

        public final String component9() {
            return this.description;
        }

        public final SurveyScreenUi copy(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String surveyId, String str, boolean z12, boolean z13) {
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(surveyId, "surveyId");
            return new SurveyScreenUi(type, title, tagList, z5, contentId, imageUrl, z11, surveyId, str, z12, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyScreenUi)) {
                return false;
            }
            SurveyScreenUi surveyScreenUi = (SurveyScreenUi) obj;
            if (u.e(this.type, surveyScreenUi.type) && u.e(this.title, surveyScreenUi.title) && u.e(this.tagList, surveyScreenUi.tagList) && this.canBeCompleted == surveyScreenUi.canBeCompleted && u.e(this.contentId, surveyScreenUi.contentId) && u.e(this.imageUrl, surveyScreenUi.imageUrl) && this.canBeSwap == surveyScreenUi.canBeSwap && u.e(this.surveyId, surveyScreenUi.surveyId) && u.e(this.description, surveyScreenUi.description) && this.canBeFavorite == surveyScreenUi.canBeFavorite && this.canTts == surveyScreenUi.canTts) {
                return true;
            }
            return false;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeCompleted() {
            return this.canBeCompleted;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeFavorite() {
            return this.canBeFavorite;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeSwap() {
            return this.canBeSwap;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanTts() {
            return this.canTts;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getContentId() {
            return this.contentId;
        }

        public final String getDescription() {
            return this.description;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final String getSurveyId() {
            return this.surveyId;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public List<TagUi> getTagList() {
            return this.tagList;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getTitle() {
            return this.title;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int c11 = d.c(this.surveyId, y1.a(this.canBeSwap, d.c(this.imageUrl, d.c(this.contentId, y1.a(this.canBeCompleted, e.b(this.tagList, d.c(this.title, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
            String str = this.description;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Boolean.hashCode(this.canTts) + y1.a(this.canBeFavorite, (c11 + hashCode) * 31, 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.title;
            List<TagUi> list = this.tagList;
            boolean z5 = this.canBeCompleted;
            String str3 = this.contentId;
            String str4 = this.imageUrl;
            boolean z11 = this.canBeSwap;
            String str5 = this.surveyId;
            String str6 = this.description;
            boolean z12 = this.canBeFavorite;
            boolean z13 = this.canTts;
            StringBuilder b10 = l0.b("SurveyScreenUi(type=", str, ", title=", str2, ", tagList=");
            b10.append(list);
            b10.append(", canBeCompleted=");
            b10.append(z5);
            b10.append(", contentId=");
            b.d(b10, str3, ", imageUrl=", str4, ", canBeSwap=");
            b10.append(z11);
            b10.append(", surveyId=");
            b10.append(str5);
            b10.append(", description=");
            b10.append(str6);
            b10.append(", canBeFavorite=");
            b10.append(z12);
            b10.append(", canTts=");
            return h.d(b10, z13, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SurveyScreenUi(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String surveyId, String str, boolean z12, boolean z13) {
            super(null);
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(surveyId, "surveyId");
            this.type = type;
            this.title = title;
            this.tagList = tagList;
            this.canBeCompleted = z5;
            this.contentId = contentId;
            this.imageUrl = imageUrl;
            this.canBeSwap = z11;
            this.surveyId = surveyId;
            this.description = str;
            this.canBeFavorite = z12;
            this.canTts = z13;
        }
    }

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010&\u001a\u00020\n¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0004J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\fJ²\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\n2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0004J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b2\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b3\u0010\u0004R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b5\u0010\tR\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b7\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b8\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b9\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u00106\u001a\u0004\b:\u0010\fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00068\u0006¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b;\u0010\tR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0006¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b<\u0010\tR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b=\u0010\u0004R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b>\u0010\u0004R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b?\u0010\u0004R\u001a\u0010%\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b@\u0010\fR\u001a\u0010&\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\bA\u0010\f¨\u0006D"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$WorkoutScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "", "component1", "()Ljava/lang/String;", "component2", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "component3", "()Ljava/util/List;", "", "component4", "()Z", "component5", "component6", "component7", "Lkk/a;", "component8", "Lcom/withings/healthplus/contentscreens/ui/model/RecommendedEquipmentUi;", "component9", "component10", "component11", "component12", "component13", "component14", "type", "title", "tagList", "canBeCompleted", NavigationArguments.CONTENT_ID, "imageUrl", "canBeSwap", "recommendedDevices", "recommendedEquipments", HealthConstants.FoodInfo.DESCRIPTION, NavigationArguments.VIDEO_URL, "hlsVideoUrl", "canBeFavorite", "canTts", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$WorkoutScreenUi;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getTitle", "Ljava/util/List;", "getTagList", "Z", "getCanBeCompleted", "getContentId", "getImageUrl", "getCanBeSwap", "getRecommendedDevices", "getRecommendedEquipments", "getDescription", "getVideoUrl", "getHlsVideoUrl", "getCanBeFavorite", "getCanTts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class WorkoutScreenUi extends ContentScreenUi {
        public static final int $stable = 8;
        private final boolean canBeCompleted;
        private final boolean canBeFavorite;
        private final boolean canBeSwap;
        private final boolean canTts;
        private final String contentId;
        private final String description;
        private final String hlsVideoUrl;
        private final String imageUrl;
        private final List<a> recommendedDevices;
        private final List<RecommendedEquipmentUi> recommendedEquipments;
        private final List<TagUi> tagList;
        private final String title;
        private final String type;
        private final String videoUrl;

        public /* synthetic */ WorkoutScreenUi(String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, List list2, List list3, String str5, String str6, String str7, boolean z12, boolean z13, int i11, m mVar) {
            this((i11 & 1) != 0 ? ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT : str, str2, list, z5, str3, str4, z11, list2, list3, str5, str6, str7, (i11 & 4096) != 0 ? true : z12, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? false : z13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WorkoutScreenUi copy$default(WorkoutScreenUi workoutScreenUi, String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, List list2, List list3, String str5, String str6, String str7, boolean z12, boolean z13, int i11, Object obj) {
            String str8;
            String str9;
            List<TagUi> list4;
            boolean z14;
            String str10;
            String str11;
            boolean z15;
            List<a> list5;
            List<RecommendedEquipmentUi> list6;
            String str12;
            String str13;
            String str14;
            boolean z16;
            boolean z17;
            if ((i11 & 1) != 0) {
                str8 = workoutScreenUi.type;
            } else {
                str8 = str;
            }
            if ((i11 & 2) != 0) {
                str9 = workoutScreenUi.title;
            } else {
                str9 = str2;
            }
            if ((i11 & 4) != 0) {
                list4 = workoutScreenUi.tagList;
            } else {
                list4 = list;
            }
            if ((i11 & 8) != 0) {
                z14 = workoutScreenUi.canBeCompleted;
            } else {
                z14 = z5;
            }
            if ((i11 & 16) != 0) {
                str10 = workoutScreenUi.contentId;
            } else {
                str10 = str3;
            }
            if ((i11 & 32) != 0) {
                str11 = workoutScreenUi.imageUrl;
            } else {
                str11 = str4;
            }
            if ((i11 & 64) != 0) {
                z15 = workoutScreenUi.canBeSwap;
            } else {
                z15 = z11;
            }
            if ((i11 & 128) != 0) {
                list5 = workoutScreenUi.recommendedDevices;
            } else {
                list5 = list2;
            }
            if ((i11 & 256) != 0) {
                list6 = workoutScreenUi.recommendedEquipments;
            } else {
                list6 = list3;
            }
            if ((i11 & 512) != 0) {
                str12 = workoutScreenUi.description;
            } else {
                str12 = str5;
            }
            if ((i11 & 1024) != 0) {
                str13 = workoutScreenUi.videoUrl;
            } else {
                str13 = str6;
            }
            if ((i11 & ModuleCopy.f28574b) != 0) {
                str14 = workoutScreenUi.hlsVideoUrl;
            } else {
                str14 = str7;
            }
            if ((i11 & 4096) != 0) {
                z16 = workoutScreenUi.canBeFavorite;
            } else {
                z16 = z12;
            }
            if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                z17 = workoutScreenUi.canTts;
            } else {
                z17 = z13;
            }
            return workoutScreenUi.copy(str8, str9, list4, z14, str10, str11, z15, list5, list6, str12, str13, str14, z16, z17);
        }

        public final String component1() {
            return this.type;
        }

        public final String component10() {
            return this.description;
        }

        public final String component11() {
            return this.videoUrl;
        }

        public final String component12() {
            return this.hlsVideoUrl;
        }

        public final boolean component13() {
            return this.canBeFavorite;
        }

        public final boolean component14() {
            return this.canTts;
        }

        public final String component2() {
            return this.title;
        }

        public final List<TagUi> component3() {
            return this.tagList;
        }

        public final boolean component4() {
            return this.canBeCompleted;
        }

        public final String component5() {
            return this.contentId;
        }

        public final String component6() {
            return this.imageUrl;
        }

        public final boolean component7() {
            return this.canBeSwap;
        }

        public final List<a> component8() {
            return this.recommendedDevices;
        }

        public final List<RecommendedEquipmentUi> component9() {
            return this.recommendedEquipments;
        }

        public final WorkoutScreenUi copy(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, List<a> recommendedDevices, List<RecommendedEquipmentUi> recommendedEquipments, String str, String videoUrl, String str2, boolean z12, boolean z13) {
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(recommendedDevices, "recommendedDevices");
            u.j(recommendedEquipments, "recommendedEquipments");
            u.j(videoUrl, "videoUrl");
            return new WorkoutScreenUi(type, title, tagList, z5, contentId, imageUrl, z11, recommendedDevices, recommendedEquipments, str, videoUrl, str2, z12, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkoutScreenUi)) {
                return false;
            }
            WorkoutScreenUi workoutScreenUi = (WorkoutScreenUi) obj;
            if (u.e(this.type, workoutScreenUi.type) && u.e(this.title, workoutScreenUi.title) && u.e(this.tagList, workoutScreenUi.tagList) && this.canBeCompleted == workoutScreenUi.canBeCompleted && u.e(this.contentId, workoutScreenUi.contentId) && u.e(this.imageUrl, workoutScreenUi.imageUrl) && this.canBeSwap == workoutScreenUi.canBeSwap && u.e(this.recommendedDevices, workoutScreenUi.recommendedDevices) && u.e(this.recommendedEquipments, workoutScreenUi.recommendedEquipments) && u.e(this.description, workoutScreenUi.description) && u.e(this.videoUrl, workoutScreenUi.videoUrl) && u.e(this.hlsVideoUrl, workoutScreenUi.hlsVideoUrl) && this.canBeFavorite == workoutScreenUi.canBeFavorite && this.canTts == workoutScreenUi.canTts) {
                return true;
            }
            return false;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeCompleted() {
            return this.canBeCompleted;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeFavorite() {
            return this.canBeFavorite;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeSwap() {
            return this.canBeSwap;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanTts() {
            return this.canTts;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getContentId() {
            return this.contentId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getHlsVideoUrl() {
            return this.hlsVideoUrl;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final List<a> getRecommendedDevices() {
            return this.recommendedDevices;
        }

        public final List<RecommendedEquipmentUi> getRecommendedEquipments() {
            return this.recommendedEquipments;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public List<TagUi> getTagList() {
            return this.tagList;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getTitle() {
            return this.title;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getType() {
            return this.type;
        }

        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            int hashCode;
            int b10 = e.b(this.recommendedEquipments, e.b(this.recommendedDevices, y1.a(this.canBeSwap, d.c(this.imageUrl, d.c(this.contentId, y1.a(this.canBeCompleted, e.b(this.tagList, d.c(this.title, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
            String str = this.description;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int c11 = d.c(this.videoUrl, (b10 + hashCode) * 31, 31);
            String str2 = this.hlsVideoUrl;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return Boolean.hashCode(this.canTts) + y1.a(this.canBeFavorite, (c11 + i11) * 31, 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.title;
            List<TagUi> list = this.tagList;
            boolean z5 = this.canBeCompleted;
            String str3 = this.contentId;
            String str4 = this.imageUrl;
            boolean z11 = this.canBeSwap;
            List<a> list2 = this.recommendedDevices;
            List<RecommendedEquipmentUi> list3 = this.recommendedEquipments;
            String str5 = this.description;
            String str6 = this.videoUrl;
            String str7 = this.hlsVideoUrl;
            boolean z12 = this.canBeFavorite;
            boolean z13 = this.canTts;
            StringBuilder b10 = l0.b("WorkoutScreenUi(type=", str, ", title=", str2, ", tagList=");
            b10.append(list);
            b10.append(", canBeCompleted=");
            b10.append(z5);
            b10.append(", contentId=");
            b.d(b10, str3, ", imageUrl=", str4, ", canBeSwap=");
            b10.append(z11);
            b10.append(", recommendedDevices=");
            b10.append(list2);
            b10.append(", recommendedEquipments=");
            b10.append(list3);
            b10.append(", description=");
            b10.append(str5);
            b10.append(", videoUrl=");
            b.d(b10, str6, ", hlsVideoUrl=", str7, ", canBeFavorite=");
            b10.append(z12);
            b10.append(", canTts=");
            b10.append(z13);
            b10.append(")");
            return b10.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WorkoutScreenUi(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, List<a> recommendedDevices, List<RecommendedEquipmentUi> recommendedEquipments, String str, String videoUrl, String str2, boolean z12, boolean z13) {
            super(null);
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(recommendedDevices, "recommendedDevices");
            u.j(recommendedEquipments, "recommendedEquipments");
            u.j(videoUrl, "videoUrl");
            this.type = type;
            this.title = title;
            this.tagList = tagList;
            this.canBeCompleted = z5;
            this.contentId = contentId;
            this.imageUrl = imageUrl;
            this.canBeSwap = z11;
            this.recommendedDevices = recommendedDevices;
            this.recommendedEquipments = recommendedEquipments;
            this.description = str;
            this.videoUrl = videoUrl;
            this.hlsVideoUrl = str2;
            this.canBeFavorite = z12;
            this.canTts = z13;
        }
    }

    private ContentScreenUi() {
    }

    /* compiled from: ContentScreenUi.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020\n¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\fJ¢\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0002\u0010\"\u001a\u00020\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0004J\u0010\u0010)\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b)\u0010\u0015J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b/\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b0\u0010\u0004R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b2\u0010\tR\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b4\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b5\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b6\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b7\u0010\fR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b8\u0010\u0004R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b9\u0010\tR\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\"\u0010:\u001a\u0004\b;\u0010\u0015R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b<\u0010\u0004R\u001a\u0010$\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b=\u0010\fR\u001a\u0010%\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u00103\u001a\u0004\b>\u0010\fR\u0011\u0010@\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b?\u0010\fR\u0013\u0010D\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$MeasurementScreenUi;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi;", "", "component1", "()Ljava/lang/String;", "component2", "", "Lcom/withings/healthplus/contentscreens/ui/model/TagUi;", "component3", "()Ljava/util/List;", "", "component4", "()Z", "component5", "component6", "component7", "component8", "Lkk/a;", "component9", "", "component10", "()I", "component11", "component12", "component13", "type", "title", "tagList", "canBeCompleted", NavigationArguments.CONTENT_ID, "imageUrl", "canBeSwap", HealthConstants.FoodInfo.DESCRIPTION, "recommendedDevices", "measureType", "manualDeeplink", "canBeFavorite", "canTts", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ILjava/lang/String;ZZ)Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$MeasurementScreenUi;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getTitle", "Ljava/util/List;", "getTagList", "Z", "getCanBeCompleted", "getContentId", "getImageUrl", "getCanBeSwap", "getDescription", "getRecommendedDevices", "I", "getMeasureType", "getManualDeeplink", "getCanBeFavorite", "getCanTts", "getOwnAtLeastOnRecommendedDevice", "ownAtLeastOnRecommendedDevice", "Lkk/a$a;", "getDeviceMedia", "()Lkk/a$a;", "deviceMedia", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ILjava/lang/String;ZZ)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class MeasurementScreenUi extends ContentScreenUi {
        public static final int $stable = 8;
        private final boolean canBeCompleted;
        private final boolean canBeFavorite;
        private final boolean canBeSwap;
        private final boolean canTts;
        private final String contentId;
        private final String description;
        private final String imageUrl;
        private final String manualDeeplink;
        private final int measureType;
        private final List<a> recommendedDevices;
        private final List<TagUi> tagList;
        private final String title;
        private final String type;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ MeasurementScreenUi(java.lang.String r17, java.lang.String r18, java.util.List r19, boolean r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, java.util.List r25, int r26, java.lang.String r27, boolean r28, boolean r29, int r30, kotlin.jvm.internal.m r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 1
                if (r1 == 0) goto La
                java.lang.String r1 = "measurement"
                r3 = r1
                goto Lc
            La:
                r3 = r17
            Lc:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                r2 = 0
                if (r1 == 0) goto L56
                r1 = r25
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r4 = r1 instanceof java.util.Collection
                r5 = 1
                if (r4 == 0) goto L24
                r4 = r1
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L24
                goto L3b
            L24:
                java.util.Iterator r1 = r1.iterator()
            L28:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L3b
                java.lang.Object r4 = r1.next()
                kk.a r4 = (kk.a) r4
                boolean r4 = r4.g()
                if (r4 == 0) goto L28
                r5 = r2
            L3b:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
                r4 = 0
                if (r5 == 0) goto L43
                goto L44
            L43:
                r1 = r4
            L44:
                if (r1 == 0) goto L51
                java.lang.String r1 = "withings-bd2://addMeasure?type="
                java.lang.String r4 = "&goBackToTimeline=false"
                r12 = r26
                java.lang.String r1 = androidx.camera.camera2.internal.o0.a(r1, r12, r4)
                goto L54
            L51:
                r12 = r26
                r1 = r4
            L54:
                r13 = r1
                goto L5a
            L56:
                r12 = r26
                r13 = r27
            L5a:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L60
                r14 = r2
                goto L62
            L60:
                r14 = r28
            L62:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L68
                r15 = r2
                goto L6a
            L68:
                r15 = r29
            L6a:
                r2 = r16
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r8 = r22
                r9 = r23
                r10 = r24
                r11 = r25
                r12 = r26
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.healthplus.contentscreens.ui.model.ContentScreenUi.MeasurementScreenUi.<init>(java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List, int, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.m):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasurementScreenUi copy$default(MeasurementScreenUi measurementScreenUi, String str, String str2, List list, boolean z5, String str3, String str4, boolean z11, String str5, List list2, int i11, String str6, boolean z12, boolean z13, int i12, Object obj) {
            String str7;
            String str8;
            List<TagUi> list3;
            boolean z14;
            String str9;
            String str10;
            boolean z15;
            String str11;
            List<a> list4;
            int i13;
            String str12;
            boolean z16;
            boolean z17;
            if ((i12 & 1) != 0) {
                str7 = measurementScreenUi.type;
            } else {
                str7 = str;
            }
            if ((i12 & 2) != 0) {
                str8 = measurementScreenUi.title;
            } else {
                str8 = str2;
            }
            if ((i12 & 4) != 0) {
                list3 = measurementScreenUi.tagList;
            } else {
                list3 = list;
            }
            if ((i12 & 8) != 0) {
                z14 = measurementScreenUi.canBeCompleted;
            } else {
                z14 = z5;
            }
            if ((i12 & 16) != 0) {
                str9 = measurementScreenUi.contentId;
            } else {
                str9 = str3;
            }
            if ((i12 & 32) != 0) {
                str10 = measurementScreenUi.imageUrl;
            } else {
                str10 = str4;
            }
            if ((i12 & 64) != 0) {
                z15 = measurementScreenUi.canBeSwap;
            } else {
                z15 = z11;
            }
            if ((i12 & 128) != 0) {
                str11 = measurementScreenUi.description;
            } else {
                str11 = str5;
            }
            if ((i12 & 256) != 0) {
                list4 = measurementScreenUi.recommendedDevices;
            } else {
                list4 = list2;
            }
            if ((i12 & 512) != 0) {
                i13 = measurementScreenUi.measureType;
            } else {
                i13 = i11;
            }
            if ((i12 & 1024) != 0) {
                str12 = measurementScreenUi.manualDeeplink;
            } else {
                str12 = str6;
            }
            if ((i12 & ModuleCopy.f28574b) != 0) {
                z16 = measurementScreenUi.canBeFavorite;
            } else {
                z16 = z12;
            }
            if ((i12 & 4096) != 0) {
                z17 = measurementScreenUi.canTts;
            } else {
                z17 = z13;
            }
            return measurementScreenUi.copy(str7, str8, list3, z14, str9, str10, z15, str11, list4, i13, str12, z16, z17);
        }

        public final String component1() {
            return this.type;
        }

        public final int component10() {
            return this.measureType;
        }

        public final String component11() {
            return this.manualDeeplink;
        }

        public final boolean component12() {
            return this.canBeFavorite;
        }

        public final boolean component13() {
            return this.canTts;
        }

        public final String component2() {
            return this.title;
        }

        public final List<TagUi> component3() {
            return this.tagList;
        }

        public final boolean component4() {
            return this.canBeCompleted;
        }

        public final String component5() {
            return this.contentId;
        }

        public final String component6() {
            return this.imageUrl;
        }

        public final boolean component7() {
            return this.canBeSwap;
        }

        public final String component8() {
            return this.description;
        }

        public final List<a> component9() {
            return this.recommendedDevices;
        }

        public final MeasurementScreenUi copy(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String str, List<a> recommendedDevices, int i11, String str2, boolean z12, boolean z13) {
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(recommendedDevices, "recommendedDevices");
            return new MeasurementScreenUi(type, title, tagList, z5, contentId, imageUrl, z11, str, recommendedDevices, i11, str2, z12, z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MeasurementScreenUi)) {
                return false;
            }
            MeasurementScreenUi measurementScreenUi = (MeasurementScreenUi) obj;
            if (u.e(this.type, measurementScreenUi.type) && u.e(this.title, measurementScreenUi.title) && u.e(this.tagList, measurementScreenUi.tagList) && this.canBeCompleted == measurementScreenUi.canBeCompleted && u.e(this.contentId, measurementScreenUi.contentId) && u.e(this.imageUrl, measurementScreenUi.imageUrl) && this.canBeSwap == measurementScreenUi.canBeSwap && u.e(this.description, measurementScreenUi.description) && u.e(this.recommendedDevices, measurementScreenUi.recommendedDevices) && this.measureType == measurementScreenUi.measureType && u.e(this.manualDeeplink, measurementScreenUi.manualDeeplink) && this.canBeFavorite == measurementScreenUi.canBeFavorite && this.canTts == measurementScreenUi.canTts) {
                return true;
            }
            return false;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeCompleted() {
            return this.canBeCompleted;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeFavorite() {
            return this.canBeFavorite;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanBeSwap() {
            return this.canBeSwap;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public boolean getCanTts() {
            return this.canTts;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getContentId() {
            return this.contentId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final a.C1182a getDeviceMedia() {
            Object obj;
            Iterator<T> it = this.recommendedDevices.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((a) obj).e() != null && getOwnAtLeastOnRecommendedDevice()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar == null) {
                return null;
            }
            return aVar.e();
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getImageUrl() {
            return this.imageUrl;
        }

        public final String getManualDeeplink() {
            return this.manualDeeplink;
        }

        public final int getMeasureType() {
            return this.measureType;
        }

        public final boolean getOwnAtLeastOnRecommendedDevice() {
            List<a> list = this.recommendedDevices;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (a aVar : list) {
                if (aVar.g()) {
                    return true;
                }
            }
            return false;
        }

        public final List<a> getRecommendedDevices() {
            return this.recommendedDevices;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public List<TagUi> getTagList() {
            return this.tagList;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getTitle() {
            return this.title;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentScreenUi
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            int a11 = y1.a(this.canBeSwap, d.c(this.imageUrl, d.c(this.contentId, y1.a(this.canBeCompleted, e.b(this.tagList, d.c(this.title, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31);
            String str = this.description;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int a12 = h.a(this.measureType, e.b(this.recommendedDevices, (a11 + hashCode) * 31, 31), 31);
            String str2 = this.manualDeeplink;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return Boolean.hashCode(this.canTts) + y1.a(this.canBeFavorite, (a12 + i11) * 31, 31);
        }

        public String toString() {
            String str = this.type;
            String str2 = this.title;
            List<TagUi> list = this.tagList;
            boolean z5 = this.canBeCompleted;
            String str3 = this.contentId;
            String str4 = this.imageUrl;
            boolean z11 = this.canBeSwap;
            String str5 = this.description;
            List<a> list2 = this.recommendedDevices;
            int i11 = this.measureType;
            String str6 = this.manualDeeplink;
            boolean z12 = this.canBeFavorite;
            boolean z13 = this.canTts;
            StringBuilder b10 = l0.b("MeasurementScreenUi(type=", str, ", title=", str2, ", tagList=");
            b10.append(list);
            b10.append(", canBeCompleted=");
            b10.append(z5);
            b10.append(", contentId=");
            b.d(b10, str3, ", imageUrl=", str4, ", canBeSwap=");
            b10.append(z11);
            b10.append(", description=");
            b10.append(str5);
            b10.append(", recommendedDevices=");
            b10.append(list2);
            b10.append(", measureType=");
            b10.append(i11);
            b10.append(", manualDeeplink=");
            b10.append(str6);
            b10.append(", canBeFavorite=");
            b10.append(z12);
            b10.append(", canTts=");
            return h.d(b10, z13, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MeasurementScreenUi(String type, String title, List<TagUi> tagList, boolean z5, String contentId, String imageUrl, boolean z11, String str, List<a> recommendedDevices, int i11, String str2, boolean z12, boolean z13) {
            super(null);
            u.j(type, "type");
            u.j(title, "title");
            u.j(tagList, "tagList");
            u.j(contentId, "contentId");
            u.j(imageUrl, "imageUrl");
            u.j(recommendedDevices, "recommendedDevices");
            this.type = type;
            this.title = title;
            this.tagList = tagList;
            this.canBeCompleted = z5;
            this.contentId = contentId;
            this.imageUrl = imageUrl;
            this.canBeSwap = z11;
            this.description = str;
            this.recommendedDevices = recommendedDevices;
            this.measureType = i11;
            this.manualDeeplink = str2;
            this.canBeFavorite = z12;
            this.canTts = z13;
        }
    }
}
