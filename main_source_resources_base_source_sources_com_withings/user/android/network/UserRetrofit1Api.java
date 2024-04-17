package com.withings.user.android.network;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.user.core.models.WsImages;
import com.withings.user.core.models.WsUserDeletion;
import com.withings.user.core.models.WsUserList;
import com.withings.webservices.legacy.common.exception.CreateUserUnauthorizedException;
import com.withings.webservices.legacy.common.exception.EmailExistsException;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import kotlin.Metadata;
import org.jivesoftware.smack.packet.Session;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;
import retrofit.mime.TypedString;
/* compiled from: UserRetrofit1Api.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ£\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00012\b\b\u0001\u0010\u0019\u001a\u00020\t2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u008b\u0001\u0010\u001f\u001a\u00020\u00012\b\b\u0001\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0019\u001a\u00020\tH'¢\u0006\u0004\b\"\u0010#J?\u0010*\u001a\u00020)2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010$H'¢\u0006\u0004\b*\u0010+¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/withings/user/android/network/UserRetrofit1Api;", "", "", "mask", "", "sessionId", "Lcom/withings/user/core/models/WsUserList;", "getAccountUsers", "(ILjava/lang/String;)Lcom/withings/user/core/models/WsUserList;", "", "parentAccountId", "publicKey", "type", "birthDate", "firstName", "lastName", "shortName", "gender", "advancedGender", "pronoun", "fatMethod", "measures", "measuresGroupId", "createUser", "(JLjava/lang/String;Ljava/lang/Integer;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;)Lcom/withings/user/core/models/WsUserList;", NavigationArguments.USER_ID, "email", "updateUserEmail", "(JLjava/lang/String;)Ljava/lang/Object;", "bodyModel", "userData", "updateUser", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)Ljava/lang/Object;", "Lcom/withings/user/core/models/WsUserDeletion;", "requestUserDeletion", "(J)Lcom/withings/user/core/models/WsUserDeletion;", "Lretrofit/mime/TypedString;", AMPExtension.Action.ATTRIBUTE_NAME, "Lretrofit/mime/TypedFile;", "picture", Session.ELEMENT, "Lcom/withings/user/core/models/WsImages;", "uploadPicture", "(Lretrofit/mime/TypedString;Lretrofit/mime/TypedFile;Lretrofit/mime/TypedString;Lretrofit/mime/TypedString;)Lcom/withings/user/core/models/WsImages;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface UserRetrofit1Api {
    @POST("/scale?action=createuser")
    @FormUrlEncoded
    WsUserList createUser(@Field("parentaccountid") long j5, @Field("publickey") String str, @Field("usertype") Integer num, @Field("birthdate") long j11, @Field("firstname") String str2, @Field("lastname") String str3, @Field("shortname") String str4, @Field("gender") int i11, @Field("advanced_gender") String str5, @Field("pronouns") String str6, @Field("fatmethod") int i12, @Field("measures") String str7, @Field("measgrpid") Long l5) throws CreateUserUnauthorizedException;

    @POST("/account?action=getuserslist")
    @FormUrlEncoded
    WsUserList getAccountUsers(@Field("listmask") int i11, @Field("sessionid") String str);

    @POST("/v2/user?action=requestdeletion")
    @FormUrlEncoded
    WsUserDeletion requestUserDeletion(@Field("userid") long j5);

    @POST("/user?action=update")
    @FormUrlEncoded
    Object updateUser(@Field("userid") long j5, @Field("birthdate") long j11, @Field("firstname") String str, @Field("lastname") String str2, @Field("shortname") String str3, @Field("gender") int i11, @Field("advanced_gender") String str4, @Field("pronouns") String str5, @Field("fatmethod") int i12, @Field("bodymodel") Integer num, @Field("data") String str6) throws UnauthorizedException;

    @POST("/v2/user?action=update")
    @FormUrlEncoded
    Object updateUserEmail(@Field("userid") long j5, @Field("email") String str) throws EmailExistsException;

    @POST("/v2/picture?action=upload")
    @Multipart
    WsImages uploadPicture(@Part("action") TypedString typedString, @Part("picture") TypedFile typedFile, @Part("sessionid") TypedString typedString2, @Part("userid") TypedString typedString3);
}
