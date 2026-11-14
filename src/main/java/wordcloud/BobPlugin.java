package wordcloud;

import bobthebuildtool.pojos.buildfile.Project;
import bobthebuildtool.pojos.error.VersionTooOld;

import static bobthebuildtool.services.Update.requireBobVersion;
import static wordcloud.WordCloudCommand.DESCRIPTION;

/**
 * The {@code BobPlugin} enum.
 */
public enum BobPlugin {;

    /**
     * Performs the {@code installPlugin} operation.
     *
     * @param project the project
     * @throws VersionTooOld if the operation fails
     */
    public static void installPlugin(final Project project) throws VersionTooOld {
        requireBobVersion("5");
        project.addCommand("wordcloud", DESCRIPTION, WordCloudCommand::run);
    }

}
