package com.withings.insight.core.model;

import androidx.appcompat.widget.v0;
import androidx.camera.camera2.internal.l0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.insight.android.entity.UserResponseTypeHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: InputMetadata.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JÃ\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001c¨\u0006:"}, d2 = {"Lcom/withings/insight/core/model/InputMetadata;", "", "keyboard", "", "control", DynamicLink.Builder.KEY_SUFFIX, "mode", "defaultAction", "buttonTitle", "onTapActionsWithConditions", "", "Lcom/withings/insight/core/model/Action;", "placeholder", "onFailureActions", XHTMLText.STYLE, UserResponseTypeHandler.TYPE_SUGGESTION, "Lcom/withings/insight/core/model/Suggestion;", "pickerMin", "pickerMax", "pickerStep", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonTitle", "()Ljava/lang/String;", "getControl", "getDefaultAction", "getKeyboard", "getMode", "getOnFailureActions", "()Ljava/util/List;", "getOnTapActionsWithConditions", "getPickerMax", "getPickerMin", "getPickerStep", "getPlaceholder", "getStyle", "getSuffix", "getSuggestions", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputMetadata {
    @SerializedName("button_title")
    private final String buttonTitle;
    private final String control;
    @SerializedName("default_action")
    private final String defaultAction;
    private final String keyboard;
    private final String mode;
    @SerializedName("onFailureActions")
    private final List<Action> onFailureActions;
    @SerializedName("actions")
    private final List<Action> onTapActionsWithConditions;
    @SerializedName(HealthConstants.HeartRate.MAX)
    private final String pickerMax;
    @SerializedName(HealthConstants.HeartRate.MIN)
    private final String pickerMin;
    @SerializedName("step")
    private final String pickerStep;
    private final String placeholder;
    private final String style;
    private final String suffix;
    private final List<Suggestion> suggestions;

    public InputMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputMetadata copy$default(InputMetadata inputMetadata, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, List list2, String str8, List list3, String str9, String str10, String str11, int i11, Object obj) {
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        List<Action> list4;
        String str18;
        List<Action> list5;
        String str19;
        List<Suggestion> list6;
        String str20;
        String str21;
        String str22;
        if ((i11 & 1) != 0) {
            str12 = inputMetadata.keyboard;
        } else {
            str12 = str;
        }
        if ((i11 & 2) != 0) {
            str13 = inputMetadata.control;
        } else {
            str13 = str2;
        }
        if ((i11 & 4) != 0) {
            str14 = inputMetadata.suffix;
        } else {
            str14 = str3;
        }
        if ((i11 & 8) != 0) {
            str15 = inputMetadata.mode;
        } else {
            str15 = str4;
        }
        if ((i11 & 16) != 0) {
            str16 = inputMetadata.defaultAction;
        } else {
            str16 = str5;
        }
        if ((i11 & 32) != 0) {
            str17 = inputMetadata.buttonTitle;
        } else {
            str17 = str6;
        }
        if ((i11 & 64) != 0) {
            list4 = inputMetadata.onTapActionsWithConditions;
        } else {
            list4 = list;
        }
        if ((i11 & 128) != 0) {
            str18 = inputMetadata.placeholder;
        } else {
            str18 = str7;
        }
        if ((i11 & 256) != 0) {
            list5 = inputMetadata.onFailureActions;
        } else {
            list5 = list2;
        }
        if ((i11 & 512) != 0) {
            str19 = inputMetadata.style;
        } else {
            str19 = str8;
        }
        if ((i11 & 1024) != 0) {
            list6 = inputMetadata.suggestions;
        } else {
            list6 = list3;
        }
        if ((i11 & ModuleCopy.f28574b) != 0) {
            str20 = inputMetadata.pickerMin;
        } else {
            str20 = str9;
        }
        if ((i11 & 4096) != 0) {
            str21 = inputMetadata.pickerMax;
        } else {
            str21 = str10;
        }
        if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str22 = inputMetadata.pickerStep;
        } else {
            str22 = str11;
        }
        return inputMetadata.copy(str12, str13, str14, str15, str16, str17, list4, str18, list5, str19, list6, str20, str21, str22);
    }

    public final String component1() {
        return this.keyboard;
    }

    public final String component10() {
        return this.style;
    }

    public final List<Suggestion> component11() {
        return this.suggestions;
    }

    public final String component12() {
        return this.pickerMin;
    }

    public final String component13() {
        return this.pickerMax;
    }

    public final String component14() {
        return this.pickerStep;
    }

    public final String component2() {
        return this.control;
    }

    public final String component3() {
        return this.suffix;
    }

    public final String component4() {
        return this.mode;
    }

    public final String component5() {
        return this.defaultAction;
    }

    public final String component6() {
        return this.buttonTitle;
    }

    public final List<Action> component7() {
        return this.onTapActionsWithConditions;
    }

    public final String component8() {
        return this.placeholder;
    }

    public final List<Action> component9() {
        return this.onFailureActions;
    }

    public final InputMetadata copy(String str, String str2, String str3, String str4, String str5, String str6, List<Action> list, String str7, List<Action> list2, String str8, List<Suggestion> list3, String str9, String str10, String str11) {
        return new InputMetadata(str, str2, str3, str4, str5, str6, list, str7, list2, str8, list3, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputMetadata)) {
            return false;
        }
        InputMetadata inputMetadata = (InputMetadata) obj;
        if (u.e(this.keyboard, inputMetadata.keyboard) && u.e(this.control, inputMetadata.control) && u.e(this.suffix, inputMetadata.suffix) && u.e(this.mode, inputMetadata.mode) && u.e(this.defaultAction, inputMetadata.defaultAction) && u.e(this.buttonTitle, inputMetadata.buttonTitle) && u.e(this.onTapActionsWithConditions, inputMetadata.onTapActionsWithConditions) && u.e(this.placeholder, inputMetadata.placeholder) && u.e(this.onFailureActions, inputMetadata.onFailureActions) && u.e(this.style, inputMetadata.style) && u.e(this.suggestions, inputMetadata.suggestions) && u.e(this.pickerMin, inputMetadata.pickerMin) && u.e(this.pickerMax, inputMetadata.pickerMax) && u.e(this.pickerStep, inputMetadata.pickerStep)) {
            return true;
        }
        return false;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getControl() {
        return this.control;
    }

    public final String getDefaultAction() {
        return this.defaultAction;
    }

    public final String getKeyboard() {
        return this.keyboard;
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<Action> getOnFailureActions() {
        return this.onFailureActions;
    }

    public final List<Action> getOnTapActionsWithConditions() {
        return this.onTapActionsWithConditions;
    }

    public final String getPickerMax() {
        return this.pickerMax;
    }

    public final String getPickerMin() {
        return this.pickerMin;
    }

    public final String getPickerStep() {
        return this.pickerStep;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
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
        int hashCode12;
        int hashCode13;
        String str = this.keyboard;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this.control;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.suffix;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str4 = this.mode;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str5 = this.defaultAction;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str6 = this.buttonTitle;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        List<Action> list = this.onTapActionsWithConditions;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        String str7 = this.placeholder;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        List<Action> list2 = this.onFailureActions;
        if (list2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list2.hashCode();
        }
        int i21 = (i19 + hashCode9) * 31;
        String str8 = this.style;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        List<Suggestion> list3 = this.suggestions;
        if (list3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list3.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        String str9 = this.pickerMin;
        if (str9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str9.hashCode();
        }
        int i24 = (i23 + hashCode12) * 31;
        String str10 = this.pickerMax;
        if (str10 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str10.hashCode();
        }
        int i25 = (i24 + hashCode13) * 31;
        String str11 = this.pickerStep;
        if (str11 != null) {
            i11 = str11.hashCode();
        }
        return i25 + i11;
    }

    public String toString() {
        String str = this.keyboard;
        String str2 = this.control;
        String str3 = this.suffix;
        String str4 = this.mode;
        String str5 = this.defaultAction;
        String str6 = this.buttonTitle;
        List<Action> list = this.onTapActionsWithConditions;
        String str7 = this.placeholder;
        List<Action> list2 = this.onFailureActions;
        String str8 = this.style;
        List<Suggestion> list3 = this.suggestions;
        String str9 = this.pickerMin;
        String str10 = this.pickerMax;
        String str11 = this.pickerStep;
        StringBuilder b10 = l0.b("InputMetadata(keyboard=", str, ", control=", str2, ", suffix=");
        b.d(b10, str3, ", mode=", str4, ", defaultAction=");
        b.d(b10, str5, ", buttonTitle=", str6, ", onTapActionsWithConditions=");
        b10.append(list);
        b10.append(", placeholder=");
        b10.append(str7);
        b10.append(", onFailureActions=");
        b10.append(list2);
        b10.append(", style=");
        b10.append(str8);
        b10.append(", suggestions=");
        b10.append(list3);
        b10.append(", pickerMin=");
        b10.append(str9);
        b10.append(", pickerMax=");
        return v0.d(b10, str10, ", pickerStep=", str11, ")");
    }

    public InputMetadata(String str, String str2, String str3, String str4, String str5, String str6, List<Action> list, String str7, List<Action> list2, String str8, List<Suggestion> list3, String str9, String str10, String str11) {
        this.keyboard = str;
        this.control = str2;
        this.suffix = str3;
        this.mode = str4;
        this.defaultAction = str5;
        this.buttonTitle = str6;
        this.onTapActionsWithConditions = list;
        this.placeholder = str7;
        this.onFailureActions = list2;
        this.style = str8;
        this.suggestions = list3;
        this.pickerMin = str9;
        this.pickerMax = str10;
        this.pickerStep = str11;
    }

    public /* synthetic */ InputMetadata(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, List list2, String str8, List list3, String str9, String str10, String str11, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : list2, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : list3, (i11 & ModuleCopy.f28574b) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 ? str11 : null);
    }
}
