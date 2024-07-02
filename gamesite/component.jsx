/**
 * v0 by Vercel.
 * @see https://v0.dev/t/hnolnaOTeGw
 * Documentation: https://v0.dev/docs#integrating-generated-code-into-your-nextjs-app
 */
export default function Component() {
    return (
      <div class="flex flex-col min-h-[100dvh]">
        <header class="bg-background px-4 lg:px-6 h-14 flex items-center shadow">
          <a href="#" class="flex items-center justify-center">
            <i class="h-6 w-6 fa fa-gamepad" />
            <span class="text-lg font-bold">Game Company</span>
          </a>
          <nav class="ml-auto flex gap-4 sm:gap-6">
            <a href="#" class="text-sm font-medium hover:underline underline-offset-4">
              Games
            </a>
            <a href="#" class="text-sm font-medium hover:underline underline-offset-4">
              About
            </a>
            <a href="#" class="text-sm font-medium hover:underline underline-offset-4">
              Contact
            </a>
          </nav>
        </header>
        <main class="flex-1">
          <section class="w-full py-12 md:py-24 lg:py-32 bg-gradient-to-r from-primary to-primary-foreground">
            <div class="container px-4 md:px-6">
              <div class="grid gap-6 lg:grid-cols-[1fr_400px] lg:gap-12 xl:grid-cols-[1fr_600px]">
                <div class="flex flex-col justify-center space-y-4">
                  <div class="space-y-2">
                    <h1 class="text-3xl font-bold tracking-tighter text-primary-foreground sm:text-5xl xl:text-6xl/none">
                      Discover Our Thrilling Games
                    </h1>
                    <p class="max-w-[600px] text-primary-foreground/80 md:text-xl">
                      Immerse yourself in our diverse collection of captivating games, each crafted to provide an
                      unforgettable gaming experience.
                    </p>
                  </div>
                  <div class="flex flex-col gap-2 min-[400px]:flex-row">
                    <a
                      href="#"
                      class="inline-flex h-10 items-center justify-center rounded-md bg-primary-foreground px-8 text-sm font-medium text-primary shadow transition-colors hover:bg-primary/90 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                    >
                      Explore Games
                    </a>
                    <a
                      href="#"
                      class="inline-flex h-10 items-center justify-center rounded-md border border-input bg-background px-8 text-sm font-medium shadow-sm transition-colors hover:bg-accent hover:text-accent-foreground focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                    >
                      Learn More
                    </a>
                  </div>
                </div>
                <img
                  src="/placeholder.svg"
                  alt="Hero"
                  class="mx-auto aspect-video overflow-hidden rounded-xl object-cover sm:w-full lg:order-last lg:aspect-square"
                  width="550"
                  height="550"
                />
              </div>
            </div>
          </section>
          <section id="games" class="w-full py-12 md:py-24 lg:py-32">
            <div class="container px-4 md:px-6">
              <div class="grid grid-cols-1 gap-8 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-3 xl:grid-cols-3">
                <div class="relative overflow-hidden rounded-lg group bg-background">
                  <a href="#" class="absolute inset-0 z-10">
                    <span class="sr-only">View Game</span>
                  </a>
                  <img src="/placeholder.svg" alt="Game 1" class="object-cover w-full h-60" width="400" height="300" />
                  <div class="p-4">
                    <h3 class="text-lg font-semibold md:text-xl">Adventurous Odyssey</h3>
                    <p class="text-sm text-muted-foreground">
                      Embark on an epic journey through a vast and mysterious world.
                    </p>
                    <div class="flex items-center justify-between mt-4">
                      <div class="text-base font-semibold md:text-lg">$19.99</div>
                      <a
                        href="#"
                        class="inline-flex items-center justify-center rounded-md bg-primary px-4 py-2 text-sm font-medium text-primary-foreground shadow transition-colors hover:bg-primary/90 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                      >
                        Play Now
                      </a>
                    </div>
                  </div>
                </div>
                <div class="relative overflow-hidden rounded-lg group bg-background">
                  <a href="#" class="absolute inset-0 z-10">
                    <span class="sr-only">View Game</span>
                  </a>
                  <img src="/placeholder.svg" alt="Game 2" class="object-cover w-full h-60" width="400" height="300" />
                  <div class="p-4">
                    <h3 class="text-lg font-semibold md:text-xl">Galactic Showdown</h3>
                    <p class="text-sm text-muted-foreground">Engage in thrilling space battles and conquer the cosmos.</p>
                    <div class="flex items-center justify-between mt-4">
                      <div class="text-base font-semibold md:text-lg">$24.99</div>
                      <a
                        href="#"
                        class="inline-flex items-center justify-center rounded-md bg-primary px-4 py-2 text-sm font-medium text-primary-foreground shadow transition-colors hover:bg-primary/90 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                      >
                        Play Now
                      </a>
                    </div>
                  </div>
                </div>
                <div class="relative overflow-hidden rounded-lg group bg-background">
                  <a href="#" class="absolute inset-0 z-10">
                    <span class="sr-only">View Game</span>
                  </a>
                  <img src="/placeholder.svg" alt="Game 3" class="object-cover w-full h-60" width="400" height="300" />
                  <div class="p-4">
                    <h3 class="text-lg font-semibold md:text-xl">Mystic Realms</h3>
                    <p class="text-sm text-muted-foreground">
                      Uncover the secrets of a magical world and become a legendary hero.
                    </p>
                    <div class="flex items-center justify-between mt-4">
                      <div class="text-base font-semibold md:text-lg">$14.99</div>
                      <a
                        href="#"
                        class="inline-flex items-center justify-center rounded-md bg-primary px-4 py-2 text-sm font-medium text-primary-foreground shadow transition-colors hover:bg-primary/90 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                      >
                        Play Now
                      </a>
                    </div>
                  </div>
                </div>
                <div class="relative overflow-hidden rounded-lg group bg-background">
                  <a href="#" class="absolute inset-0 z-10">
                    <span class="sr-only">View Game</span>
                  </a>
                  <img src="/placeholder.svg" alt="Game 4" class="object-cover w-full h-60" width="400" height="300" />
                  <div class="p-4">
                    <h3 class="text-lg font-semibold md:text-xl">Cyber Rebellion</h3>
                    <p class="text-sm text-muted-foreground">
                      Dive into a futuristic world and fight for the fate of humanity.
                    </p>
                    <div class="flex items-center justify-between mt-4">
                      <div class="text-base font-semibold md:text-lg">$29.99</div>
                      <a
                        href="#"
                        class="inline-flex items-center justify-center rounded-md bg-primary px-4 py-2 text-sm font-medium text-primary-foreground shadow transition-colors hover:bg-primary/90 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                      >
                        Play Now
                      </a>
                    </div>
                  </div>
                </div>
                <div class="relative overflow-hidden rounded-lg group bg-background">
                  <a href="#" class="absolute inset-0 z-10">
                    <span class="sr-only">View Game</span>
                  </a>
                  <img src="/placeholder.svg" alt="Game 5" class="object-cover w-full h-60" width="400" height="300" />
                  <div class="p-4">
                    <h3 class="text-lg font-semibold md:text-xl">Enchanted Realms</h3>
                    <p class="text-sm text-muted-foreground">
                      Embark on a magical journey and uncover the secrets of an enchanted world.
                    </p>
                    <div class="flex items-center justify-between mt-4">
                      <div class="text-base font-semibold md:text-lg">$16.99</div>
                      <a
                        href="#"
                        class="inline-flex items-center justify-center rounded-md bg-primary px-4 py-2 text-sm font-medium text-primary-foreground shadow transition-colors hover:bg-primary/90 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                      >
                        Play Now
                      </a>
                    </div>
                  </div>
                </div>
                <div class="relative overflow-hidden rounded-lg group bg-background">
                  <a href="#" class="absolute inset-0 z-10">
                    <span class="sr-only">View Game</span>
                  </a>
                  <img src="/placeholder.svg" alt="Game 6" class="object-cover w-full h-60" width="400" height="300" />
                  <div class="p-4">
                    <h3 class="text-lg font-semibold md:text-xl">Tactical Onslaught</h3>
                    <p class="text-sm text-muted-foreground">
                      Command your forces and lead them to victory in intense strategic battles.
                    </p>
                    <div class="flex items-center justify-between mt-4">
                      <div class="text-base font-semibold md:text-lg">$22.99</div>
                      <a
                        href="#"
                        class="inline-flex items-center justify-center rounded-md bg-primary px-4 py-2 text-sm font-medium text-primary-foreground shadow transition-colors hover:bg-primary/90 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:pointer-events-none disabled:opacity-50"
                      >
                        Play Now
                      </a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </main>
        <footer class="bg-muted p-6 md:py-12 w-full">
          <div class="container max-w-7xl grid grid-cols-2 sm:grid-cols-3 md:grid-cols-5 gap-8 text-sm">
            <div class="grid gap-1">
              <h3 class="font-semibold">Company</h3>
              <a href="#">About Us</a>
              <a href="#">Our Team</a>
              <a href="#">Careers</a>
              <a href="#">News</a>
            </div>
            <div class="grid gap-1">
              <h3 class="font-semibold">Games</h3>
              <a href="#">Adventurous Odyssey</a>
              <a href="#">Galactic Showdown</a>
              <a href="#">Mystic Realms</a>
              <a href="#">Cyber Rebellion</a>
              <a href="#">Enchanted Realms</a>
              <a href="#">Tactical Onslaught</a>
            </div>
            <div class="grid gap-1">
              <h3 class="font-semibold">Resources</h3>
              <a href="#">Blog</a>
              <a href="#">Community</a>
              <a href="#">Support</a>
              <a href="#">FAQs</a>
            </div>
            <div class="grid gap-1">
              <h3 class="font-semibold">Legal</h3>
              <a href="#">Privacy Policy</a>
              <a href="#">Terms of Service</a>
              <a href="#">Cookie Policy</a>
            </div>
            <div class="grid gap-1">
              <h3 class="font-semibold">Contact</h3>
              <a href="#">Support</a>
              <a href="#">Sales</a>
              <a href="#">Press</a>
              <a href="#">Partnerships</a>
            </div>
          </div>
        </footer>
      </div>
    )
  }