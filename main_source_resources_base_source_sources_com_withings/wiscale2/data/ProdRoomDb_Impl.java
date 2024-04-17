package com.withings.wiscale2.data;

import android.content.Context;
import androidx.camera.camera2.internal.k0;
import androidx.camera.camera2.internal.l0;
import androidx.room.RoomDatabase;
import androidx.room.c0;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.clinicalstudy.repository.PatientSessionDao;
import com.withings.clinicalstudy.repository.PatientSessionDao_ProdRoomDb_Impl;
import com.withings.ecg.model.HeartSignalDao;
import com.withings.ecg.model.HeartSignalDao_ProdRoomDb_Impl;
import com.withings.factor.local.dao.FactorDao;
import com.withings.factor.local.dao.FactorDao_ProdRoomDb_Impl;
import com.withings.features.platform.model.PlatformFeatureDao;
import com.withings.features.platform.model.PlatformFeatureDao_ProdRoomDb_Impl;
import com.withings.features.platform.model.PlatformTagDao;
import com.withings.features.platform.model.PlatformTagDao_ProdRoomDb_Impl;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.leaderboard.repositories.data.LeaderboardDAO;
import com.withings.leaderboard.repositories.data.LeaderboardDAO_ProdRoomDb_Impl;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.repository.data.db.RoomGpsLocationDao;
import com.withings.location.repository.data.db.RoomGpsLocationDao_ProdRoomDb_Impl;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.note.model.NoteGroupDao;
import com.withings.note.model.NoteGroupDao_ProdRoomDb_Impl;
import com.withings.prediction.local.dao.PredictionDao;
import com.withings.prediction.local.dao.PredictionDao_ProdRoomDb_Impl;
import com.withings.screen.repository.data.db.DeviceScreenContentDao;
import com.withings.screen.repository.data.db.DeviceScreenContentDao_ProdRoomDb_Impl;
import com.withings.screen.repository.data.db.DeviceScreenDao;
import com.withings.screen.repository.data.db.DeviceScreenDao_ProdRoomDb_Impl;
import com.withings.screen.repository.data.db.DeviceScreensGroupDao;
import com.withings.screen.repository.data.db.DeviceScreensGroupDao_ProdRoomDb_Impl;
import com.withings.target.data.TargetDAO;
import com.withings.target.data.TargetDAO_ProdRoomDb_Impl;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.withings.model.timeline.ConversationItemData;
import com.withings.wiscale2.food.model.MealDao;
import com.withings.wiscale2.food.model.MealDao_ProdRoomDb_Impl;
import com.withings.wiscale2.food.model.MealNameDao;
import com.withings.wiscale2.food.model.MealNameDao_ProdRoomDb_Impl;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lj0.m0;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.sm.packet.StreamManagement;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import x8.c;
import z8.c;
/* loaded from: classes4.dex */
public final class ProdRoomDb_Impl extends ProdRoomDb {
    private volatile HeartSignalDao_ProdRoomDb_Impl D;
    private volatile yb0.b E;
    private volatile RoomGpsLocationDao_ProdRoomDb_Impl F;
    private volatile mx.b G;
    private volatile yf.h H;
    private volatile fw.d I;
    private volatile LeaderboardDAO_ProdRoomDb_Impl J;
    private volatile MealDao_ProdRoomDb_Impl K;
    private volatile MealNameDao_ProdRoomDb_Impl L;
    private volatile nx.c M;
    private volatile lx.b N;
    private volatile NoteGroupDao_ProdRoomDb_Impl O;
    private volatile u10.y P;
    private volatile PatientSessionDao_ProdRoomDb_Impl Q;
    private volatile PlatformFeatureDao_ProdRoomDb_Impl R;
    private volatile ei0.n S;
    private volatile TargetDAO_ProdRoomDb_Impl T;
    private volatile bj0.g U;
    private volatile m0 V;
    private volatile a30.r W;
    private volatile DeviceScreenDao_ProdRoomDb_Impl X;
    private volatile DeviceScreenContentDao_ProdRoomDb_Impl Y;
    private volatile DeviceScreensGroupDao_ProdRoomDb_Impl Z;

    /* renamed from: a0  reason: collision with root package name */
    private volatile tz.b f50626a0;

    /* renamed from: b0  reason: collision with root package name */
    private volatile a30.h f50627b0;

    /* renamed from: c0  reason: collision with root package name */
    private volatile mr.b f50628c0;

    /* renamed from: d0  reason: collision with root package name */
    private volatile pl.b f50629d0;

    /* renamed from: e0  reason: collision with root package name */
    private volatile f60.b f50630e0;

    /* renamed from: f0  reason: collision with root package name */
    private volatile com.withings.device.details.automatic.activity.detection.c f50631f0;

    /* renamed from: g0  reason: collision with root package name */
    private volatile gt.b f50632g0;

    /* renamed from: h0  reason: collision with root package name */
    private volatile bv.c f50633h0;

    /* renamed from: i0  reason: collision with root package name */
    private volatile a30.k f50634i0;

    /* renamed from: j0  reason: collision with root package name */
    private volatile a30.n f50635j0;

    /* renamed from: k0  reason: collision with root package name */
    private volatile a30.p f50636k0;

    /* renamed from: l0  reason: collision with root package name */
    private volatile a30.b f50637l0;

    /* renamed from: m0  reason: collision with root package name */
    private volatile a30.e f50638m0;

    /* renamed from: n0  reason: collision with root package name */
    private volatile i20.b f50639n0;

    /* renamed from: o0  reason: collision with root package name */
    private volatile PredictionDao_ProdRoomDb_Impl f50640o0;

    /* renamed from: p0  reason: collision with root package name */
    private volatile fw.b f50641p0;

    /* renamed from: q0  reason: collision with root package name */
    private volatile FactorDao_ProdRoomDb_Impl f50642q0;

    /* loaded from: classes4.dex */
    final class a extends c0.a {
        a() {
            super(109);
        }

