/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package androidx.appactions.interaction.capabilities.core.task.impl

import androidx.annotation.RestrictTo

/**
 * Contains either an AssistantUpdateRequest or a TouchEventUpdateRequest
 *
 * @hide
 */
@RestrictTo(RestrictTo.Scope.LIBRARY)
class UpdateRequest
private constructor(
    val assistantRequest: AssistantUpdateRequest?,
    val touchEventRequest: TouchEventUpdateRequest?,
) {
    constructor(assistantRequest: AssistantUpdateRequest) : this(assistantRequest, null)

    constructor(touchEventRequest: TouchEventUpdateRequest) : this(null, touchEventRequest)
}