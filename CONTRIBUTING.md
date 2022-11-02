# Contributing

Thanks for looking at contributing! We welcome contributions from anyone. If they address [issues](../../issues) we’ve listed, even better! Please note that this repo has a [Creative Commons Attribution-ShareAlike 4.0 International](LICENCE.txt) attached.

The default branch is protected, so changes must be made via a pull request. To contribute, please create your changes on a branch and create a pull request. If you’re a member of @bootcamp-delivery-team then you can push your branch to this repo. We prefer this mechanism to forking, but feel free to fork if you don’t have access to push here.

If your change relates to an issue, then please [link your commit(s) or PR to the issue](https://docs.github.com/en/issues/tracking-your-work-with-issues/linking-a-pull-request-to-an-issue). This way GitHub will close it once the PR is merged.

## Pull Request Process

1. Make sure your changes build with Jekyll locally and review how they look before you push
2. You will be able to merge the Pull Request in once one of the code owners have approved your changes
3. Once merged, your changes will be published around 10–60 seconds

## Working with the slides

The slides are stored as Markdown files in `docs/_posts` and are presented using a combination of Jekyll and [reveal.js](https://revealjs.com/#/). A [remote Jekyll theme](https://github.com/autotraderuk/jekyll-revealjs) is used to help make changes to the Jekyll code centrally.

The easiest way to preview your changes locally is to use Docker to run Jekyll. To do this, [install Docker](https://www.docker.com/get-started) if you haven’t already and run `docker compose up` from the root of this project in a terminal. Your changes will be visible on <http://localhost:4000/>. Any changes you make to the slides will be reflected in your browser—there’s no need to restart the Docker container. You can hit `ctrl-c` to stop the process.

Once you push your changes the slides will be published using GitHub Pages automatically (see the link at the top of the repository).