        @Override // androidx.room.c0.a
        public final void a(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `DeviceScreen` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wsId` INTEGER NOT NULL, `name` TEXT NOT NULL, `deviceId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `screenSource` INTEGER NOT NULL, `images` TEXT, `embeddedId` INTEGER, `displayOrder` INTEGER NOT NULL, `active` INTEGER NOT NULL, `deactivableStatus` INTEGER, `parentId` INTEGER, `displayContext` TEXT NOT NULL, `syncedWithWS` INTEGER NOT NULL, `syncedWithDevice` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `startDate` INTEGER, `endDate` INTEGER, `appDependencies` TEXT NOT NULL, `defaultActive` INTEGER, `defaultRank` INTEGER, `group` INTEGER, `requiredFeatureIds` TEXT, `fixedPosition` INTEGER, `imageType` INTEGER, `imageData` TEXT, `imageHeight` INTEGER, `imageWidth` INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_DeviceScreen_wsId_embeddedId_deviceId_userId` ON `DeviceScreen` (`wsId`, `embeddedId`, `deviceId`, `userId`)", "CREATE TABLE IF NOT EXISTS `DeviceScreenContent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `deviceId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `screenWsId` INTEGER NOT NULL, `displayStyle` INTEGER NOT NULL, `message` TEXT NOT NULL, `startDate` INTEGER, `endDate` INTEGER, `modified` INTEGER NOT NULL, `syncedWithDevice` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `Event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `type` TEXT NOT NULL, `epoch` INTEGER NOT NULL, `data` TEXT NOT NULL, `userId` INTEGER, `deviceId` INTEGER NOT NULL)");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `WorkoutLocation` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `userId` INTEGER NOT NULL, `date` INTEGER NOT NULL, `speed` REAL NOT NULL, `horizontalAccuracy` REAL NOT NULL, `altitude` REAL NOT NULL, `verticalAccuracy` REAL NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `speedAccuracy` REAL NOT NULL DEFAULT 0, `course` REAL NOT NULL DEFAULT 0, `courseAccuracy` REAL NOT NULL DEFAULT 0, `synced` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_WorkoutLocation_userId_date` ON `WorkoutLocation` (`userId`, `date`)", "CREATE TABLE IF NOT EXISTS `EcgMeasurement` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userID` INTEGER NOT NULL, `deviceModel` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `synced` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `deviceId` INTEGER, `trackerWearPos` INTEGER, `deleted` INTEGER NOT NULL, `measures` TEXT NOT NULL, `firmwareVersion` INTEGER, `brand` INTEGER, `signalId` INTEGER, `signalPath` TEXT NOT NULL, `timeWindow` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `totalSize` INTEGER NOT NULL, `offset` INTEGER NOT NULL, `gain` INTEGER NOT NULL, `qfix` INTEGER NOT NULL, `type` INTEGER NOT NULL, `samplingFreq` INTEGER NOT NULL, `channel` INTEGER NOT NULL, `format` INTEGER NOT NULL, `size` INTEGER NOT NULL, `resolution` INTEGER NOT NULL, `filterBank` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_EcgMeasurement_userID_timestamp` ON `EcgMeasurement` (`userID`, `timestamp`)");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `HealthmateSessionData` (`accountId` INTEGER NOT NULL, `sessionId` TEXT NOT NULL, `providerToken` TEXT NOT NULL, `authToken` TEXT NOT NULL, `isSecured` INTEGER NOT NULL, `requireSecure` INTEGER NOT NULL, `expirationTimestamp` INTEGER NOT NULL, `providerType` TEXT NOT NULL, `serverUrl` TEXT NOT NULL, `inappviewUrl` TEXT NOT NULL, `maintUrl` TEXT NOT NULL, `accountUrl` TEXT NOT NULL, `cookieDomain` TEXT NOT NULL, `cookieName` TEXT NOT NULL, `sessionType` TEXT NOT NULL, PRIMARY KEY(`accountId`))", "CREATE TABLE IF NOT EXISTS `Insight` (`crmId` TEXT NOT NULL, `conversationId` INTEGER, `insightId` INTEGER, `userId` INTEGER NOT NULL, `format` TEXT, `emotion` TEXT, `bgcolor` TEXT, `category` TEXT NOT NULL, `day` INTEGER, `archivable` INTEGER, `scenario` TEXT, `synced` INTEGER NOT NULL, `context` TEXT, `variables` TEXT, `read` INTEGER NOT NULL, `opened` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `created` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `conditions` TEXT, `priority` INTEGER, `expirationDate` INTEGER, `version` REAL, `title` TEXT, `subtitle` TEXT, `buttonText` TEXT, `buttonUrl` TEXT, `conversation` TEXT, PRIMARY KEY(`insightId`))", "CREATE TABLE IF NOT EXISTS `leaderboard` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `date` TEXT NOT NULL, `userid` INTEGER NOT NULL, `score` INTEGER NOT NULL, `firstname` TEXT NOT NULL, `lastName` TEXT NOT NULL, `imageUrl` TEXT, `modified` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_leaderboard_date` ON `leaderboard` (`date`)");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `Meal` (`id` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `date` TEXT, `brand` INTEGER NOT NULL, `calorieGoal` INTEGER NOT NULL, `measureCount` INTEGER NOT NULL, `mealNameId` INTEGER NOT NULL, `mealNameRank` INTEGER NOT NULL, `calories` REAL, `sodium` REAL, `potassium` REAL, `carbs` REAL, `vitaminA` REAL, `vitaminC` REAL, `calcium` REAL, `iron` REAL, `fat` REAL, `saturatedFat` REAL, `polyunsaturedFat` REAL, `monounsaturatedFat` REAL, `transFat` REAL, `cholesterol` REAL, `fiber` REAL, `sugars` REAL, `protein` REAL, `createdDate` INTEGER, `modifiedDate` INTEGER, `enrich` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `MealName` (`id` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `name` TEXT, `createdDate` INTEGER, `modifiedDate` INTEGER, `brand` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `Mood` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `user_id` INTEGER NOT NULL, `subjected_id` INTEGER, `mood_level` INTEGER NOT NULL, `date` INTEGER NOT NULL, `is_deleted` INTEGER NOT NULL, `is_day_log` INTEGER NOT NULL DEFAULT true)", "CREATE TABLE IF NOT EXISTS `PartnerExchangeLastUpdate` (`partnerConsumerId` INTEGER NOT NULL, `measureType` INTEGER NOT NULL, `exchangeType` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `changeToken` TEXT, PRIMARY KEY(`partnerConsumerId`, `measureType`, `exchangeType`))");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `PlatformFeature` (`featureId` INTEGER NOT NULL, `name` TEXT, `owners` TEXT NOT NULL, `synced` INTEGER NOT NULL, PRIMARY KEY(`featureId`))", "CREATE TABLE IF NOT EXISTS `HealthAttributes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `web_service_id` INTEGER, `user_id` INTEGER, `type` INTEGER NOT NULL, `name` TEXT, `key_name` TEXT, `key_description` TEXT, `default_description` TEXT, `server_modification` INTEGER, `deleted` INTEGER NOT NULL, `min_age` INTEGER, `max_age` INTEGER, `category` TEXT DEFAULT NULL, `subcategory` TEXT DEFAULT NULL, `asset` TEXT DEFAULT NULL)", "CREATE TABLE IF NOT EXISTS `NoteEntity` (`noteId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `noteWsId` INTEGER, `noteGroupId` INTEGER, `localNoteGroupId` INTEGER, `noteDeleted` INTEGER NOT NULL, `type` INTEGER NOT NULL, `text` TEXT, `noteHealthAttributeId` INTEGER, `noteHealthAttributeLocalId` INTEGER, `signalId` INTEGER, `modified` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `NoteGroup` (`noteGroupId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `wsId` INTEGER, `userId` INTEGER, `remoteMeasureGroupId` INTEGER NOT NULL, `localMeasureGroupId` INTEGER, `localEcgId` INTEGER, `cryptpart` TEXT, `date` INTEGER NOT NULL, `serverCreatedDate` INTEGER, `serverModifiedDate` INTEGER, `localModifiedDate` INTEGER, `noSymptom` INTEGER NOT NULL, `signalId` INTEGER, `deleted` INTEGER NOT NULL, `synced` INTEGER NOT NULL)");
            androidx.work.impl.g.c(cVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_NoteGroup_signalId` ON `NoteGroup` (`signalId`)", "CREATE TABLE IF NOT EXISTS `Tag` (`ownerId` INTEGER NOT NULL, `ownerType` TEXT NOT NULL, `tags` TEXT NOT NULL, PRIMARY KEY(`ownerId`, `ownerType`))", "CREATE TABLE IF NOT EXISTS `Target` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `measureType` INTEGER NOT NULL, `range` INTEGER NOT NULL, `mantissa` INTEGER NOT NULL, `exponent` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, `deactivated` INTEGER, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `date` INTEGER NOT NULL, `isSyncedWithApi` INTEGER NOT NULL, `attrib` INTEGER)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_isActive` ON `Target` (`userId`, `isActive`)");
            androidx.work.impl.g.c(cVar, "CREATE INDEX IF NOT EXISTS `index_Target_userId_isSyncedWithApi` ON `Target` (`userId`, `isSyncedWithApi`)", "CREATE INDEX IF NOT EXISTS `index_Target_userId_type_measureType` ON `Target` (`userId`, `type`, `measureType`)", "CREATE TABLE IF NOT EXISTS `Track` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER, `userId` INTEGER NOT NULL, `startDate` INTEGER NOT NULL, `endDate` INTEGER NOT NULL, `timeZone` TEXT, `day` TEXT NOT NULL, `modifiedDate` INTEGER NOT NULL, `deviceId` INTEGER, `deviceModel` INTEGER NOT NULL, `deviceType` INTEGER NOT NULL, `attrib` INTEGER NOT NULL, `category` INTEGER NOT NULL, `dataJson` TEXT, `activityRecognitionVersion` INTEGER, `isSyncedToWs` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `deletionReason` INTEGER, `note` TEXT, `snoringEnabled` INTEGER NOT NULL, `inProgress` INTEGER NOT NULL, `manualStartDate` INTEGER, `manualEndDate` INTEGER, `blankVasistasFilled` INTEGER NOT NULL, `pathlists` TEXT, `cryptpart` TEXT, `coverPictureUrl` TEXT, `uris` TEXT, `coverPictureUri` TEXT, `brand` INTEGER NOT NULL, `sleepScoreValue` INTEGER, `sleepScoreStatus` INTEGER, `sleepScoreAlgoVersion` INTEGER, `duration_info_score` INTEGER, `duration_info_status` INTEGER, `recovery_info_score` INTEGER, `recovery_info_status` INTEGER, `interruptions_info_score` INTEGER, `interruptions_info_status` INTEGER, `timeToFallAsleep_info_score` INTEGER, `timeToFallAsleep_info_status` INTEGER, `timeToWakeUp_info_score` INTEGER, `timeToWakeUp_info_status` INTEGER, `regularity_info_score` INTEGER, `regularity_info_status` INTEGER, `snoring_info_score` INTEGER, `snoring_info_status` INTEGER, `night_heartrate_info_score` INTEGER, `night_heartrate_info_status` INTEGER, `distance` REAL, `averageSpeed` REAL, `minSpeed` REAL, `maxSpeed` REAL, `startLatitude` REAL, `startLongitude` REAL, `endLatitude` REAL, `endLongitude` REAL, `centerLatitude` REAL, `centerLongitude` REAL, `spanLatitudeDelta` REAL, `spanLongitudeDelta` REAL)", "CREATE INDEX IF NOT EXISTS `index_Track_userId_day_category_startDate_deleted` ON `Track` (`userId`, `day`, `category`, `startDate`, `deleted`)");
            androidx.work.impl.g.c(cVar, "CREATE INDEX IF NOT EXISTS `index_Track_userId_deviceType_startDate` ON `Track` (`userId`, `deviceType`, `startDate`)", "CREATE INDEX IF NOT EXISTS `index_Track_userId_isSyncedToWs` ON `Track` (`userId`, `isSyncedToWs`)", "CREATE INDEX IF NOT EXISTS `index_Track_userId_modifiedDate` ON `Track` (`userId`, `modifiedDate`)", "CREATE TABLE IF NOT EXISTS `VasistasSource` (`deviceId` INTEGER NOT NULL, `vasistasCategory` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `devicePriority` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`deviceId`, `vasistasCategory`))");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `PatientSession` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `patientId` TEXT NOT NULL, `startTime` INTEGER NOT NULL, `endTime` INTEGER NOT NULL, `ecgCount` INTEGER NOT NULL, `workoutCount` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_PatientSession_id_patientId` ON `PatientSession` (`id`, `patientId`)", "CREATE TABLE IF NOT EXISTS `program_task_preview` (`task_identifier` TEXT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT, `title` TEXT, `thumbnail` TEXT, `required` INTEGER, `tags_list` TEXT, `week_index` INTEGER, `week_label` TEXT, `day_index` INTEGER, `day_label` TEXT, `task_index` INTEGER, `program_id` INTEGER NOT NULL, `instance_id` INTEGER NOT NULL, `is_synced` INTEGER NOT NULL, `program_lastupdate` INTEGER, `goal` REAL, `measureType` INTEGER, `status` INTEGER, `completion_date` INTEGER, `metadata` TEXT, `currentlySwapped` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`task_identifier`))", "CREATE TABLE IF NOT EXISTS `DeviceScreensGroup` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `modified` INTEGER NOT NULL, `deviceId` INTEGER NOT NULL, `deleted` INTEGER NOT NULL, `rank` INTEGER NOT NULL, PRIMARY KEY(`id`, `deviceId`))");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `mission_task_preview` (`id` INTEGER NOT NULL, `date` INTEGER NOT NULL, `completed` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT DEFAULT NULL, `thumbnail` TEXT, `goal` TEXT, `crmid` TEXT, `completionDate` INTEGER, `updatedDate` INTEGER, `is_synced` INTEGER NOT NULL DEFAULT false, `capabilities` TEXT, `remote_program_task_id` TEXT, `remote_task_id` TEXT NOT NULL DEFAULT '', `status` INTEGER, `metadata` TEXT, `measureType` INTEGER, `currentlySwapped` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `program` (`programid` INTEGER NOT NULL, `deployment` TEXT NOT NULL, `target_type` INTEGER NOT NULL, `target_value` TEXT NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `visible` INTEGER NOT NULL, `familyid` INTEGER, `specifics` TEXT, `duration_json` TEXT, `eligibility` TEXT, `country_codes` TEXT, `data` TEXT, `userid` INTEGER NOT NULL, `program_overview` TEXT, `is_suggested` INTEGER NOT NULL DEFAULT false, `access_level` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`programid`))", "CREATE TABLE IF NOT EXISTS `program_enrolled` (`programid` INTEGER NOT NULL, `modified` INTEGER NOT NULL, `userid` INTEGER NOT NULL, PRIMARY KEY(`programid`))", "CREATE TABLE IF NOT EXISTS `program_iteration` (`programid` INTEGER NOT NULL, `iteration` INTEGER NOT NULL, `instanceid` INTEGER NOT NULL, `status` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER, `menu` TEXT, `summary` TEXT, `full_summary` TEXT, `progress` INTEGER, `unread` INTEGER, `program_sw_token` TEXT, `id` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `bookmark` (`remoteTaskId` TEXT NOT NULL, `isSync` INTEGER NOT NULL, `isSelected` INTEGER NOT NULL, `updatedDate` INTEGER NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`remoteTaskId`))", "CREATE TABLE IF NOT EXISTS `bookmarkPreview` (`remoteTaskId` TEXT NOT NULL, `title` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, `access_level` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`remoteTaskId`), FOREIGN KEY(`remoteTaskId`) REFERENCES `bookmark`(`remoteTaskId`) ON UPDATE NO ACTION ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `task_content` (`contentId` TEXT NOT NULL, `relatedProgramId` INTEGER NOT NULL DEFAULT -1, `lastUpdate` INTEGER NOT NULL, `content` TEXT NOT NULL, PRIMARY KEY(`contentId`, `relatedProgramId`))", "CREATE TABLE IF NOT EXISTS `ActirecCategoryDetection` (`userId` INTEGER NOT NULL, `workoutCategory` INTEGER NOT NULL, `enabled` INTEGER NOT NULL, PRIMARY KEY(`userId`, `workoutCategory`))");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `HealthScore` (`day` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, `global` REAL NOT NULL, `activity` REAL, `active_minutes` REAL, `steps` REAL, `body` REAL, `body_composition` REAL, `weight_engagement` REAL, `bmi` REAL, `heart` REAL, `ecg_engagement` REAL, `vascular_age` REAL, `night_hr` REAL, `blood_pressure` REAL, `blood_pressure_burden` REAL, `bpm_engagement` REAL, `ecg_afib` REAL, `afib_burden` REAL, `sleep` REAL, `sleep_apnea_burden` REAL, `sleep_quality` REAL, `sleep_monitoring` REAL, `algo` INTEGER NOT NULL DEFAULT 0, `synced` INTEGER NOT NULL, `valid` INTEGER NOT NULL DEFAULT true, PRIMARY KEY(`day`, `user_id`))", "CREATE TABLE IF NOT EXISTS `libraryFilter` (`id` INTEGER NOT NULL, `label` TEXT NOT NULL, `taskType` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `libraryPreviewContent` (`contentId` TEXT NOT NULL, `taskType` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `capabilities` TEXT NOT NULL, `extraHighlightInfo` TEXT NOT NULL, `isSuggested` INTEGER NOT NULL DEFAULT false, `access_level` INTEGER NOT NULL DEFAULT 0, `event_info` TEXT NOT NULL DEFAULT '[]', PRIMARY KEY(`contentId`))", "CREATE TABLE IF NOT EXISTS `libraryPreviewContentWithFilter` (`contentId` TEXT NOT NULL, `filterId` INTEGER NOT NULL, PRIMARY KEY(`contentId`, `filterId`), FOREIGN KEY(`filterId`) REFERENCES `libraryFilter`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`contentId`) REFERENCES `libraryPreviewContent`(`contentId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            androidx.work.impl.g.c(cVar, "CREATE TABLE IF NOT EXISTS `Plan` (`id` INTEGER NOT NULL, `accountId` INTEGER, `deviceId` INTEGER, `state` TEXT NOT NULL, `type` INTEGER NOT NULL, `startDate` INTEGER, `modified` INTEGER, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `prediction` (`wsId` INTEGER NOT NULL, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER NOT NULL, `active` INTEGER NOT NULL, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL, PRIMARY KEY(`wsId`))", "CREATE TABLE IF NOT EXISTS `HealthInsight` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `crm_id` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `object_structure` TEXT NOT NULL, `object_type` INTEGER NOT NULL, `object_id` INTEGER, `timestamp` INTEGER NOT NULL, `time_to_live` INTEGER NOT NULL, `expiration_date` INTEGER NOT NULL, `url` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `created` INTEGER NOT NULL)", "CREATE TABLE IF NOT EXISTS `factor` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `wsId` INTEGER, `userId` INTEGER NOT NULL, `type` INTEGER NOT NULL, `start` INTEGER NOT NULL, `end` INTEGER, `numberOfPills` INTEGER, `deleted` INTEGER, `deletionDate` INTEGER, `created` INTEGER NOT NULL, `modified` INTEGER NOT NULL)");
            androidx.activity.b.d(cVar, "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.access_level as accessLevel, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ec7d549c0b94449b475a52e284d963d4')");
        }

        @Override // androidx.room.c0.a
        public final void b(a9.c cVar) {
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `DeviceScreen`", "DROP TABLE IF EXISTS `DeviceScreenContent`", "DROP TABLE IF EXISTS `Event`", "DROP TABLE IF EXISTS `WorkoutLocation`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `EcgMeasurement`", "DROP TABLE IF EXISTS `HealthmateSessionData`", "DROP TABLE IF EXISTS `Insight`", "DROP TABLE IF EXISTS `leaderboard`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `Meal`", "DROP TABLE IF EXISTS `MealName`", "DROP TABLE IF EXISTS `Mood`", "DROP TABLE IF EXISTS `PartnerExchangeLastUpdate`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `PlatformFeature`", "DROP TABLE IF EXISTS `HealthAttributes`", "DROP TABLE IF EXISTS `NoteEntity`", "DROP TABLE IF EXISTS `NoteGroup`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `Tag`", "DROP TABLE IF EXISTS `Target`", "DROP TABLE IF EXISTS `Track`", "DROP TABLE IF EXISTS `VasistasSource`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `PatientSession`", "DROP TABLE IF EXISTS `program_task_preview`", "DROP TABLE IF EXISTS `DeviceScreensGroup`", "DROP TABLE IF EXISTS `mission_task_preview`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `program`", "DROP TABLE IF EXISTS `program_enrolled`", "DROP TABLE IF EXISTS `program_iteration`", "DROP TABLE IF EXISTS `bookmark`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `bookmarkPreview`", "DROP TABLE IF EXISTS `task_content`", "DROP TABLE IF EXISTS `ActirecCategoryDetection`", "DROP TABLE IF EXISTS `HealthScore`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `libraryFilter`", "DROP TABLE IF EXISTS `libraryPreviewContent`", "DROP TABLE IF EXISTS `libraryPreviewContentWithFilter`", "DROP TABLE IF EXISTS `Plan`");
            androidx.work.impl.g.c(cVar, "DROP TABLE IF EXISTS `prediction`", "DROP TABLE IF EXISTS `HealthInsight`", "DROP TABLE IF EXISTS `factor`", "DROP VIEW IF EXISTS `BookmarkPreviewView`");
            List<RoomDatabase.b> list = ((RoomDatabase) ProdRoomDb_Impl.this).f18109g;
            if (list != null) {
                for (RoomDatabase.b bVar : list) {
                    bVar.getClass();
                }
            }
        }

        @Override // androidx.room.c0.a
        public final void c(a9.c cVar) {
            List<RoomDatabase.b> list = ((RoomDatabase) ProdRoomDb_Impl.this).f18109g;
            if (list != null) {
                for (RoomDatabase.b bVar : list) {
                    bVar.getClass();
                }
            }
        }

        @Override // androidx.room.c0.a
        public final void d(a9.c cVar) {
            ProdRoomDb_Impl prodRoomDb_Impl = ProdRoomDb_Impl.this;
            ((RoomDatabase) prodRoomDb_Impl).f18103a = cVar;
            cVar.l("PRAGMA foreign_keys = ON");
            prodRoomDb_Impl.u(cVar);
            List<RoomDatabase.b> list = ((RoomDatabase) prodRoomDb_Impl).f18109g;
            if (list != null) {
                for (RoomDatabase.b bVar : list) {
                    bVar.a(cVar);
                }
            }
        }

        @Override // androidx.room.c0.a
        public final void e(a9.c cVar) {
            x8.b.a(cVar);
        }

        @Override // androidx.room.c0.a
        public final c0.b f(a9.c cVar) {
            HashMap hashMap = new HashMap(28);
            hashMap.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap.put("wsId", new c.a("wsId", "INTEGER", null, 0, 1, true));
            hashMap.put("name", new c.a("name", "TEXT", null, 0, 1, true));
            hashMap.put("deviceId", new c.a("deviceId", "INTEGER", null, 0, 1, true));
            hashMap.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap.put("screenSource", new c.a("screenSource", "INTEGER", null, 0, 1, true));
            hashMap.put("images", new c.a("images", "TEXT", null, 0, 1, false));
            hashMap.put("embeddedId", new c.a("embeddedId", "INTEGER", null, 0, 1, false));
            hashMap.put("displayOrder", new c.a("displayOrder", "INTEGER", null, 0, 1, true));
            hashMap.put("active", new c.a("active", "INTEGER", null, 0, 1, true));
            hashMap.put("deactivableStatus", new c.a("deactivableStatus", "INTEGER", null, 0, 1, false));
            hashMap.put("parentId", new c.a("parentId", "INTEGER", null, 0, 1, false));
            hashMap.put("displayContext", new c.a("displayContext", "TEXT", null, 0, 1, true));
            hashMap.put("syncedWithWS", new c.a("syncedWithWS", "INTEGER", null, 0, 1, true));
            hashMap.put("syncedWithDevice", new c.a("syncedWithDevice", "INTEGER", null, 0, 1, true));
            hashMap.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            hashMap.put("startDate", new c.a("startDate", "INTEGER", null, 0, 1, false));
            hashMap.put("endDate", new c.a("endDate", "INTEGER", null, 0, 1, false));
            hashMap.put("appDependencies", new c.a("appDependencies", "TEXT", null, 0, 1, true));
            hashMap.put("defaultActive", new c.a("defaultActive", "INTEGER", null, 0, 1, false));
            hashMap.put("defaultRank", new c.a("defaultRank", "INTEGER", null, 0, 1, false));
            hashMap.put("group", new c.a("group", "INTEGER", null, 0, 1, false));
            hashMap.put("requiredFeatureIds", new c.a("requiredFeatureIds", "TEXT", null, 0, 1, false));
            hashMap.put("fixedPosition", new c.a("fixedPosition", "INTEGER", null, 0, 1, false));
            hashMap.put("imageType", new c.a("imageType", "INTEGER", null, 0, 1, false));
            hashMap.put("imageData", new c.a("imageData", "TEXT", null, 0, 1, false));
            hashMap.put("imageHeight", new c.a("imageHeight", "INTEGER", null, 0, 1, false));
            HashSet c11 = l0.c(hashMap, "imageWidth", new c.a("imageWidth", "INTEGER", null, 0, 1, false), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new c.d("index_DeviceScreen_wsId_embeddedId_deviceId_userId", true, Arrays.asList("wsId", "embeddedId", "deviceId", NavigationArguments.USER_ID), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            x8.c cVar2 = new x8.c("DeviceScreen", hashMap, c11, hashSet);
            x8.c a11 = x8.c.a(cVar, "DeviceScreen");
            if (!cVar2.equals(a11)) {
                return new c0.b(false, k0.i("DeviceScreen(com.withings.screen.repository.data.model.DeviceScreenEntity).\n Expected:\n", cVar2, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(10);
            hashMap2.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap2.put("deviceId", new c.a("deviceId", "INTEGER", null, 0, 1, true));
            hashMap2.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap2.put("screenWsId", new c.a("screenWsId", "INTEGER", null, 0, 1, true));
            hashMap2.put("displayStyle", new c.a("displayStyle", "INTEGER", null, 0, 1, true));
            hashMap2.put("message", new c.a("message", "TEXT", null, 0, 1, true));
            hashMap2.put("startDate", new c.a("startDate", "INTEGER", null, 0, 1, false));
            hashMap2.put("endDate", new c.a("endDate", "INTEGER", null, 0, 1, false));
            hashMap2.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            x8.c cVar3 = new x8.c("DeviceScreenContent", hashMap2, l0.c(hashMap2, "syncedWithDevice", new c.a("syncedWithDevice", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a12 = x8.c.a(cVar, "DeviceScreenContent");
            if (!cVar3.equals(a12)) {
                return new c0.b(false, k0.i("DeviceScreenContent(com.withings.screen.repository.data.model.DeviceScreenContentEntity).\n Expected:\n", cVar3, "\n Found:\n", a12));
            }
            HashMap hashMap3 = new HashMap(6);
            hashMap3.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap3.put("type", new c.a("type", "TEXT", null, 0, 1, true));
            hashMap3.put("epoch", new c.a("epoch", "INTEGER", null, 0, 1, true));
            hashMap3.put("data", new c.a("data", "TEXT", null, 0, 1, true));
            hashMap3.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, false));
            x8.c cVar4 = new x8.c("Event", hashMap3, l0.c(hashMap3, "deviceId", new c.a("deviceId", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a13 = x8.c.a(cVar, "Event");
            if (!cVar4.equals(a13)) {
                return new c0.b(false, k0.i("Event(com.withings.wiscale2.device.common.event.Event).\n Expected:\n", cVar4, "\n Found:\n", a13));
            }
            HashMap hashMap4 = new HashMap(14);
            hashMap4.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap4.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap4.put("date", new c.a("date", "INTEGER", null, 0, 1, true));
            hashMap4.put("speed", new c.a("speed", "REAL", null, 0, 1, true));
            hashMap4.put("horizontalAccuracy", new c.a("horizontalAccuracy", "REAL", null, 0, 1, true));
            hashMap4.put("altitude", new c.a("altitude", "REAL", null, 0, 1, true));
            hashMap4.put(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, new c.a(FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "REAL", null, 0, 1, true));
            hashMap4.put("latitude", new c.a("latitude", "REAL", null, 0, 1, true));
            hashMap4.put("longitude", new c.a("longitude", "REAL", null, 0, 1, true));
            hashMap4.put("speedAccuracy", new c.a("speedAccuracy", "REAL", "0", 0, 1, true));
            hashMap4.put("course", new c.a("course", "REAL", "0", 0, 1, true));
            hashMap4.put("courseAccuracy", new c.a("courseAccuracy", "REAL", "0", 0, 1, true));
            hashMap4.put("synced", new c.a("synced", "INTEGER", null, 0, 1, true));
            HashSet c12 = l0.c(hashMap4, "deviceId", new c.a("deviceId", "INTEGER", null, 0, 1, true), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new c.d("index_WorkoutLocation_userId_date", false, Arrays.asList(NavigationArguments.USER_ID, "date"), Arrays.asList("ASC", "ASC")));
            x8.c cVar5 = new x8.c("WorkoutLocation", hashMap4, c12, hashSet2);
            x8.c a14 = x8.c.a(cVar, "WorkoutLocation");
            if (!cVar5.equals(a14)) {
                return new c0.b(false, k0.i("WorkoutLocation(com.withings.location.repository.data.model.GpsLocationEntity).\n Expected:\n", cVar5, "\n Found:\n", a14));
            }
            HashMap hashMap5 = new HashMap(27);
            hashMap5.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap5.put("userID", new c.a("userID", "INTEGER", null, 0, 1, true));
            hashMap5.put("deviceModel", new c.a("deviceModel", "INTEGER", null, 0, 1, true));
            hashMap5.put("timestamp", new c.a("timestamp", "INTEGER", null, 0, 1, true));
            hashMap5.put("synced", new c.a("synced", "INTEGER", null, 0, 1, true));
            hashMap5.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            hashMap5.put("deviceId", new c.a("deviceId", "INTEGER", null, 0, 1, false));
            hashMap5.put("trackerWearPos", new c.a("trackerWearPos", "INTEGER", null, 0, 1, false));
            hashMap5.put("deleted", new c.a("deleted", "INTEGER", null, 0, 1, true));
            hashMap5.put("measures", new c.a("measures", "TEXT", null, 0, 1, true));
            hashMap5.put("firmwareVersion", new c.a("firmwareVersion", "INTEGER", null, 0, 1, false));
            hashMap5.put("brand", new c.a("brand", "INTEGER", null, 0, 1, false));
            hashMap5.put("signalId", new c.a("signalId", "INTEGER", null, 0, 1, false));
            hashMap5.put("signalPath", new c.a("signalPath", "TEXT", null, 0, 1, true));
            hashMap5.put("timeWindow", new c.a("timeWindow", "INTEGER", null, 0, 1, true));
            hashMap5.put("duration", new c.a("duration", "INTEGER", null, 0, 1, true));
            hashMap5.put("totalSize", new c.a("totalSize", "INTEGER", null, 0, 1, true));
            hashMap5.put(GetHealthAttributeResponse.FIELD_OFFSET_NAME, new c.a(GetHealthAttributeResponse.FIELD_OFFSET_NAME, "INTEGER", null, 0, 1, true));
            hashMap5.put("gain", new c.a("gain", "INTEGER", null, 0, 1, true));
            hashMap5.put("qfix", new c.a("qfix", "INTEGER", null, 0, 1, true));
            hashMap5.put("type", new c.a("type", "INTEGER", null, 0, 1, true));
            hashMap5.put("samplingFreq", new c.a("samplingFreq", "INTEGER", null, 0, 1, true));
            hashMap5.put("channel", new c.a("channel", "INTEGER", null, 0, 1, true));
            hashMap5.put(WsVasistasSerie.KEY_FORMAT, new c.a(WsVasistasSerie.KEY_FORMAT, "INTEGER", null, 0, 1, true));
            hashMap5.put("size", new c.a("size", "INTEGER", null, 0, 1, true));
            hashMap5.put("resolution", new c.a("resolution", "INTEGER", null, 0, 1, true));
            HashSet c13 = l0.c(hashMap5, "filterBank", new c.a("filterBank", "INTEGER", null, 0, 1, true), 0);
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new c.d("index_EcgMeasurement_userID_timestamp", false, Arrays.asList("userID", "timestamp"), Arrays.asList("ASC", "ASC")));
            x8.c cVar6 = new x8.c("EcgMeasurement", hashMap5, c13, hashSet3);
            x8.c a15 = x8.c.a(cVar, "EcgMeasurement");
            if (!cVar6.equals(a15)) {
                return new c0.b(false, k0.i("EcgMeasurement(com.withings.ecg.model.HeartSignalMeasurement).\n Expected:\n", cVar6, "\n Found:\n", a15));
            }
            HashMap hashMap6 = new HashMap(15);
            hashMap6.put("accountId", new c.a("accountId", "INTEGER", null, 1, 1, true));
            hashMap6.put("sessionId", new c.a("sessionId", "TEXT", null, 0, 1, true));
            hashMap6.put("providerToken", new c.a("providerToken", "TEXT", null, 0, 1, true));
            hashMap6.put("authToken", new c.a("authToken", "TEXT", null, 0, 1, true));
            hashMap6.put("isSecured", new c.a("isSecured", "INTEGER", null, 0, 1, true));
            hashMap6.put("requireSecure", new c.a("requireSecure", "INTEGER", null, 0, 1, true));
            hashMap6.put("expirationTimestamp", new c.a("expirationTimestamp", "INTEGER", null, 0, 1, true));
            hashMap6.put("providerType", new c.a("providerType", "TEXT", null, 0, 1, true));
            hashMap6.put("serverUrl", new c.a("serverUrl", "TEXT", null, 0, 1, true));
            hashMap6.put("inappviewUrl", new c.a("inappviewUrl", "TEXT", null, 0, 1, true));
            hashMap6.put("maintUrl", new c.a("maintUrl", "TEXT", null, 0, 1, true));
            hashMap6.put("accountUrl", new c.a("accountUrl", "TEXT", null, 0, 1, true));
            hashMap6.put("cookieDomain", new c.a("cookieDomain", "TEXT", null, 0, 1, true));
            hashMap6.put("cookieName", new c.a("cookieName", "TEXT", null, 0, 1, true));
            x8.c cVar7 = new x8.c("HealthmateSessionData", hashMap6, l0.c(hashMap6, "sessionType", new c.a("sessionType", "TEXT", null, 0, 1, true), 0), new HashSet(0));
            x8.c a16 = x8.c.a(cVar, "HealthmateSessionData");
            if (!cVar7.equals(a16)) {
                return new c0.b(false, k0.i("HealthmateSessionData(com.withings.account.data.session.dao.HealthmateSessionEntity).\n Expected:\n", cVar7, "\n Found:\n", a16));
            }
            HashMap hashMap7 = new HashMap(28);
            hashMap7.put("crmId", new c.a("crmId", "TEXT", null, 0, 1, true));
            hashMap7.put("conversationId", new c.a("conversationId", "INTEGER", null, 0, 1, false));
            hashMap7.put("insightId", new c.a("insightId", "INTEGER", null, 1, 1, false));
            hashMap7.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap7.put(WsVasistasSerie.KEY_FORMAT, new c.a(WsVasistasSerie.KEY_FORMAT, "TEXT", null, 0, 1, false));
            hashMap7.put("emotion", new c.a("emotion", "TEXT", null, 0, 1, false));
            hashMap7.put("bgcolor", new c.a("bgcolor", "TEXT", null, 0, 1, false));
            hashMap7.put("category", new c.a("category", "TEXT", null, 0, 1, true));
            hashMap7.put(FoodDayFragment.ARG_DAY, new c.a(FoodDayFragment.ARG_DAY, "INTEGER", null, 0, 1, false));
            hashMap7.put("archivable", new c.a("archivable", "INTEGER", null, 0, 1, false));
            hashMap7.put("scenario", new c.a("scenario", "TEXT", null, 0, 1, false));
            hashMap7.put("synced", new c.a("synced", "INTEGER", null, 0, 1, true));
            hashMap7.put(ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, new c.a(ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "TEXT", null, 0, 1, false));
            hashMap7.put("variables", new c.a("variables", "TEXT", null, 0, 1, false));
            hashMap7.put("read", new c.a("read", "INTEGER", null, 0, 1, true));
            hashMap7.put("opened", new c.a("opened", "INTEGER", null, 0, 1, true));
            hashMap7.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            hashMap7.put(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, new c.a(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "INTEGER", null, 0, 1, true));
            hashMap7.put("deleted", new c.a("deleted", "INTEGER", null, 0, 1, true));
            hashMap7.put("conditions", new c.a("conditions", "TEXT", null, 0, 1, false));
            hashMap7.put(RemoteMessageConst.Notification.PRIORITY, new c.a(RemoteMessageConst.Notification.PRIORITY, "INTEGER", null, 0, 1, false));
            hashMap7.put("expirationDate", new c.a("expirationDate", "INTEGER", null, 0, 1, false));
            hashMap7.put("version", new c.a("version", "REAL", null, 0, 1, false));
            hashMap7.put("title", new c.a("title", "TEXT", null, 0, 1, false));
            hashMap7.put("subtitle", new c.a("subtitle", "TEXT", null, 0, 1, false));
            hashMap7.put("buttonText", new c.a("buttonText", "TEXT", null, 0, 1, false));
            hashMap7.put("buttonUrl", new c.a("buttonUrl", "TEXT", null, 0, 1, false));
            x8.c cVar8 = new x8.c("Insight", hashMap7, l0.c(hashMap7, ConversationItemData.WS_TYPE, new c.a(ConversationItemData.WS_TYPE, "TEXT", null, 0, 1, false), 0), new HashSet(0));
            x8.c a17 = x8.c.a(cVar, "Insight");
            if (!cVar8.equals(a17)) {
                return new c0.b(false, k0.i("Insight(com.withings.insight.android.entity.Insight).\n Expected:\n", cVar8, "\n Found:\n", a17));
            }
            HashMap hashMap8 = new HashMap(8);
            hashMap8.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap8.put("date", new c.a("date", "TEXT", null, 0, 1, true));
            hashMap8.put("userid", new c.a("userid", "INTEGER", null, 0, 1, true));
            hashMap8.put(FirebaseAnalytics.Param.SCORE, new c.a(FirebaseAnalytics.Param.SCORE, "INTEGER", null, 0, 1, true));
            hashMap8.put("firstname", new c.a("firstname", "TEXT", null, 0, 1, true));
            hashMap8.put("lastName", new c.a("lastName", "TEXT", null, 0, 1, true));
            hashMap8.put("imageUrl", new c.a("imageUrl", "TEXT", null, 0, 1, false));
            HashSet c14 = l0.c(hashMap8, "modified", new c.a("modified", "INTEGER", null, 0, 1, true), 0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new c.d("index_leaderboard_date", false, Arrays.asList("date"), Arrays.asList("ASC")));
            x8.c cVar9 = new x8.c("leaderboard", hashMap8, c14, hashSet4);
            x8.c a18 = x8.c.a(cVar, "leaderboard");
            if (!cVar9.equals(a18)) {
                return new c0.b(false, k0.i("leaderboard(com.withings.leaderboard.repositories.data.LeaderboardEntry).\n Expected:\n", cVar9, "\n Found:\n", a18));
            }
            HashMap hashMap9 = new HashMap(28);
            hashMap9.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap9.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap9.put("date", new c.a("date", "TEXT", null, 0, 1, false));
            hashMap9.put("brand", new c.a("brand", "INTEGER", null, 0, 1, true));
            hashMap9.put("calorieGoal", new c.a("calorieGoal", "INTEGER", null, 0, 1, true));
            hashMap9.put("measureCount", new c.a("measureCount", "INTEGER", null, 0, 1, true));
            hashMap9.put("mealNameId", new c.a("mealNameId", "INTEGER", null, 0, 1, true));
            hashMap9.put("mealNameRank", new c.a("mealNameRank", "INTEGER", null, 0, 1, true));
            hashMap9.put("calories", new c.a("calories", "REAL", null, 0, 1, false));
            hashMap9.put("sodium", new c.a("sodium", "REAL", null, 0, 1, false));
            hashMap9.put("potassium", new c.a("potassium", "REAL", null, 0, 1, false));
            hashMap9.put("carbs", new c.a("carbs", "REAL", null, 0, 1, false));
            hashMap9.put("vitaminA", new c.a("vitaminA", "REAL", null, 0, 1, false));
            hashMap9.put("vitaminC", new c.a("vitaminC", "REAL", null, 0, 1, false));
            hashMap9.put("calcium", new c.a("calcium", "REAL", null, 0, 1, false));
            hashMap9.put("iron", new c.a("iron", "REAL", null, 0, 1, false));
            hashMap9.put("fat", new c.a("fat", "REAL", null, 0, 1, false));
            hashMap9.put("saturatedFat", new c.a("saturatedFat", "REAL", null, 0, 1, false));
            hashMap9.put("polyunsaturedFat", new c.a("polyunsaturedFat", "REAL", null, 0, 1, false));
            hashMap9.put("monounsaturatedFat", new c.a("monounsaturatedFat", "REAL", null, 0, 1, false));
            hashMap9.put("transFat", new c.a("transFat", "REAL", null, 0, 1, false));
            hashMap9.put("cholesterol", new c.a("cholesterol", "REAL", null, 0, 1, false));
            hashMap9.put("fiber", new c.a("fiber", "REAL", null, 0, 1, false));
            hashMap9.put("sugars", new c.a("sugars", "REAL", null, 0, 1, false));
            hashMap9.put("protein", new c.a("protein", "REAL", null, 0, 1, false));
            hashMap9.put("createdDate", new c.a("createdDate", "INTEGER", null, 0, 1, false));
            hashMap9.put("modifiedDate", new c.a("modifiedDate", "INTEGER", null, 0, 1, false));
            x8.c cVar10 = new x8.c("Meal", hashMap9, l0.c(hashMap9, "enrich", new c.a("enrich", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a19 = x8.c.a(cVar, "Meal");
            if (!cVar10.equals(a19)) {
                return new c0.b(false, k0.i("Meal(com.withings.wiscale2.food.model.Meal).\n Expected:\n", cVar10, "\n Found:\n", a19));
            }
            HashMap hashMap10 = new HashMap(7);
            hashMap10.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap10.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap10.put("rank", new c.a("rank", "INTEGER", null, 0, 1, true));
            hashMap10.put("name", new c.a("name", "TEXT", null, 0, 1, false));
            hashMap10.put("createdDate", new c.a("createdDate", "INTEGER", null, 0, 1, false));
            hashMap10.put("modifiedDate", new c.a("modifiedDate", "INTEGER", null, 0, 1, false));
            x8.c cVar11 = new x8.c("MealName", hashMap10, l0.c(hashMap10, "brand", new c.a("brand", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a21 = x8.c.a(cVar, "MealName");
            if (!cVar11.equals(a21)) {
                return new c0.b(false, k0.i("MealName(com.withings.wiscale2.food.model.MealName).\n Expected:\n", cVar11, "\n Found:\n", a21));
            }
            HashMap hashMap11 = new HashMap(7);
            hashMap11.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap11.put(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new c.a(HealthUserProfile.USER_PROFILE_KEY_USER_ID, "INTEGER", null, 0, 1, true));
            hashMap11.put("subjected_id", new c.a("subjected_id", "INTEGER", null, 0, 1, false));
            hashMap11.put("mood_level", new c.a("mood_level", "INTEGER", null, 0, 1, true));
            hashMap11.put("date", new c.a("date", "INTEGER", null, 0, 1, true));
            hashMap11.put("is_deleted", new c.a("is_deleted", "INTEGER", null, 0, 1, true));
            x8.c cVar12 = new x8.c("Mood", hashMap11, l0.c(hashMap11, "is_day_log", new c.a("is_day_log", "INTEGER", "true", 0, 1, true), 0), new HashSet(0));
            x8.c a22 = x8.c.a(cVar, "Mood");
            if (!cVar12.equals(a22)) {
                return new c0.b(false, k0.i("Mood(com.withings.manualLogging.data.room.TemporaryRoomMood).\n Expected:\n", cVar12, "\n Found:\n", a22));
            }
            HashMap hashMap12 = new HashMap(5);
            hashMap12.put("partnerConsumerId", new c.a("partnerConsumerId", "INTEGER", null, 1, 1, true));
            hashMap12.put("measureType", new c.a("measureType", "INTEGER", null, 2, 1, true));
            hashMap12.put("exchangeType", new c.a("exchangeType", "INTEGER", null, 3, 1, true));
            hashMap12.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            x8.c cVar13 = new x8.c("PartnerExchangeLastUpdate", hashMap12, l0.c(hashMap12, "changeToken", new c.a("changeToken", "TEXT", null, 0, 1, false), 0), new HashSet(0));
            x8.c a23 = x8.c.a(cVar, "PartnerExchangeLastUpdate");
            if (!cVar13.equals(a23)) {
                return new c0.b(false, k0.i("PartnerExchangeLastUpdate(com.withings.partner.exchanges.PartnerExchangeLastUpdate).\n Expected:\n", cVar13, "\n Found:\n", a23));
            }
            HashMap hashMap13 = new HashMap(4);
            hashMap13.put("featureId", new c.a("featureId", "INTEGER", null, 1, 1, true));
            hashMap13.put("name", new c.a("name", "TEXT", null, 0, 1, false));
            hashMap13.put("owners", new c.a("owners", "TEXT", null, 0, 1, true));
            x8.c cVar14 = new x8.c("PlatformFeature", hashMap13, l0.c(hashMap13, "synced", new c.a("synced", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a24 = x8.c.a(cVar, "PlatformFeature");
            if (!cVar14.equals(a24)) {
                return new c0.b(false, k0.i("PlatformFeature(com.withings.features.platform.model.PlatformFeature).\n Expected:\n", cVar14, "\n Found:\n", a24));
            }
            HashMap hashMap14 = new HashMap(15);
            hashMap14.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap14.put("web_service_id", new c.a("web_service_id", "INTEGER", null, 0, 1, false));
            hashMap14.put(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new c.a(HealthUserProfile.USER_PROFILE_KEY_USER_ID, "INTEGER", null, 0, 1, false));
            hashMap14.put("type", new c.a("type", "INTEGER", null, 0, 1, true));
            hashMap14.put("name", new c.a("name", "TEXT", null, 0, 1, false));
            hashMap14.put("key_name", new c.a("key_name", "TEXT", null, 0, 1, false));
            hashMap14.put("key_description", new c.a("key_description", "TEXT", null, 0, 1, false));
            hashMap14.put("default_description", new c.a("default_description", "TEXT", null, 0, 1, false));
            hashMap14.put("server_modification", new c.a("server_modification", "INTEGER", null, 0, 1, false));
            hashMap14.put("deleted", new c.a("deleted", "INTEGER", null, 0, 1, true));
            hashMap14.put("min_age", new c.a("min_age", "INTEGER", null, 0, 1, false));
            hashMap14.put("max_age", new c.a("max_age", "INTEGER", null, 0, 1, false));
            hashMap14.put("category", new c.a("category", "TEXT", "NULL", 0, 1, false));
            hashMap14.put(WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME, new c.a(WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME, "TEXT", "NULL", 0, 1, false));
            x8.c cVar15 = new x8.c("HealthAttributes", hashMap14, l0.c(hashMap14, WebServiceHealthAttribute.FIELD_ASSET_NAME, new c.a(WebServiceHealthAttribute.FIELD_ASSET_NAME, "TEXT", "NULL", 0, 1, false), 0), new HashSet(0));
            x8.c a25 = x8.c.a(cVar, "HealthAttributes");
            if (!cVar15.equals(a25)) {
                return new c0.b(false, k0.i("HealthAttributes(com.withings.manualLogging.data.room.healthAttribute.RoomHealthAttribute).\n Expected:\n", cVar15, "\n Found:\n", a25));
            }
            HashMap hashMap15 = new HashMap(11);
            hashMap15.put("noteId", new c.a("noteId", "INTEGER", null, 1, 1, true));
            hashMap15.put("noteWsId", new c.a("noteWsId", "INTEGER", null, 0, 1, false));
            hashMap15.put("noteGroupId", new c.a("noteGroupId", "INTEGER", null, 0, 1, false));
            hashMap15.put("localNoteGroupId", new c.a("localNoteGroupId", "INTEGER", null, 0, 1, false));
            hashMap15.put("noteDeleted", new c.a("noteDeleted", "INTEGER", null, 0, 1, true));
            hashMap15.put("type", new c.a("type", "INTEGER", null, 0, 1, true));
            hashMap15.put("text", new c.a("text", "TEXT", null, 0, 1, false));
            hashMap15.put("noteHealthAttributeId", new c.a("noteHealthAttributeId", "INTEGER", null, 0, 1, false));
            hashMap15.put("noteHealthAttributeLocalId", new c.a("noteHealthAttributeLocalId", "INTEGER", null, 0, 1, false));
            hashMap15.put("signalId", new c.a("signalId", "INTEGER", null, 0, 1, false));
            x8.c cVar16 = new x8.c("NoteEntity", hashMap15, l0.c(hashMap15, "modified", new c.a("modified", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a26 = x8.c.a(cVar, "NoteEntity");
            if (!cVar16.equals(a26)) {
                return new c0.b(false, k0.i("NoteEntity(com.withings.manualLogging.data.room.note.RoomNote).\n Expected:\n", cVar16, "\n Found:\n", a26));
            }
            HashMap hashMap16 = new HashMap(15);
            hashMap16.put("noteGroupId", new c.a("noteGroupId", "INTEGER", null, 1, 1, true));
            hashMap16.put("wsId", new c.a("wsId", "INTEGER", null, 0, 1, false));
            hashMap16.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, false));
            hashMap16.put("remoteMeasureGroupId", new c.a("remoteMeasureGroupId", "INTEGER", null, 0, 1, true));
            hashMap16.put("localMeasureGroupId", new c.a("localMeasureGroupId", "INTEGER", null, 0, 1, false));
            hashMap16.put("localEcgId", new c.a("localEcgId", "INTEGER", null, 0, 1, false));
            hashMap16.put("cryptpart", new c.a("cryptpart", "TEXT", null, 0, 1, false));
            hashMap16.put("date", new c.a("date", "INTEGER", null, 0, 1, true));
            hashMap16.put("serverCreatedDate", new c.a("serverCreatedDate", "INTEGER", null, 0, 1, false));
            hashMap16.put("serverModifiedDate", new c.a("serverModifiedDate", "INTEGER", null, 0, 1, false));
            hashMap16.put("localModifiedDate", new c.a("localModifiedDate", "INTEGER", null, 0, 1, false));
            hashMap16.put("noSymptom", new c.a("noSymptom", "INTEGER", null, 0, 1, true));
            hashMap16.put("signalId", new c.a("signalId", "INTEGER", null, 0, 1, false));
            hashMap16.put("deleted", new c.a("deleted", "INTEGER", null, 0, 1, true));
            HashSet c15 = l0.c(hashMap16, "synced", new c.a("synced", "INTEGER", null, 0, 1, true), 0);
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new c.d("index_NoteGroup_signalId", true, Arrays.asList("signalId"), Arrays.asList("ASC")));
            x8.c cVar17 = new x8.c("NoteGroup", hashMap16, c15, hashSet5);
            x8.c a27 = x8.c.a(cVar, "NoteGroup");
            if (!cVar17.equals(a27)) {
                return new c0.b(false, k0.i("NoteGroup(com.withings.manualLogging.data.room.note.RoomNoteGroup).\n Expected:\n", cVar17, "\n Found:\n", a27));
            }
            HashMap hashMap17 = new HashMap(3);
            hashMap17.put("ownerId", new c.a("ownerId", "INTEGER", null, 1, 1, true));
            hashMap17.put("ownerType", new c.a("ownerType", "TEXT", null, 2, 1, true));
            x8.c cVar18 = new x8.c("Tag", hashMap17, l0.c(hashMap17, "tags", new c.a("tags", "TEXT", null, 0, 1, true), 0), new HashSet(0));
            x8.c a28 = x8.c.a(cVar, "Tag");
            if (!cVar18.equals(a28)) {
                return new c0.b(false, k0.i("Tag(com.withings.features.platform.api.Tag).\n Expected:\n", cVar18, "\n Found:\n", a28));
            }
            HashMap hashMap18 = new HashMap(15);
            hashMap18.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap18.put("wsId", new c.a("wsId", "INTEGER", null, 0, 1, false));
            hashMap18.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap18.put("type", new c.a("type", "INTEGER", null, 0, 1, true));
            hashMap18.put("measureType", new c.a("measureType", "INTEGER", null, 0, 1, true));
            hashMap18.put(ValidateElement.RangeValidateElement.METHOD, new c.a(ValidateElement.RangeValidateElement.METHOD, "INTEGER", null, 0, 1, true));
            hashMap18.put("mantissa", new c.a("mantissa", "INTEGER", null, 0, 1, true));
            hashMap18.put("exponent", new c.a("exponent", "INTEGER", null, 0, 1, true));
            hashMap18.put("isActive", new c.a("isActive", "INTEGER", null, 0, 1, true));
            hashMap18.put("deactivated", new c.a("deactivated", "INTEGER", null, 0, 1, false));
            hashMap18.put(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, new c.a(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "INTEGER", null, 0, 1, true));
            hashMap18.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            hashMap18.put("date", new c.a("date", "INTEGER", null, 0, 1, true));
            hashMap18.put("isSyncedWithApi", new c.a("isSyncedWithApi", "INTEGER", null, 0, 1, true));
            HashSet c16 = l0.c(hashMap18, "attrib", new c.a("attrib", "INTEGER", null, 0, 1, false), 0);
            HashSet hashSet6 = new HashSet(3);
            hashSet6.add(new c.d("index_Target_userId_isActive", false, Arrays.asList(NavigationArguments.USER_ID, "isActive"), Arrays.asList("ASC", "ASC")));
            hashSet6.add(new c.d("index_Target_userId_isSyncedWithApi", false, Arrays.asList(NavigationArguments.USER_ID, "isSyncedWithApi"), Arrays.asList("ASC", "ASC")));
            hashSet6.add(new c.d("index_Target_userId_type_measureType", false, Arrays.asList(NavigationArguments.USER_ID, "type", "measureType"), Arrays.asList("ASC", "ASC", "ASC")));
            x8.c cVar19 = new x8.c("Target", hashMap18, c16, hashSet6);
            x8.c a29 = x8.c.a(cVar, "Target");
            if (!cVar19.equals(a29)) {
                return new c0.b(false, k0.i("Target(com.withings.target.Target).\n Expected:\n", cVar19, "\n Found:\n", a29));
            }
            HashMap hashMap19 = new HashMap(61);
            hashMap19.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap19.put("wsId", new c.a("wsId", "INTEGER", null, 0, 1, false));
            hashMap19.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap19.put("startDate", new c.a("startDate", "INTEGER", null, 0, 1, true));
            hashMap19.put("endDate", new c.a("endDate", "INTEGER", null, 0, 1, true));
            hashMap19.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, new c.a(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "TEXT", null, 0, 1, false));
            hashMap19.put(FoodDayFragment.ARG_DAY, new c.a(FoodDayFragment.ARG_DAY, "TEXT", null, 0, 1, true));
            hashMap19.put("modifiedDate", new c.a("modifiedDate", "INTEGER", null, 0, 1, true));
            hashMap19.put("deviceId", new c.a("deviceId", "INTEGER", null, 0, 1, false));
            hashMap19.put("deviceModel", new c.a("deviceModel", "INTEGER", null, 0, 1, true));
            hashMap19.put("deviceType", new c.a("deviceType", "INTEGER", null, 0, 1, true));
            hashMap19.put("attrib", new c.a("attrib", "INTEGER", null, 0, 1, true));
            hashMap19.put("category", new c.a("category", "INTEGER", null, 0, 1, true));
            hashMap19.put("dataJson", new c.a("dataJson", "TEXT", null, 0, 1, false));
            hashMap19.put("activityRecognitionVersion", new c.a("activityRecognitionVersion", "INTEGER", null, 0, 1, false));
            hashMap19.put("isSyncedToWs", new c.a("isSyncedToWs", "INTEGER", null, 0, 1, true));
            hashMap19.put("deleted", new c.a("deleted", "INTEGER", null, 0, 1, true));
            hashMap19.put("deletionReason", new c.a("deletionReason", "INTEGER", null, 0, 1, false));
            hashMap19.put(ConstantsWs.REDOX_DATA_MODEL_NOTE, new c.a(ConstantsWs.REDOX_DATA_MODEL_NOTE, "TEXT", null, 0, 1, false));
            hashMap19.put("snoringEnabled", new c.a("snoringEnabled", "INTEGER", null, 0, 1, true));
            hashMap19.put("inProgress", new c.a("inProgress", "INTEGER", null, 0, 1, true));
            hashMap19.put("manualStartDate", new c.a("manualStartDate", "INTEGER", null, 0, 1, false));
            hashMap19.put("manualEndDate", new c.a("manualEndDate", "INTEGER", null, 0, 1, false));
            hashMap19.put("blankVasistasFilled", new c.a("blankVasistasFilled", "INTEGER", null, 0, 1, true));
            hashMap19.put("pathlists", new c.a("pathlists", "TEXT", null, 0, 1, false));
            hashMap19.put("cryptpart", new c.a("cryptpart", "TEXT", null, 0, 1, false));
            hashMap19.put("coverPictureUrl", new c.a("coverPictureUrl", "TEXT", null, 0, 1, false));
            hashMap19.put("uris", new c.a("uris", "TEXT", null, 0, 1, false));
            hashMap19.put("coverPictureUri", new c.a("coverPictureUri", "TEXT", null, 0, 1, false));
            hashMap19.put("brand", new c.a("brand", "INTEGER", null, 0, 1, true));
            hashMap19.put("sleepScoreValue", new c.a("sleepScoreValue", "INTEGER", null, 0, 1, false));
            hashMap19.put("sleepScoreStatus", new c.a("sleepScoreStatus", "INTEGER", null, 0, 1, false));
            hashMap19.put("sleepScoreAlgoVersion", new c.a("sleepScoreAlgoVersion", "INTEGER", null, 0, 1, false));
            hashMap19.put("duration_info_score", new c.a("duration_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("duration_info_status", new c.a("duration_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("recovery_info_score", new c.a("recovery_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("recovery_info_status", new c.a("recovery_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("interruptions_info_score", new c.a("interruptions_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("interruptions_info_status", new c.a("interruptions_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("timeToFallAsleep_info_score", new c.a("timeToFallAsleep_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("timeToFallAsleep_info_status", new c.a("timeToFallAsleep_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("timeToWakeUp_info_score", new c.a("timeToWakeUp_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("timeToWakeUp_info_status", new c.a("timeToWakeUp_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("regularity_info_score", new c.a("regularity_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("regularity_info_status", new c.a("regularity_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("snoring_info_score", new c.a("snoring_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("snoring_info_status", new c.a("snoring_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("night_heartrate_info_score", new c.a("night_heartrate_info_score", "INTEGER", null, 0, 1, false));
            hashMap19.put("night_heartrate_info_status", new c.a("night_heartrate_info_status", "INTEGER", null, 0, 1, false));
            hashMap19.put("distance", new c.a("distance", "REAL", null, 0, 1, false));
            hashMap19.put("averageSpeed", new c.a("averageSpeed", "REAL", null, 0, 1, false));
            hashMap19.put("minSpeed", new c.a("minSpeed", "REAL", null, 0, 1, false));
            hashMap19.put("maxSpeed", new c.a("maxSpeed", "REAL", null, 0, 1, false));
            hashMap19.put("startLatitude", new c.a("startLatitude", "REAL", null, 0, 1, false));
            hashMap19.put("startLongitude", new c.a("startLongitude", "REAL", null, 0, 1, false));
            hashMap19.put("endLatitude", new c.a("endLatitude", "REAL", null, 0, 1, false));
            hashMap19.put("endLongitude", new c.a("endLongitude", "REAL", null, 0, 1, false));
            hashMap19.put("centerLatitude", new c.a("centerLatitude", "REAL", null, 0, 1, false));
            hashMap19.put("centerLongitude", new c.a("centerLongitude", "REAL", null, 0, 1, false));
            hashMap19.put("spanLatitudeDelta", new c.a("spanLatitudeDelta", "REAL", null, 0, 1, false));
            HashSet c17 = l0.c(hashMap19, "spanLongitudeDelta", new c.a("spanLongitudeDelta", "REAL", null, 0, 1, false), 0);
            HashSet hashSet7 = new HashSet(4);
            hashSet7.add(new c.d("index_Track_userId_day_category_startDate_deleted", false, Arrays.asList(NavigationArguments.USER_ID, FoodDayFragment.ARG_DAY, "category", "startDate", "deleted"), Arrays.asList("ASC", "ASC", "ASC", "ASC", "ASC")));
            hashSet7.add(new c.d("index_Track_userId_deviceType_startDate", false, Arrays.asList(NavigationArguments.USER_ID, "deviceType", "startDate"), Arrays.asList("ASC", "ASC", "ASC")));
            hashSet7.add(new c.d("index_Track_userId_isSyncedToWs", false, Arrays.asList(NavigationArguments.USER_ID, "isSyncedToWs"), Arrays.asList("ASC", "ASC")));
            hashSet7.add(new c.d("index_Track_userId_modifiedDate", false, Arrays.asList(NavigationArguments.USER_ID, "modifiedDate"), Arrays.asList("ASC", "ASC")));
            x8.c cVar20 = new x8.c("Track", hashMap19, c17, hashSet7);
            x8.c a31 = x8.c.a(cVar, "Track");
            if (!cVar20.equals(a31)) {
                return new c0.b(false, k0.i("Track(com.withings.wiscale2.track.data.Track).\n Expected:\n", cVar20, "\n Found:\n", a31));
            }
            HashMap hashMap20 = new HashMap(5);
            hashMap20.put("deviceId", new c.a("deviceId", "INTEGER", null, 1, 1, true));
            hashMap20.put("vasistasCategory", new c.a("vasistasCategory", "INTEGER", null, 2, 1, true));
            hashMap20.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap20.put("devicePriority", new c.a("devicePriority", "INTEGER", null, 0, 1, true));
            x8.c cVar21 = new x8.c("VasistasSource", hashMap20, l0.c(hashMap20, "timestamp", new c.a("timestamp", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a32 = x8.c.a(cVar, "VasistasSource");
            if (!cVar21.equals(a32)) {
                return new c0.b(false, k0.i("VasistasSource(com.withings.wiscale2.vasistas.model.VasistasSource).\n Expected:\n", cVar21, "\n Found:\n", a32));
            }
            HashMap hashMap21 = new HashMap(6);
            hashMap21.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap21.put("patientId", new c.a("patientId", "TEXT", null, 0, 1, true));
            hashMap21.put("startTime", new c.a("startTime", "INTEGER", null, 0, 1, true));
            hashMap21.put("endTime", new c.a("endTime", "INTEGER", null, 0, 1, true));
            hashMap21.put("ecgCount", new c.a("ecgCount", "INTEGER", null, 0, 1, true));
            HashSet c18 = l0.c(hashMap21, "workoutCount", new c.a("workoutCount", "INTEGER", null, 0, 1, true), 0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new c.d("index_PatientSession_id_patientId", false, Arrays.asList("id", "patientId"), Arrays.asList("ASC", "ASC")));
            x8.c cVar22 = new x8.c("PatientSession", hashMap21, c18, hashSet8);
            x8.c a33 = x8.c.a(cVar, "PatientSession");
            if (!cVar22.equals(a33)) {
                return new c0.b(false, k0.i("PatientSession(com.withings.clinicalstudy.repository.PatientSessionEntity).\n Expected:\n", cVar22, "\n Found:\n", a33));
            }
            HashMap hashMap22 = new HashMap(22);
            hashMap22.put("task_identifier", new c.a("task_identifier", "TEXT", null, 1, 1, true));
            hashMap22.put("identifier", new c.a("identifier", "TEXT", null, 0, 1, true));
            hashMap22.put("type", new c.a("type", "TEXT", null, 0, 1, false));
            hashMap22.put("title", new c.a("title", "TEXT", null, 0, 1, false));
            hashMap22.put("thumbnail", new c.a("thumbnail", "TEXT", null, 0, 1, false));
            hashMap22.put("required", new c.a("required", "INTEGER", null, 0, 1, false));
            hashMap22.put("tags_list", new c.a("tags_list", "TEXT", null, 0, 1, false));
            hashMap22.put("week_index", new c.a("week_index", "INTEGER", null, 0, 1, false));
            hashMap22.put("week_label", new c.a("week_label", "TEXT", null, 0, 1, false));
            hashMap22.put("day_index", new c.a("day_index", "INTEGER", null, 0, 1, false));
            hashMap22.put("day_label", new c.a("day_label", "TEXT", null, 0, 1, false));
            hashMap22.put("task_index", new c.a("task_index", "INTEGER", null, 0, 1, false));
            hashMap22.put("program_id", new c.a("program_id", "INTEGER", null, 0, 1, true));
            hashMap22.put("instance_id", new c.a("instance_id", "INTEGER", null, 0, 1, true));
            hashMap22.put("is_synced", new c.a("is_synced", "INTEGER", null, 0, 1, true));
            hashMap22.put("program_lastupdate", new c.a("program_lastupdate", "INTEGER", null, 0, 1, false));
            hashMap22.put("goal", new c.a("goal", "REAL", null, 0, 1, false));
            hashMap22.put("measureType", new c.a("measureType", "INTEGER", null, 0, 1, false));
            hashMap22.put("status", new c.a("status", "INTEGER", null, 0, 1, false));
            hashMap22.put("completion_date", new c.a("completion_date", "INTEGER", null, 0, 1, false));
            hashMap22.put("metadata", new c.a("metadata", "TEXT", null, 0, 1, false));
            x8.c cVar23 = new x8.c("program_task_preview", hashMap22, l0.c(hashMap22, "currentlySwapped", new c.a("currentlySwapped", "INTEGER", "false", 0, 1, true), 0), new HashSet(0));
            x8.c a34 = x8.c.a(cVar, "program_task_preview");
            if (!cVar23.equals(a34)) {
                return new c0.b(false, k0.i("program_task_preview(com.withings.programs.model.room.wifittask.ProgramTaskPreviewEntity).\n Expected:\n", cVar23, "\n Found:\n", a34));
            }
            HashMap hashMap23 = new HashMap(6);
            hashMap23.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap23.put("name", new c.a("name", "TEXT", null, 0, 1, true));
            hashMap23.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            hashMap23.put("deviceId", new c.a("deviceId", "INTEGER", null, 2, 1, true));
            hashMap23.put("deleted", new c.a("deleted", "INTEGER", null, 0, 1, true));
            x8.c cVar24 = new x8.c("DeviceScreensGroup", hashMap23, l0.c(hashMap23, "rank", new c.a("rank", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a35 = x8.c.a(cVar, "DeviceScreensGroup");
            if (!cVar24.equals(a35)) {
                return new c0.b(false, k0.i("DeviceScreensGroup(com.withings.screen.repository.data.model.DeviceScreensGroupEntity).\n Expected:\n", cVar24, "\n Found:\n", a35));
            }
            HashMap hashMap24 = new HashMap(19);
            hashMap24.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap24.put("date", new c.a("date", "INTEGER", null, 0, 1, true));
            hashMap24.put("completed", new c.a("completed", "INTEGER", null, 0, 1, true));
            hashMap24.put("type", new c.a("type", "TEXT", null, 0, 1, true));
            hashMap24.put("title", new c.a("title", "TEXT", null, 0, 1, true));
            hashMap24.put("extraHighlightInfo", new c.a("extraHighlightInfo", "TEXT", "NULL", 0, 1, false));
            hashMap24.put("thumbnail", new c.a("thumbnail", "TEXT", null, 0, 1, false));
            hashMap24.put("goal", new c.a("goal", "TEXT", null, 0, 1, false));
            hashMap24.put("crmid", new c.a("crmid", "TEXT", null, 0, 1, false));
            hashMap24.put("completionDate", new c.a("completionDate", "INTEGER", null, 0, 1, false));
            hashMap24.put("updatedDate", new c.a("updatedDate", "INTEGER", null, 0, 1, false));
            hashMap24.put("is_synced", new c.a("is_synced", "INTEGER", "false", 0, 1, true));
            hashMap24.put("capabilities", new c.a("capabilities", "TEXT", null, 0, 1, false));
            hashMap24.put("remote_program_task_id", new c.a("remote_program_task_id", "TEXT", null, 0, 1, false));
            hashMap24.put("remote_task_id", new c.a("remote_task_id", "TEXT", "''", 0, 1, true));
            hashMap24.put("status", new c.a("status", "INTEGER", null, 0, 1, false));
            hashMap24.put("metadata", new c.a("metadata", "TEXT", null, 0, 1, false));
            hashMap24.put("measureType", new c.a("measureType", "INTEGER", null, 0, 1, false));
            x8.c cVar25 = new x8.c("mission_task_preview", hashMap24, l0.c(hashMap24, "currentlySwapped", new c.a("currentlySwapped", "INTEGER", "false", 0, 1, true), 0), new HashSet(0));
            x8.c a36 = x8.c.a(cVar, "mission_task_preview");
            if (!cVar25.equals(a36)) {
                return new c0.b(false, k0.i("mission_task_preview(com.withings.missions.android.model.room.MissionTaskPreviewEntity).\n Expected:\n", cVar25, "\n Found:\n", a36));
            }
            HashMap hashMap25 = new HashMap(17);
            hashMap25.put("programid", new c.a("programid", "INTEGER", null, 1, 1, true));
            hashMap25.put("deployment", new c.a("deployment", "TEXT", null, 0, 1, true));
            hashMap25.put("target_type", new c.a("target_type", "INTEGER", null, 0, 1, true));
            hashMap25.put("target_value", new c.a("target_value", "TEXT", null, 0, 1, true));
            hashMap25.put(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, new c.a(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "INTEGER", null, 0, 1, true));
            hashMap25.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            hashMap25.put("visible", new c.a("visible", "INTEGER", null, 0, 1, true));
            hashMap25.put("familyid", new c.a("familyid", "INTEGER", null, 0, 1, false));
            hashMap25.put("specifics", new c.a("specifics", "TEXT", null, 0, 1, false));
            hashMap25.put("duration_json", new c.a("duration_json", "TEXT", null, 0, 1, false));
            hashMap25.put("eligibility", new c.a("eligibility", "TEXT", null, 0, 1, false));
            hashMap25.put("country_codes", new c.a("country_codes", "TEXT", null, 0, 1, false));
            hashMap25.put("data", new c.a("data", "TEXT", null, 0, 1, false));
            hashMap25.put("userid", new c.a("userid", "INTEGER", null, 0, 1, true));
            hashMap25.put("program_overview", new c.a("program_overview", "TEXT", null, 0, 1, false));
            hashMap25.put("is_suggested", new c.a("is_suggested", "INTEGER", "false", 0, 1, true));
            x8.c cVar26 = new x8.c("program", hashMap25, l0.c(hashMap25, "access_level", new c.a("access_level", "INTEGER", "0", 0, 1, true), 0), new HashSet(0));
            x8.c a37 = x8.c.a(cVar, "program");
            if (!cVar26.equals(a37)) {
                return new c0.b(false, k0.i("program(com.withings.programs.model.room.programcontent.ProgramDetailEntity).\n Expected:\n", cVar26, "\n Found:\n", a37));
            }
            HashMap hashMap26 = new HashMap(3);
            hashMap26.put("programid", new c.a("programid", "INTEGER", null, 1, 1, true));
            hashMap26.put("modified", new c.a("modified", "INTEGER", null, 0, 1, true));
            x8.c cVar27 = new x8.c("program_enrolled", hashMap26, l0.c(hashMap26, "userid", new c.a("userid", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a38 = x8.c.a(cVar, "program_enrolled");
            if (!cVar27.equals(a38)) {
                return new c0.b(false, k0.i("program_enrolled(com.withings.programs.model.room.programcontent.EnrolledProgramEntity).\n Expected:\n", cVar27, "\n Found:\n", a38));
            }
            HashMap hashMap27 = new HashMap(13);
            hashMap27.put("programid", new c.a("programid", "INTEGER", null, 0, 1, true));
            hashMap27.put("iteration", new c.a("iteration", "INTEGER", null, 0, 1, true));
            hashMap27.put("instanceid", new c.a("instanceid", "INTEGER", null, 0, 1, true));
            hashMap27.put("status", new c.a("status", "INTEGER", null, 0, 1, true));
            hashMap27.put("start", new c.a("start", "INTEGER", null, 0, 1, true));
            hashMap27.put("end", new c.a("end", "INTEGER", null, 0, 1, false));
            hashMap27.put("menu", new c.a("menu", "TEXT", null, 0, 1, false));
            hashMap27.put("summary", new c.a("summary", "TEXT", null, 0, 1, false));
            hashMap27.put("full_summary", new c.a("full_summary", "TEXT", null, 0, 1, false));
            hashMap27.put("progress", new c.a("progress", "INTEGER", null, 0, 1, false));
            hashMap27.put("unread", new c.a("unread", "INTEGER", null, 0, 1, false));
            hashMap27.put("program_sw_token", new c.a("program_sw_token", "TEXT", null, 0, 1, false));
            x8.c cVar28 = new x8.c("program_iteration", hashMap27, l0.c(hashMap27, "id", new c.a("id", "INTEGER", null, 1, 1, true), 0), new HashSet(0));
            x8.c a39 = x8.c.a(cVar, "program_iteration");
            if (!cVar28.equals(a39)) {
                return new c0.b(false, k0.i("program_iteration(com.withings.programs.model.room.programcontent.IterationProgramEntity).\n Expected:\n", cVar28, "\n Found:\n", a39));
            }
            HashMap hashMap28 = new HashMap(5);
            hashMap28.put(NavigationArguments.REMOTE_TASK_ID, new c.a(NavigationArguments.REMOTE_TASK_ID, "TEXT", null, 1, 1, true));
            hashMap28.put("isSync", new c.a("isSync", "INTEGER", null, 0, 1, true));
            hashMap28.put("isSelected", new c.a("isSelected", "INTEGER", null, 0, 1, true));
            hashMap28.put("updatedDate", new c.a("updatedDate", "INTEGER", null, 0, 1, true));
            x8.c cVar29 = new x8.c("bookmark", hashMap28, l0.c(hashMap28, "type", new c.a("type", "TEXT", null, 0, 1, true), 0), new HashSet(0));
            x8.c a41 = x8.c.a(cVar, "bookmark");
            if (!cVar29.equals(a41)) {
                return new c0.b(false, k0.i("bookmark(com.withings.favorite.model.room.entity.FavoriteEntity).\n Expected:\n", cVar29, "\n Found:\n", a41));
            }
            HashMap hashMap29 = new HashMap(6);
            hashMap29.put(NavigationArguments.REMOTE_TASK_ID, new c.a(NavigationArguments.REMOTE_TASK_ID, "TEXT", null, 1, 1, true));
            hashMap29.put("title", new c.a("title", "TEXT", null, 0, 1, true));
            hashMap29.put("extraHighlightInfo", new c.a("extraHighlightInfo", "TEXT", null, 0, 1, true));
            hashMap29.put("thumbnail", new c.a("thumbnail", "TEXT", null, 0, 1, true));
            hashMap29.put("capabilities", new c.a("capabilities", "TEXT", null, 0, 1, true));
            HashSet c19 = l0.c(hashMap29, "access_level", new c.a("access_level", "INTEGER", "0", 0, 1, true), 1);
            c19.add(new c.b("bookmark", "CASCADE", Arrays.asList(NavigationArguments.REMOTE_TASK_ID), "NO ACTION", Arrays.asList(NavigationArguments.REMOTE_TASK_ID)));
            x8.c cVar30 = new x8.c("bookmarkPreview", hashMap29, c19, new HashSet(0));
            x8.c a42 = x8.c.a(cVar, "bookmarkPreview");
            if (!cVar30.equals(a42)) {
                return new c0.b(false, k0.i("bookmarkPreview(com.withings.contentfavorite.model.room.ContentFavoriteEntity).\n Expected:\n", cVar30, "\n Found:\n", a42));
            }
            HashMap hashMap30 = new HashMap(4);
            hashMap30.put(NavigationArguments.CONTENT_ID, new c.a(NavigationArguments.CONTENT_ID, "TEXT", null, 1, 1, true));
            hashMap30.put("relatedProgramId", new c.a("relatedProgramId", "INTEGER", HealthConstants.FoodIntake.UNIT_TYPE_NOT_DEFINED, 2, 1, true));
            hashMap30.put("lastUpdate", new c.a("lastUpdate", "INTEGER", null, 0, 1, true));
            x8.c cVar31 = new x8.c("task_content", hashMap30, l0.c(hashMap30, "content", new c.a("content", "TEXT", null, 0, 1, true), 0), new HashSet(0));
            x8.c a43 = x8.c.a(cVar, "task_content");
            if (!cVar31.equals(a43)) {
                return new c0.b(false, k0.i("task_content(com.withings.taskcontent.room.TaskContentEntity).\n Expected:\n", cVar31, "\n Found:\n", a43));
            }
            HashMap hashMap31 = new HashMap(3);
            hashMap31.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 1, 1, true));
            hashMap31.put("workoutCategory", new c.a("workoutCategory", "INTEGER", null, 2, 1, true));
            x8.c cVar32 = new x8.c("ActirecCategoryDetection", hashMap31, l0.c(hashMap31, StreamManagement.Enabled.ELEMENT, new c.a(StreamManagement.Enabled.ELEMENT, "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a44 = x8.c.a(cVar, "ActirecCategoryDetection");
            if (!cVar32.equals(a44)) {
                return new c0.b(false, k0.i("ActirecCategoryDetection(com.withings.device.details.automatic.activity.detection.ActirecCategoryDetection).\n Expected:\n", cVar32, "\n Found:\n", a44));
            }
            HashMap hashMap32 = new HashMap(27);
            hashMap32.put(FoodDayFragment.ARG_DAY, new c.a(FoodDayFragment.ARG_DAY, "TEXT", null, 1, 1, true));
            hashMap32.put(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new c.a(HealthUserProfile.USER_PROFILE_KEY_USER_ID, "INTEGER", null, 2, 1, true));
            hashMap32.put("last_modified", new c.a("last_modified", "INTEGER", null, 0, 1, true));
            hashMap32.put("global", new c.a("global", "REAL", null, 0, 1, true));
            hashMap32.put("activity", new c.a("activity", "REAL", null, 0, 1, false));
            hashMap32.put("active_minutes", new c.a("active_minutes", "REAL", null, 0, 1, false));
            hashMap32.put("steps", new c.a("steps", "REAL", null, 0, 1, false));
            hashMap32.put(Message.BODY, new c.a(Message.BODY, "REAL", null, 0, 1, false));
            hashMap32.put("body_composition", new c.a("body_composition", "REAL", null, 0, 1, false));
            hashMap32.put("weight_engagement", new c.a("weight_engagement", "REAL", null, 0, 1, false));
            hashMap32.put("bmi", new c.a("bmi", "REAL", null, 0, 1, false));
            hashMap32.put("heart", new c.a("heart", "REAL", null, 0, 1, false));
            hashMap32.put("ecg_engagement", new c.a("ecg_engagement", "REAL", null, 0, 1, false));
            hashMap32.put("vascular_age", new c.a("vascular_age", "REAL", null, 0, 1, false));
            hashMap32.put("night_hr", new c.a("night_hr", "REAL", null, 0, 1, false));
            hashMap32.put("blood_pressure", new c.a("blood_pressure", "REAL", null, 0, 1, false));
            hashMap32.put("blood_pressure_burden", new c.a("blood_pressure_burden", "REAL", null, 0, 1, false));
            hashMap32.put("bpm_engagement", new c.a("bpm_engagement", "REAL", null, 0, 1, false));
            hashMap32.put("ecg_afib", new c.a("ecg_afib", "REAL", null, 0, 1, false));
            hashMap32.put("afib_burden", new c.a("afib_burden", "REAL", null, 0, 1, false));
            hashMap32.put("sleep", new c.a("sleep", "REAL", null, 0, 1, false));
            hashMap32.put("sleep_apnea_burden", new c.a("sleep_apnea_burden", "REAL", null, 0, 1, false));
            hashMap32.put("sleep_quality", new c.a("sleep_quality", "REAL", null, 0, 1, false));
            hashMap32.put("sleep_monitoring", new c.a("sleep_monitoring", "REAL", null, 0, 1, false));
            hashMap32.put(WsVasistasSerie.KEY_ALGO, new c.a(WsVasistasSerie.KEY_ALGO, "INTEGER", "0", 0, 1, true));
            hashMap32.put("synced", new c.a("synced", "INTEGER", null, 0, 1, true));
            x8.c cVar33 = new x8.c("HealthScore", hashMap32, l0.c(hashMap32, "valid", new c.a("valid", "INTEGER", "true", 0, 1, true), 0), new HashSet(0));
            x8.c a45 = x8.c.a(cVar, "HealthScore");
            if (!cVar33.equals(a45)) {
                return new c0.b(false, k0.i("HealthScore(com.withings.health.score.android.database.model.HealthScoreEntity).\n Expected:\n", cVar33, "\n Found:\n", a45));
            }
            HashMap hashMap33 = new HashMap(3);
            hashMap33.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap33.put(Constants.ScionAnalytics.PARAM_LABEL, new c.a(Constants.ScionAnalytics.PARAM_LABEL, "TEXT", null, 0, 1, true));
            x8.c cVar34 = new x8.c("libraryFilter", hashMap33, l0.c(hashMap33, NavigationArguments.TASK_TYPE, new c.a(NavigationArguments.TASK_TYPE, "TEXT", null, 0, 1, true), 0), new HashSet(0));
            x8.c a46 = x8.c.a(cVar, "libraryFilter");
            if (!cVar34.equals(a46)) {
                return new c0.b(false, k0.i("libraryFilter(com.withings.healthplus.library.android.model.room.LibraryFilterEntity).\n Expected:\n", cVar34, "\n Found:\n", a46));
            }
            HashMap hashMap34 = new HashMap(9);
            hashMap34.put(NavigationArguments.CONTENT_ID, new c.a(NavigationArguments.CONTENT_ID, "TEXT", null, 1, 1, true));
            hashMap34.put(NavigationArguments.TASK_TYPE, new c.a(NavigationArguments.TASK_TYPE, "TEXT", null, 0, 1, true));
            hashMap34.put("title", new c.a("title", "TEXT", null, 0, 1, true));
            hashMap34.put("thumbnail", new c.a("thumbnail", "TEXT", null, 0, 1, true));
            hashMap34.put("capabilities", new c.a("capabilities", "TEXT", null, 0, 1, true));
            hashMap34.put("extraHighlightInfo", new c.a("extraHighlightInfo", "TEXT", null, 0, 1, true));
            hashMap34.put("isSuggested", new c.a("isSuggested", "INTEGER", "false", 0, 1, true));
            hashMap34.put("access_level", new c.a("access_level", "INTEGER", "0", 0, 1, true));
            x8.c cVar35 = new x8.c("libraryPreviewContent", hashMap34, l0.c(hashMap34, "event_info", new c.a("event_info", "TEXT", "'[]'", 0, 1, true), 0), new HashSet(0));
            x8.c a47 = x8.c.a(cVar, "libraryPreviewContent");
            if (!cVar35.equals(a47)) {
                return new c0.b(false, k0.i("libraryPreviewContent(com.withings.healthplus.library.android.model.room.LibraryContentPreviewEntity).\n Expected:\n", cVar35, "\n Found:\n", a47));
            }
            HashMap hashMap35 = new HashMap(2);
            hashMap35.put(NavigationArguments.CONTENT_ID, new c.a(NavigationArguments.CONTENT_ID, "TEXT", null, 1, 1, true));
            HashSet c21 = l0.c(hashMap35, "filterId", new c.a("filterId", "INTEGER", null, 2, 1, true), 2);
            c21.add(new c.b("libraryFilter", "CASCADE", Arrays.asList("filterId"), "NO ACTION", Arrays.asList("id")));
            c21.add(new c.b("libraryPreviewContent", "CASCADE", Arrays.asList(NavigationArguments.CONTENT_ID), "NO ACTION", Arrays.asList(NavigationArguments.CONTENT_ID)));
            x8.c cVar36 = new x8.c("libraryPreviewContentWithFilter", hashMap35, c21, new HashSet(0));
            x8.c a48 = x8.c.a(cVar, "libraryPreviewContentWithFilter");
            if (!cVar36.equals(a48)) {
                return new c0.b(false, k0.i("libraryPreviewContentWithFilter(com.withings.healthplus.library.android.model.room.LibraryContentPreviewWithFilterEntity).\n Expected:\n", cVar36, "\n Found:\n", a48));
            }
            HashMap hashMap36 = new HashMap(7);
            hashMap36.put("id", new c.a("id", "INTEGER", null, 1, 1, true));
            hashMap36.put("accountId", new c.a("accountId", "INTEGER", null, 0, 1, false));
            hashMap36.put("deviceId", new c.a("deviceId", "INTEGER", null, 0, 1, false));
            hashMap36.put("state", new c.a("state", "TEXT", null, 0, 1, true));
            hashMap36.put("type", new c.a("type", "INTEGER", null, 0, 1, true));
            hashMap36.put("startDate", new c.a("startDate", "INTEGER", null, 0, 1, false));
            x8.c cVar37 = new x8.c("Plan", hashMap36, l0.c(hashMap36, "modified", new c.a("modified", "INTEGER", null, 0, 1, false), 0), new HashSet(0));
            x8.c a49 = x8.c.a(cVar, "Plan");
            if (!cVar37.equals(a49)) {
                return new c0.b(false, k0.i("Plan(com.withings.plan.android.model.PlanEntity).\n Expected:\n", cVar37, "\n Found:\n", a49));
            }
            HashMap hashMap37 = new HashMap(8);
            hashMap37.put("wsId", new c.a("wsId", "INTEGER", null, 1, 1, true));
            hashMap37.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap37.put("type", new c.a("type", "INTEGER", null, 0, 1, true));
            hashMap37.put("start", new c.a("start", "INTEGER", null, 0, 1, true));
            hashMap37.put("end", new c.a("end", "INTEGER", null, 0, 1, true));
            hashMap37.put("active", new c.a("active", "INTEGER", null, 0, 1, true));
            hashMap37.put(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, new c.a(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "INTEGER", null, 0, 1, true));
            x8.c cVar38 = new x8.c("prediction", hashMap37, l0.c(hashMap37, "modified", new c.a("modified", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a51 = x8.c.a(cVar, "prediction");
            if (!cVar38.equals(a51)) {
                return new c0.b(false, k0.i("prediction(com.withings.prediction.local.model.PredictionEntity).\n Expected:\n", cVar38, "\n Found:\n", a51));
            }
            HashMap hashMap38 = new HashMap(13);
            hashMap38.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap38.put("crm_id", new c.a("crm_id", "TEXT", null, 0, 1, true));
            hashMap38.put(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new c.a(HealthUserProfile.USER_PROFILE_KEY_USER_ID, "INTEGER", null, 0, 1, true));
            hashMap38.put("object_structure", new c.a("object_structure", "TEXT", null, 0, 1, true));
            hashMap38.put("object_type", new c.a("object_type", "INTEGER", null, 0, 1, true));
            hashMap38.put("object_id", new c.a("object_id", "INTEGER", null, 0, 1, false));
            hashMap38.put("timestamp", new c.a("timestamp", "INTEGER", null, 0, 1, true));
            hashMap38.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, new c.a(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "INTEGER", null, 0, 1, true));
            hashMap38.put("expiration_date", new c.a("expiration_date", "INTEGER", null, 0, 1, true));
            hashMap38.put("url", new c.a("url", "TEXT", null, 0, 1, true));
            hashMap38.put("title", new c.a("title", "TEXT", null, 0, 1, true));
            hashMap38.put(HealthConstants.FoodInfo.DESCRIPTION, new c.a(HealthConstants.FoodInfo.DESCRIPTION, "TEXT", null, 0, 1, true));
            x8.c cVar39 = new x8.c("HealthInsight", hashMap38, l0.c(hashMap38, ConstantsWs.JSON_ACCOUNT_KEY_CREATED, new c.a(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a52 = x8.c.a(cVar, "HealthInsight");
            if (!cVar39.equals(a52)) {
                return new c0.b(false, k0.i("HealthInsight(com.withings.insight.android.entity.HealthInsightDb).\n Expected:\n", cVar39, "\n Found:\n", a52));
            }
            HashMap hashMap39 = new HashMap(11);
            hashMap39.put("id", new c.a("id", "INTEGER", null, 1, 1, false));
            hashMap39.put("wsId", new c.a("wsId", "INTEGER", null, 0, 1, false));
            hashMap39.put(NavigationArguments.USER_ID, new c.a(NavigationArguments.USER_ID, "INTEGER", null, 0, 1, true));
            hashMap39.put("type", new c.a("type", "INTEGER", null, 0, 1, true));
            hashMap39.put("start", new c.a("start", "INTEGER", null, 0, 1, true));
            hashMap39.put("end", new c.a("end", "INTEGER", null, 0, 1, false));
            hashMap39.put("numberOfPills", new c.a("numberOfPills", "INTEGER", null, 0, 1, false));
            hashMap39.put("deleted", new c.a("deleted", "INTEGER", null, 0, 1, false));
            hashMap39.put("deletionDate", new c.a("deletionDate", "INTEGER", null, 0, 1, false));
            hashMap39.put(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, new c.a(ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "INTEGER", null, 0, 1, true));
            x8.c cVar40 = new x8.c("factor", hashMap39, l0.c(hashMap39, "modified", new c.a("modified", "INTEGER", null, 0, 1, true), 0), new HashSet(0));
            x8.c a53 = x8.c.a(cVar, "factor");
            if (!cVar40.equals(a53)) {
                return new c0.b(false, k0.i("factor(com.withings.factor.local.model.FactorEntity).\n Expected:\n", cVar40, "\n Found:\n", a53));
            }
            x8.e eVar = new x8.e("BookmarkPreviewView", "CREATE VIEW `BookmarkPreviewView` AS SELECT bookmark.remoteTaskId, bookmark.isSync, bookmark.isSelected, bookmark.updatedDate, bookmark.type, bookmarkPreview.title as title, bookmarkPreview.access_level as accessLevel, bookmarkPreview.extraHighlightInfo as extraHighlightInfo, bookmarkPreview.thumbnail as thumbnail, bookmarkPreview.capabilities as capabilities FROM bookmark INNER JOIN bookmarkPreview ON bookmark.remoteTaskId = bookmarkPreview.remoteTaskId");
            x8.e a54 = x8.e.a(cVar);
            if (!eVar.equals(a54)) {
                return new c0.b(false, "BookmarkPreviewView(com.withings.contentfavorite.model.room.BookmarkPreviewView).\n Expected:\n" + eVar + "\n Found:\n" + a54);
            }
            return new c0.b(true, null);
        }
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final a30.o A0() {
        a30.p pVar;
        if (this.f50636k0 != null) {
            return this.f50636k0;
        }
        synchronized (this) {
            try {
                if (this.f50636k0 == null) {
                    this.f50636k0 = new a30.p(this);
                }
                pVar = this.f50636k0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final a30.q B0() {
        a30.r rVar;
        if (this.W != null) {
            return this.W;
        }
        synchronized (this) {
            try {
                if (this.W == null) {
                    this.W = new a30.r(this);
                }
                rVar = this.W;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final ei0.m C0() {
        ei0.n nVar;
        if (this.S != null) {
            return this.S;
        }
        synchronized (this) {
            try {
                if (this.S == null) {
                    this.S = new ei0.n(this);
                }
                nVar = this.S;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final TargetDAO D0() {
        TargetDAO_ProdRoomDb_Impl targetDAO_ProdRoomDb_Impl;
        if (this.T != null) {
            return this.T;
        }
        synchronized (this) {
            try {
                if (this.T == null) {
                    this.T = new TargetDAO_ProdRoomDb_Impl(this);
                }
                targetDAO_ProdRoomDb_Impl = this.T;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return targetDAO_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final f60.a E0() {
        f60.b bVar;
        if (this.f50630e0 != null) {
            return this.f50630e0;
        }
        synchronized (this) {
            try {
                if (this.f50630e0 == null) {
                    this.f50630e0 = new f60.b(this);
                }
                bVar = this.f50630e0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final bj0.f F0() {
        bj0.g gVar;
        if (this.U != null) {
            return this.U;
        }
        synchronized (this) {
            try {
                if (this.U == null) {
                    this.U = new bj0.g(this);
                }
                gVar = this.U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final lj0.l0 G0() {
        m0 m0Var;
        if (this.V != null) {
            return this.V;
        }
        synchronized (this) {
            try {
                if (this.V == null) {
                    this.V = new m0(this);
                }
                m0Var = this.V;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m0Var;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final com.withings.device.details.automatic.activity.detection.b T() {
        com.withings.device.details.automatic.activity.detection.c cVar;
        if (this.f50631f0 != null) {
            return this.f50631f0;
        }
        synchronized (this) {
            try {
                if (this.f50631f0 == null) {
                    this.f50631f0 = new com.withings.device.details.automatic.activity.detection.c(this);
                }
                cVar = this.f50631f0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final pl.a U() {
        pl.b bVar;
        if (this.f50629d0 != null) {
            return this.f50629d0;
        }
        synchronized (this) {
            try {
                if (this.f50629d0 == null) {
                    this.f50629d0 = new pl.b(this);
                }
                bVar = this.f50629d0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final DeviceScreenContentDao V() {
        DeviceScreenContentDao_ProdRoomDb_Impl deviceScreenContentDao_ProdRoomDb_Impl;
        if (this.Y != null) {
            return this.Y;
        }
        synchronized (this) {
            try {
                if (this.Y == null) {
                    this.Y = new DeviceScreenContentDao_ProdRoomDb_Impl(this);
                }
                deviceScreenContentDao_ProdRoomDb_Impl = this.Y;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceScreenContentDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final DeviceScreenDao W() {
        DeviceScreenDao_ProdRoomDb_Impl deviceScreenDao_ProdRoomDb_Impl;
        if (this.X != null) {
            return this.X;
        }
        synchronized (this) {
            try {
                if (this.X == null) {
                    this.X = new DeviceScreenDao_ProdRoomDb_Impl(this);
                }
                deviceScreenDao_ProdRoomDb_Impl = this.X;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceScreenDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final DeviceScreensGroupDao X() {
        DeviceScreensGroupDao_ProdRoomDb_Impl deviceScreensGroupDao_ProdRoomDb_Impl;
        if (this.Z != null) {
            return this.Z;
        }
        synchronized (this) {
            try {
                if (this.Z == null) {
                    this.Z = new DeviceScreensGroupDao_ProdRoomDb_Impl(this);
                }
                deviceScreensGroupDao_ProdRoomDb_Impl = this.Z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceScreensGroupDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final HeartSignalDao Y() {
        HeartSignalDao_ProdRoomDb_Impl heartSignalDao_ProdRoomDb_Impl;
        if (this.D != null) {
            return this.D;
        }
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = new HeartSignalDao_ProdRoomDb_Impl(this);
                }
                heartSignalDao_ProdRoomDb_Impl = this.D;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return heartSignalDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final a30.a Z() {
        a30.b bVar;
        if (this.f50637l0 != null) {
            return this.f50637l0;
        }
        synchronized (this) {
            try {
                if (this.f50637l0 == null) {
                    this.f50637l0 = new a30.b(this);
                }
                bVar = this.f50637l0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final yb0.a a0() {
        yb0.b bVar;
        if (this.E != null) {
            return this.E;
        }
        synchronized (this) {
            try {
                if (this.E == null) {
                    this.E = new yb0.b(this);
                }
                bVar = this.E;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final FactorDao b0() {
        FactorDao_ProdRoomDb_Impl factorDao_ProdRoomDb_Impl;
        if (this.f50642q0 != null) {
            return this.f50642q0;
        }
        synchronized (this) {
            try {
                if (this.f50642q0 == null) {
                    this.f50642q0 = new FactorDao_ProdRoomDb_Impl(this);
                }
                factorDao_ProdRoomDb_Impl = this.f50642q0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return factorDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final mr.a c0() {
        mr.b bVar;
        if (this.f50628c0 != null) {
            return this.f50628c0;
        }
        synchronized (this) {
            try {
                if (this.f50628c0 == null) {
                    this.f50628c0 = new mr.b(this);
                }
                bVar = this.f50628c0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    public final void d() {
        a();
        z8.b writableDatabase = m().getWritableDatabase();
        try {
            c();
            writableDatabase.l("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.l("DELETE FROM `DeviceScreen`");
            writableDatabase.l("DELETE FROM `DeviceScreenContent`");
            writableDatabase.l("DELETE FROM `Event`");
            writableDatabase.l("DELETE FROM `WorkoutLocation`");
            writableDatabase.l("DELETE FROM `EcgMeasurement`");
            writableDatabase.l("DELETE FROM `HealthmateSessionData`");
            writableDatabase.l("DELETE FROM `Insight`");
            writableDatabase.l("DELETE FROM `leaderboard`");
            writableDatabase.l("DELETE FROM `Meal`");
            writableDatabase.l("DELETE FROM `MealName`");
            writableDatabase.l("DELETE FROM `Mood`");
            writableDatabase.l("DELETE FROM `PartnerExchangeLastUpdate`");
            writableDatabase.l("DELETE FROM `PlatformFeature`");
            writableDatabase.l("DELETE FROM `HealthAttributes`");
            writableDatabase.l("DELETE FROM `NoteEntity`");
            writableDatabase.l("DELETE FROM `NoteGroup`");
            writableDatabase.l("DELETE FROM `Tag`");
            writableDatabase.l("DELETE FROM `Target`");
            writableDatabase.l("DELETE FROM `Track`");
            writableDatabase.l("DELETE FROM `VasistasSource`");
            writableDatabase.l("DELETE FROM `PatientSession`");
            writableDatabase.l("DELETE FROM `program_task_preview`");
            writableDatabase.l("DELETE FROM `DeviceScreensGroup`");
            writableDatabase.l("DELETE FROM `mission_task_preview`");
            writableDatabase.l("DELETE FROM `program`");
            writableDatabase.l("DELETE FROM `program_enrolled`");
            writableDatabase.l("DELETE FROM `program_iteration`");
            writableDatabase.l("DELETE FROM `bookmark`");
            writableDatabase.l("DELETE FROM `bookmarkPreview`");
            writableDatabase.l("DELETE FROM `task_content`");
            writableDatabase.l("DELETE FROM `ActirecCategoryDetection`");
            writableDatabase.l("DELETE FROM `HealthScore`");
            writableDatabase.l("DELETE FROM `libraryFilter`");
            writableDatabase.l("DELETE FROM `libraryPreviewContent`");
            writableDatabase.l("DELETE FROM `libraryPreviewContentWithFilter`");
            writableDatabase.l("DELETE FROM `Plan`");
            writableDatabase.l("DELETE FROM `prediction`");
            writableDatabase.l("DELETE FROM `HealthInsight`");
            writableDatabase.l("DELETE FROM `factor`");
            z();
        } finally {
            h();
            writableDatabase.L1("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.m2()) {
                writableDatabase.l("VACUUM");
            }
        }
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final RoomGpsLocationDao d0() {
        RoomGpsLocationDao_ProdRoomDb_Impl roomGpsLocationDao_ProdRoomDb_Impl;
        if (this.F != null) {
            return this.F;
        }
        synchronized (this) {
            try {
                if (this.F == null) {
                    this.F = new RoomGpsLocationDao_ProdRoomDb_Impl(this);
                }
                roomGpsLocationDao_ProdRoomDb_Impl = this.F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return roomGpsLocationDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final mx.a e0() {
        mx.b bVar;
        if (this.G != null) {
            return this.G;
        }
        synchronized (this) {
            try {
                if (this.G == null) {
                    this.G = new mx.b(this);
                }
                bVar = this.G;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    protected final androidx.room.p f() {
        HashMap hashMap = new HashMap(0);
        HashMap hashMap2 = new HashMap(1);
        HashSet hashSet = new HashSet(2);
        hashSet.add("bookmark");
        hashSet.add("bookmarkPreview");
        hashMap2.put("bookmarkpreviewview", hashSet);
        return new androidx.room.p(this, hashMap, hashMap2, "DeviceScreen", "DeviceScreenContent", "Event", "WorkoutLocation", "EcgMeasurement", "HealthmateSessionData", "Insight", "leaderboard", "Meal", "MealName", "Mood", "PartnerExchangeLastUpdate", "PlatformFeature", "HealthAttributes", "NoteEntity", "NoteGroup", "Tag", "Target", "Track", "VasistasSource", "PatientSession", "program_task_preview", "DeviceScreensGroup", "mission_task_preview", "program", "program_enrolled", "program_iteration", "bookmark", "bookmarkPreview", "task_content", "ActirecCategoryDetection", "HealthScore", "libraryFilter", "libraryPreviewContent", "libraryPreviewContentWithFilter", "Plan", "prediction", "HealthInsight", "factor");
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final fw.a f0() {
        fw.b bVar;
        if (this.f50641p0 != null) {
            return this.f50641p0;
        }
        synchronized (this) {
            try {
                if (this.f50641p0 == null) {
                    this.f50641p0 = new fw.b(this);
                }
                bVar = this.f50641p0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    protected final z8.c g(androidx.room.h hVar) {
        androidx.room.c0 c0Var = new androidx.room.c0(hVar, new a(), "ec7d549c0b94449b475a52e284d963d4", "1f26403312dfcd91b97f10370409cbae");
        Context context = hVar.f18205a;
        kotlin.jvm.internal.u.j(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(hVar.f18206b);
        aVar.c(c0Var);
        return hVar.f18207c.a(aVar.b());
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final bv.a g0() {
        bv.c cVar;
        if (this.f50633h0 != null) {
            return this.f50633h0;
        }
        synchronized (this) {
            try {
                if (this.f50633h0 == null) {
                    this.f50633h0 = new bv.c(this);
                }
                cVar = this.f50633h0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final gt.a h0() {
        gt.b bVar;
        if (this.f50632g0 != null) {
            return this.f50632g0;
        }
        synchronized (this) {
            try {
                if (this.f50632g0 == null) {
                    this.f50632g0 = new gt.b(this);
                }
                bVar = this.f50632g0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    public final List i(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.withings.wiscale2.data.a(0));
        arrayList.add(new b(0));
        arrayList.add(new c(0));
        arrayList.add(new d(0));
        arrayList.add(new e(0));
        arrayList.add(new f(0));
        arrayList.add(new g(0));
        arrayList.add(new h(0));
        arrayList.add(new i(0));
        arrayList.add(new j(0));
        arrayList.add(new k(0));
        arrayList.add(new l());
        arrayList.add(new m(0));
        arrayList.add(new n(0));
        arrayList.add(new w8.b(93, 94));
        arrayList.add(new p(0));
        arrayList.add(new q(0));
        arrayList.add(new r(0));
        return arrayList;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final yf.g i0() {
        yf.h hVar;
        if (this.H != null) {
            return this.H;
        }
        synchronized (this) {
            try {
                if (this.H == null) {
                    this.H = new yf.h(this);
                }
                hVar = this.H;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final fw.c j0() {
        fw.d dVar;
        if (this.I != null) {
            return this.I;
        }
        synchronized (this) {
            try {
                if (this.I == null) {
                    this.I = new fw.d(this);
                }
                dVar = this.I;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final LeaderboardDAO k0() {
        LeaderboardDAO_ProdRoomDb_Impl leaderboardDAO_ProdRoomDb_Impl;
        if (this.J != null) {
            return this.J;
        }
        synchronized (this) {
            try {
                if (this.J == null) {
                    this.J = new LeaderboardDAO_ProdRoomDb_Impl(this);
                }
                leaderboardDAO_ProdRoomDb_Impl = this.J;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return leaderboardDAO_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final MealDao l0() {
        MealDao_ProdRoomDb_Impl mealDao_ProdRoomDb_Impl;
        if (this.K != null) {
            return this.K;
        }
        synchronized (this) {
            try {
                if (this.K == null) {
                    this.K = new MealDao_ProdRoomDb_Impl(this);
                }
                mealDao_ProdRoomDb_Impl = this.K;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mealDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final MealNameDao m0() {
        MealNameDao_ProdRoomDb_Impl mealNameDao_ProdRoomDb_Impl;
        if (this.L != null) {
            return this.L;
        }
        synchronized (this) {
            try {
                if (this.L == null) {
                    this.L = new MealNameDao_ProdRoomDb_Impl(this);
                }
                mealNameDao_ProdRoomDb_Impl = this.L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mealNameDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final tz.a n0() {
        tz.b bVar;
        if (this.f50626a0 != null) {
            return this.f50626a0;
        }
        synchronized (this) {
            try {
                if (this.f50626a0 == null) {
                    this.f50626a0 = new tz.b(this);
                }
                bVar = this.f50626a0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<? extends w8.a>> o() {
        return new HashSet();
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final lx.a o0() {
        lx.b bVar;
        if (this.N != null) {
            return this.N;
        }
        synchronized (this) {
            try {
                if (this.N == null) {
                    this.N = new lx.b(this);
                }
                bVar = this.N;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // androidx.room.RoomDatabase
    protected final Map<Class<?>, List<Class<?>>> p() {
        HashMap hashMap = new HashMap();
        hashMap.put(HeartSignalDao.class, HeartSignalDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(yb0.a.class, Collections.emptyList());
        hashMap.put(RoomGpsLocationDao.class, RoomGpsLocationDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(mx.a.class, Collections.emptyList());
        hashMap.put(yf.g.class, Collections.emptyList());
        hashMap.put(fw.c.class, Collections.emptyList());
        hashMap.put(LeaderboardDAO.class, LeaderboardDAO_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(MealDao.class, MealDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(MealNameDao.class, MealNameDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(nx.b.class, Collections.emptyList());
        hashMap.put(lx.a.class, Collections.emptyList());
        hashMap.put(NoteGroupDao.class, NoteGroupDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(u10.x.class, Collections.emptyList());
        hashMap.put(PatientSessionDao.class, PatientSessionDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(PlatformTagDao.class, PlatformTagDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(PlatformFeatureDao.class, PlatformFeatureDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(ei0.m.class, Collections.emptyList());
        hashMap.put(TargetDAO.class, TargetDAO_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(bj0.f.class, Collections.emptyList());
        hashMap.put(lj0.l0.class, Collections.emptyList());
        hashMap.put(a30.q.class, Collections.emptyList());
        hashMap.put(DeviceScreenDao.class, DeviceScreenDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(DeviceScreenContentDao.class, DeviceScreenContentDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(DeviceScreensGroupDao.class, DeviceScreensGroupDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(tz.a.class, Collections.emptyList());
        hashMap.put(a30.f.class, Collections.emptyList());
        hashMap.put(mr.a.class, Collections.emptyList());
        hashMap.put(pl.a.class, Collections.emptyList());
        hashMap.put(f60.a.class, Collections.emptyList());
        hashMap.put(com.withings.device.details.automatic.activity.detection.b.class, Collections.emptyList());
        hashMap.put(gt.a.class, Collections.emptyList());
        hashMap.put(bv.a.class, Collections.emptyList());
        hashMap.put(a30.j.class, Collections.emptyList());
        hashMap.put(a30.l.class, Collections.emptyList());
        hashMap.put(a30.o.class, Collections.emptyList());
        hashMap.put(a30.a.class, Collections.emptyList());
        hashMap.put(a30.c.class, Collections.emptyList());
        hashMap.put(a30.d.class, Collections.emptyList());
        hashMap.put(i20.a.class, Collections.emptyList());
        hashMap.put(PredictionDao.class, PredictionDao_ProdRoomDb_Impl.getRequiredConverters());
        hashMap.put(fw.a.class, Collections.emptyList());
        hashMap.put(FactorDao.class, FactorDao_ProdRoomDb_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final nx.b p0() {
        nx.c cVar;
        if (this.M != null) {
            return this.M;
        }
        synchronized (this) {
            try {
                if (this.M == null) {
                    this.M = new nx.c(this);
                }
                cVar = this.M;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final NoteGroupDao q0() {
        NoteGroupDao_ProdRoomDb_Impl noteGroupDao_ProdRoomDb_Impl;
        if (this.O != null) {
            return this.O;
        }
        synchronized (this) {
            try {
                if (this.O == null) {
                    this.O = new NoteGroupDao_ProdRoomDb_Impl(this);
                }
                noteGroupDao_ProdRoomDb_Impl = this.O;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return noteGroupDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final u10.x r0() {
        u10.y yVar;
        if (this.P != null) {
            return this.P;
        }
        synchronized (this) {
            try {
                if (this.P == null) {
                    this.P = new u10.y(this);
                }
                yVar = this.P;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final PatientSessionDao s0() {
        PatientSessionDao_ProdRoomDb_Impl patientSessionDao_ProdRoomDb_Impl;
        if (this.Q != null) {
            return this.Q;
        }
        synchronized (this) {
            try {
                if (this.Q == null) {
                    this.Q = new PatientSessionDao_ProdRoomDb_Impl(this);
                }
                patientSessionDao_ProdRoomDb_Impl = this.Q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return patientSessionDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final i20.a t0() {
        i20.b bVar;
        if (this.f50639n0 != null) {
            return this.f50639n0;
        }
        synchronized (this) {
            try {
                if (this.f50639n0 == null) {
                    this.f50639n0 = new i20.b(this);
                }
                bVar = this.f50639n0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final PlatformFeatureDao u0() {
        PlatformFeatureDao_ProdRoomDb_Impl platformFeatureDao_ProdRoomDb_Impl;
        if (this.R != null) {
            return this.R;
        }
        synchronized (this) {
            try {
                if (this.R == null) {
                    this.R = new PlatformFeatureDao_ProdRoomDb_Impl(this);
                }
                platformFeatureDao_ProdRoomDb_Impl = this.R;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return platformFeatureDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final PredictionDao v0() {
        PredictionDao_ProdRoomDb_Impl predictionDao_ProdRoomDb_Impl;
        if (this.f50640o0 != null) {
            return this.f50640o0;
        }
        synchronized (this) {
            try {
                if (this.f50640o0 == null) {
                    this.f50640o0 = new PredictionDao_ProdRoomDb_Impl(this);
                }
                predictionDao_ProdRoomDb_Impl = this.f50640o0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return predictionDao_ProdRoomDb_Impl;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final a30.d w0() {
        a30.e eVar;
        if (this.f50638m0 != null) {
            return this.f50638m0;
        }
        synchronized (this) {
            try {
                if (this.f50638m0 == null) {
                    this.f50638m0 = new a30.e(this);
                }
                eVar = this.f50638m0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final a30.f x0() {
        a30.h hVar;
        if (this.f50627b0 != null) {
            return this.f50627b0;
        }
        synchronized (this) {
            try {
                if (this.f50627b0 == null) {
                    this.f50627b0 = new a30.h(this);
                }
                hVar = this.f50627b0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final a30.j y0() {
        a30.k kVar;
        if (this.f50634i0 != null) {
            return this.f50634i0;
        }
        synchronized (this) {
            try {
                if (this.f50634i0 == null) {
                    this.f50634i0 = new a30.k(this);
                }
                kVar = this.f50634i0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // com.withings.wiscale2.data.ProdRoomDb
    public final a30.l z0() {
        a30.n nVar;
        if (this.f50635j0 != null) {
            return this.f50635j0;
        }
        synchronized (this) {
            try {
                if (this.f50635j0 == null) {
                    this.f50635j0 = new a30.n(this);
                }
                nVar = this.f50635j0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}
